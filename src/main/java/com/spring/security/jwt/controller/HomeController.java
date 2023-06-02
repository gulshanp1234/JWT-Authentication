package com.spring.security.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String home() {
		String text = "this is private home";
		text += "only authenticated user can access it";
		return text;
	}
	
	@RequestMapping(value="/getuser", method= RequestMethod.GET)
	public String getUser() {
	
		return "{user: Gulshan}";
	}

}
