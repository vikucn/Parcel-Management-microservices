package com.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.User;
import com.auth.repository.UserRepository;



@Service
public class UserService {
	
@Autowired
private UserRepository userRepository;
    
	public User insert(User user) {

		return userRepository.save(user);
	}

	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}

	public boolean existsById(int userID) {
		
		return userRepository.existsById(userID);
	}

}
