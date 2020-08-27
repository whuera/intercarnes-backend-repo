package com.avalith.intercarnes.backend.service;

import com.avalith.intercarnes.backend.entity.Person;
import com.avalith.intercarnes.backend.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public Person create(Person person){ return personRepository.save(person); }
    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }
    public Optional<Person> getPersonById(Long id){return  personRepository.findById(id);}
    public Person getPersonByCuit(String cuit) { return personRepository.getPersonByCuit(cuit); }

}
