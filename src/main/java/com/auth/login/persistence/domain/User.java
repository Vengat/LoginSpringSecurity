package com.auth.login.persistence.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {
	
	@Id @GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "USERNAME", unique = true)
	private String username;
	
	@Column(name = "PASSWORD")
    private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "USER_ROLES", 
		joinColumns = {@JoinColumn(name = "USER_ID", referencedColumnName = "ID")},
		inverseJoinColumns = {@JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")}
	)
	private Role role;

	User() {}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return this.id;
	}
    
	public void setUsername(String username) {
		this.username = username;		
	}

	public String getUsername() {
		return this.username;		
	}

	public void setPassword(String password) {
		this.password = password;		
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
//	public List<Role> getRoles() {
//	    return roles;
//	}
//	public void setRoles(List<Role> roles) {
//	    this.roles = roles;
//	}

}
