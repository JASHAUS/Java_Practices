package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/demo1/spring-config.xml");
		Employee employee = (Employee) context.getBean("employee"); 
		employee.setEmpId(51887288);
		employee.setEmpName("Usha");
		System.out.println("Hai "+ employee.getEmpName());
		System.out.println("Your Sapid is : " +employee.getEmpId());
	}
}
