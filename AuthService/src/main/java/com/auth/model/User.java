package com.auth.model;



import com.auth.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_info")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int userID;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false, unique = true)
    String email;
	@Column(nullable = false)
    String mobileNumber;
	@Column(nullable = false)
    int countryCode;
	@Column(nullable = false)
    String address;
	@Column(nullable = false)
    String password;
	@Column(nullable = false)
    String rePassword;
	
	@Column(nullable = false)
    boolean mailDelivery;
	@Column(nullable = false)
    boolean notifications;
	
	@Column(nullable = false)
	private Role role;
	
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	public boolean isMailDelivery() {
		return mailDelivery;
	}
	public void setMailDelivery(boolean mailDelivery) {
		this.mailDelivery = mailDelivery;
	}
	public boolean isNotifications() {
		return notifications;
	}
	public void setNotifications(boolean notifications) {
		this.notifications = notifications;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	


    
    
}