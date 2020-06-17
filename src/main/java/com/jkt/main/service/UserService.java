package com.jkt.main.service;

import org.springframework.http.ResponseEntity;

import com.jkt.main.model.User;

public interface UserService {
	
	public ResponseEntity<String> register(User user);
}
