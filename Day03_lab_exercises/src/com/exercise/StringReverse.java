package com.exercise;

//9.	Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.

import java.util.Scanner;

public class StringReverse {
	public static void main(String args[]) {
		String initial, rev = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		initial = in.nextLine();
		int length = initial.length();
		for (int i = length - 1; i >= 0; i--)
			rev = rev + initial.charAt(i);
		System.out.println("Reversed string: " + rev);
	}
}
