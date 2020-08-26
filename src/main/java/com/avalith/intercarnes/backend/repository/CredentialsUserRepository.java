package com.avalith.intercarnes.backend.repository;

import com.avalith.intercarnes.backend.entity.CredentialsUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsUserRepository extends JpaRepository<CredentialsUser, Long> {
}


