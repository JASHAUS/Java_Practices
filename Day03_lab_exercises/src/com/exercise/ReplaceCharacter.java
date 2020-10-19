package com.exercise;

//2.	Write a Java program to replace all the 'd' occurrence characters with ‘h’ characters in each string.

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = input.nextLine();
		String new_str = str.replace('d', 'h');
		System.out.println("Original string: " + str);
		System.out.println("New String: " + new_str);
	}
}
