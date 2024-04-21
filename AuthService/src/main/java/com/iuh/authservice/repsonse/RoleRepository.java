package com.iuh.authservice.repsonse;

import com.iuh.authservice.entity.ERole;
import com.iuh.authservice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
