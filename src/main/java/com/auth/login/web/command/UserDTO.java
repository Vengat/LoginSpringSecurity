package com.auth.login.web.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDTO {
	
	private static Logger logger = LoggerFactory.getLogger(UserDTO.class);
	
	@NotEmpty
	@Size(min = 1, max = 20)
	@NotNull
	private String j_username;
	
	@NotEmpty
	@Size(min = 1, max = 20)
    @NotNull
	private String j_password;

	public String getJ_username() {
		return j_username;
	}

	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}

	public String getJ_password() {
		return j_password;
	}

	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}

}
