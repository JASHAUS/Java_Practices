package com.main;

//Java Stream Example: Find Max and Min Student Mark

import java.util.ArrayList;
import java.util.List;

import com.StudentMax;

public class StudentMaxMain {
	
	
	 public static void main(String[] args) {  
	        List<StudentMax> studentList = new ArrayList<StudentMax>();  
	        
	        studentList.add(new StudentMax(1,"A",50f));  
	        studentList.add(new StudentMax(2,"B",30f));  
	        studentList.add(new StudentMax(3,"C",48.5f));  
	        studentList.add(new StudentMax(4,"D",60f));  
	        studentList.add(new StudentMax(5,"E",90f));  
	        
	        StudentMax highMark1 = studentList.stream()  
	                        .max((mark1,mark2)->   
	                        mark1.marks > mark2.marks ? 1: -1).get();  
	          
	        System.out.println(highMark1.marks);  
	         
	        StudentMax highMark2 = studentList.stream()  
	                .max((mark1,mark2)->   
	                mark1.marks < mark2.marks ? 1: -1).get();  
	        System.out.println(highMark2.marks);  
	          
	    }  

}
