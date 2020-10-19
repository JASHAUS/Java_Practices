package com.exercise;

//5.	Accept a string, and two indices(integers), and print the substring consisting of all characters inclusive range from ..to . 

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String :");
		String S = input.next();
		System.out.println("Enter the Indices :");
		int start = input.nextInt();
		int end = input.nextInt();
		System.out.println("The substring of string :");
		System.out.println(S.substring(start, end));
	}
}
