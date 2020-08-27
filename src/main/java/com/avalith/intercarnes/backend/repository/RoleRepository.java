package com.avalith.intercarnes.backend.repository;

import com.avalith.intercarnes.backend.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
