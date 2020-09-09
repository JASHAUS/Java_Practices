package com.main;

	
	import java.util.*;  
	public class SwapNumber {  
	    public static void main(String[] args) {  
	       int num1;
	       int num2;
	       int temp;
	       Scanner scan = new Scanner(System.in);  
	       System.out.println("Enter the value of Number1 and Number2 :");  
	       num1= scan.nextInt();  
	       num2 = scan.nextInt();  
	       System.out.println("before swapping numbers: "+num1 +"  "+num2);  
	       temp = num1;  
	       num1= num2;  
	       num2 = temp;  
	       System.out.println("After swapping: "+num1 +"   " + num2);  
	       System.out.println( );  
	    }    
	}  


