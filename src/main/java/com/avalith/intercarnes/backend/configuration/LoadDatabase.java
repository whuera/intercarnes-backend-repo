package com.avalith.intercarnes.backend.configuration;

import com.avalith.intercarnes.backend.entity.CredentialsUser;
import com.avalith.intercarnes.backend.entity.Person;
import com.avalith.intercarnes.backend.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PersonRepository personRepository) {

        return args -> {
            //CredentialsUser credentialsUser = new CredentialsUser("user","123");
            Person person = new Person();
            person.setFirstName("Demo");
            person.setLastName("pepon");
            person.setEmail("a@a.com");

            //person.setCredentialsUser(credentialsUser);
            //log.info("Preloading " + personRepository.save(person));
            //log.info("Preloading " + personRepository.save(new Person("Bilbo Baggins", "burglar", "mail@mail.com")));
            //log.info("Preloading " + personRepository.save(new Person("Frodo Baggins", "thief", "mail@mail.com")));


        };
    }
}