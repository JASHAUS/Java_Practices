package com.main;


//Java Stream Example : Filtering Collection by using Stream

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		// Adding Products
		employeeList.add(new Employee(1, "AAA", 25000f));
		employeeList.add(new Employee(2, "BBB", 30000f));
		employeeList.add(new Employee(3, "CCC", 28000f));
		employeeList.add(new Employee(4, "DDD", 28000f));
		employeeList.add(new Employee(5, "EEE", 90000f));

		List<Float> employeeSalaryList = employeeList.stream()
				.filter(p -> p.salary > 30000) 
				.map(p -> p.salary) 
				.collect(Collectors.toList());
		System.out.println(employeeSalaryList);
	}

}
