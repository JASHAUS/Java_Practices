package com.exercises;

import java.util.Scanner;  
	public class Ascii
	{  
	public static void main(String args[])  
	{  
	System.out.print("Enter a character: ");  
	Scanner scan = new Scanner(System.in);  
	char chr = scan.next().charAt(0);  
	int asciiValue = chr;  
	System.out.println("ASCII value of " +chr+ " is: "+asciiValue);  
	}  
	}


