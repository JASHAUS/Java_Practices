package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.service.UserService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/config/spring-config.xml");
		User user = (User) context.getBean("user");
		UserService userService = (UserService) context.getBean("hello");
		System.out.println("User Id       : " + user.getUserId());
		System.out.println("User Name     : " + user.getUserName());
		System.out.println("User Password : " + user.getPassword());
		String str = userService.display("Usha !");
		System.out.println(str);

	}

}
