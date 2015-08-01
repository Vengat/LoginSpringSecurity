package com.auth.login.persistence.services;

import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.auth.login.persistence.domain.Role;
import com.auth.login.persistence.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Resource
	private RoleRepository roleRepository;

	@Override
	public Role getRole(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
