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
    curl -X GET "http://localhost:8080/entries/search/findEntriesByName?name=Jane"
    curl -X GET "http://localhost:8080/entries/search/findEntriesByName?name=jane"
    curl -X GET "http://localhost:8080/entries/search/findEntriesByNameLike?name=Ja%25"
    curl -X GET "http://localhost:8080/entries/search/findEntriesByNameLikeIgnoreCase?name=ja%25"
```


