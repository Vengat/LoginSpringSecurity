package com.auth.login.persistence.services;

import com.auth.login.persistence.domain.User;

public interface UserService {
	
	public User findByUsername(String username);

}
