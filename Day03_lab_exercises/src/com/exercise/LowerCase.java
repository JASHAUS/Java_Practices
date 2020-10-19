package com.exercise;

import java.util.Scanner;

//1.	Write a Java program to convert all the characters in a string to lowercase.

public class LowerCase {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = input.nextLine();
		String lowerStr = str.toLowerCase();

		// Display the two strings for comparison.
		System.out.println("Original String: " + str);
		System.out.println("String in lowercase: " + lowerStr);
	}
}
