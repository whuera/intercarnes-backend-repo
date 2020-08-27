package com.avalith.intercarnes.backend.repository;

import com.avalith.intercarnes.backend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findAllById(Long id);

    @Query(value = "select p from Person p where p.cuit = :cuit", nativeQuery = true)
    Person getPersonByCuit(@Param("cuit") String cuit);

}
