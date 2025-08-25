package com.auth.dto;

import com.auth.enums.Role;

public class LoginResponse {

	
	private String message;
    private String name;
    private String email;
    private Role role;

    public LoginResponse(String message, String name, String email, Role role) {
        this.message = message;
        this.name = name;
        this.email = email;
        this.role = role;
    }

   
    public String getMessage() {
        return message;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Role getRole() {
        return role;
    }
}
