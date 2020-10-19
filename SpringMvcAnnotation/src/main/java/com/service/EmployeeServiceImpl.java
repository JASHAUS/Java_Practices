package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Employee;

//jdbc

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee addEmployee(Employee employee) {
		String var = employee.getEmpName();
		employee.setEmpName(var + " " + "from service");
		return employee;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		Employee employee = null;
		if (empId == 10) {
			employee = new Employee(10, "Ten", 1010f);

		}
		if (empId == 20) {
			employee = new Employee(20, "Twenty", 2020f);
		}

		return employee;
	}

	@Override
	public List<Employee> listEmployee() {

		Employee employee1 = new Employee(100, "hello", 1000f);
		Employee employee2 = new Employee(200, "world", 2000f);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		return null;
	}

}
