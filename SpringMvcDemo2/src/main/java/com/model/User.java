package com.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	@NotEmpty(message = "This field is mandatory" )
	private String userName;
	@NotEmpty(message = "This field is mandatory")
	@Size(min=5,max=8,message = "The password should be 5 to 8 characters")
	private String password;
	private int userId;

	public User() {
		super();
	
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
