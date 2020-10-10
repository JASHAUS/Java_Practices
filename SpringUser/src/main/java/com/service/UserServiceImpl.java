package com.service;

import org.springframework.stereotype.Service;

@Service("hello")
public class UserServiceImpl implements UserService {

	@Override
	public String display(String arg) {
		
		return "Welcome " + arg;
	}

}
