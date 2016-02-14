package com.example.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SpringBootApplication
public class PhonebookServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonebookServiceApplication.class, args);
    }

}

