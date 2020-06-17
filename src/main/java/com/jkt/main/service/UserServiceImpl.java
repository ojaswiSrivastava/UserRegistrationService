package com.jkt.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jkt.main.dao.UserRepository;
import com.jkt.main.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
    @Autowired
	private UserRepository userRepository;

	@Override
	public ResponseEntity<String> register(User user) {
		
		User userExists = userRepository.findByEmail(user.getEmail());
				
		if (userExists != null) {
			return new ResponseEntity<>(
      	          "Oops!  There is already a user registered with the email provided.", 
      	          HttpStatus.BAD_REQUEST);  
			
		}	
		else {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userRepository.save(user);
			return new ResponseEntity<>(
					"Registration Sucessful", 
	        	      HttpStatus.OK); 
		}
	}

}
