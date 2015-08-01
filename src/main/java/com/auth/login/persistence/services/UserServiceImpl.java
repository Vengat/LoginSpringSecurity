package com.auth.login.persistence.services;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auth.login.persistence.domain.User;
import com.auth.login.persistence.repository.UserRepository;

@Service
@Repository
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	@Autowired
	private UserRepository userRepository; 

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

}
