package com.exercises;

import java.util.ArrayList;

import com.employee.Employee;

public class SearchEmployee {

	public static void main(String[] args) {
		
		String givenEmpName = "hussian2";
   ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee(1,"hussain1"));
        empList.add(new Employee(2,"hussain2"));
        empList.add(new Employee(3,"hussain3"));
       for (Employee currEmp : empList)  
               {                       if(currEmp.name==givenEmpName)  {             
            	   System.out.println("Emp name is===>>"+currEmp.name);
                  }  
               else{
            	System.out.println("No record found");   
               } }
               }
}

