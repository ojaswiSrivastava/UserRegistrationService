package com.jkt.main.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkt.main.model.User;
import com.jkt.main.service.UserService;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserService userService; 
	
	@PostMapping(value = "/register")
	public ResponseEntity<String> register(@RequestBody @Valid User user) {
		
		return userService.register(user);	
	}	

}
