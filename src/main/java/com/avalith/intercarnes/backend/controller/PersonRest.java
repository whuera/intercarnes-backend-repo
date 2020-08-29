package com.avalith.intercarnes.backend.controller;

import com.avalith.intercarnes.backend.entity.Person;
import com.avalith.intercarnes.backend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PersonRest {
    @Autowired
    PersonService personService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("persons")
    public ResponseEntity<List<Person>> getPersons(){
        return new ResponseEntity(personService.getAllPerson(), HttpStatus.OK);
    }

    @GetMapping("personsbyid")
    public ResponseEntity<List<Person>> getPersonById(@PathVariable Long id){
        return new ResponseEntity(personService.getPersonById(id), HttpStatus.OK);
    }

    @GetMapping("personsbycuit")
    public ResponseEntity<Person> getPersonByCuit(@PathVariable String cuit){
        return new ResponseEntity(personService.getPersonByCuit(cuit), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        person = personService.create(person);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }
}
