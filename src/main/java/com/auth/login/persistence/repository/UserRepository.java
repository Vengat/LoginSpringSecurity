package com.auth.login.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.login.persistence.domain.User;

/**
 * 
 * @author vramanan
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
