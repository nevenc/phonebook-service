package com.example.phonebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class PhonebookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonebookServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner dummyCLR (EntryRepository entries) {
        return args -> {
            Stream.of("John", "Jane", "Jack", "Jill", "Joan", "Jeff", "Jenn", "Jeri", "Jean", "Josh")
                    .forEach(name -> entries.save(new Entry(null,name,null,null, null)));
            entries.findAll().forEach(System.out::println);
        };
    }

}


@RestController
class EntriesController {

    @Autowired
    private EntryRepository entries;

    @RequestMapping(method = RequestMethod.GET, value = "/entries")
    List<Entry> entries() {
        return entries.findAll();
    }

}


interface EntryRepository extends JpaRepository<Entry, Long> {
}

@Entity
class Entry {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String number;
    private String type;
    private String notes;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getNotes() {
        return notes;
    }

    public Entry() {
    }

    public Entry(Long id, String name, String number, String type, String notes) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.type = type;
        this.notes = notes;
    }

    @Override
    public String toString() {

        return "Entry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

}
