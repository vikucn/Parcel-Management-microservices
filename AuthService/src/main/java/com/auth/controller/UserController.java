package com.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.dto.LoginRequest;
import com.auth.dto.LoginResponse;
import com.auth.model.User;
import com.auth.service.UserService;





@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.insert(user);
	}
	
	@PostMapping("/login")
	  public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
      User user = userService.findByEmail(loginRequest.getEmail());

      if (user == null) {
          return ResponseEntity.status(404).body("User not found!");
      }

      if (!user.getPassword().equals(loginRequest.getPassword())) {
          return ResponseEntity.status(401).body("Invalid credentials!");
      }

      LoginResponse response = new LoginResponse(
              "Login successful!",
              user.getName(),
              user.getEmail(),
              user.getRole()
      );

      return ResponseEntity.ok(response);
  }
	
	@GetMapping("/{userID}/exists")
	public ResponseEntity<Boolean> checkUserExists(@PathVariable int userID) {
	    boolean exists = userService.existsById(userID);
	    return ResponseEntity.ok(exists);
	}

}
