package com.auth.login.persistence.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.login.persistence.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
