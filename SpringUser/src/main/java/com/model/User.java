package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

	private int userId;
	private String userName;
	private String password;

	public int getUserId() {
		return userId;
	}
 
	@Value(value = "111")
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	
    @Value(value = "Usha")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	@Value(value = "xxxx")
	public void setPassword(String password) {
		this.password = password;
	}

	

}
