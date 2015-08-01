package com.auth.login.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String loginForm(Model model) {
		logger.info("In login method");
		return "login";
	}
	
	@RequestMapping(value = "/loginfailed", method=RequestMethod.GET)
	public String loginError(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value = "/logout", method=RequestMethod.GET)
	public String logOut(Model mode) {
		return "login";
	}

}
