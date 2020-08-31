package com.avalith.intercarnes.backend.repository;

import com.avalith.intercarnes.backend.entity.Cage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CageRepository extends JpaRepository<Cage, Long>{}

