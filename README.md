# phonebook-service

* This is a sample Spring Boot microservice (application).
* Phonebook microservice exposes phonebook entries and other phonebook management functionalities.

## REST example queries

* Get all entries, e.g.

```
    curl -X GET "http://localhost:8080/entries"
```


* Get entry with id=1, e.g.

```
    curl -X GET "http://localhost:8080/entries/1"
```


* Create a new entry, e.g.

```
    curl -X POST -H "Content-Type: application/json" -d '{
        "name": "Neven",
        "number": "416-555-1111",
        "type": "Mobile",
        "notes": "N/A"
    }' "http://localhost:8080/entries"
```

* Search for entries, e.g.

```
    curl -X GET "http://localhost:8080/entries/search/by-name?name=Jane"
    curl -X GET "http://localhost:8080/entries/search/by-name-ignore-case?name=jane"
    curl -X GET "http://localhost:8080/entries/search/by-partial-name?name=Ja%25"
    curl -X GET "http://localhost:8080/entries/search/by-partial-name-ignore-case?name=ja%25"
```

## Spring Boot Actuator

The Spring Boot Actuator provides useful insights into Spring Boot application, e.g. [http://localhost:8080/admin] (http://localhost:8080/admin)

* General information about application, e.g. [http://localhost:8080/admin/info] (http://localhost:8080/admin/info)
* Collected counters and metrics, e.g. [http://localhost:8080/admin/metrics] (http://localhost:8080/admin/metrics)
* Tracing information, e.g. [http://localhost:8080/admin/trace] (http://localhost:8080/admin/trace)
* Thread dump, e.g. [http://localhost:8080/admin/dump] (http://localhost:8080/admin/dump)
* Environment variables, e.g. [http://localhost:8080/admin/env] (http://localhost:8080/admin/env)
* Health indicators, e.g. [http://localhost:8080/admin/health] (http://localhost:8080/admin/health)
* URL mappings, e.g. [http://localhost:8080/admin/mappings] (http://localhost:8080/admin/mappings)
* Spring Beans, e.g. [http://localhost:8080/admin/beans] (http://localhost:8080/admin/beans)


