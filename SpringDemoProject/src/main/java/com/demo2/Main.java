package com.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.demo2");
              Employee obj = (Employee) applicationContext.getBean("apple");
              System.out.println("Employee Id     : " +obj.getEmpId());
              System.out.println("Employee Name   : "+obj.getEmpName());
              System.out.println("Employee DoorNo : " +obj.getAddress().getDoorNo());
              System.out.println("Employee City   : "+obj.getAddress().getCity());
              System.out.println("Employee State  : "+obj.getAddress().getState());
	}

}
