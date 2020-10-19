package com.main;

//Write a Java method to count all vowels in a string. 

import java.util.Scanner;

import com.assignments.CountVowels;

public class CountVowelsMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the string: ");
		String str = scan.nextLine();
		CountVowels countVowels = new CountVowels();
        
		System.out.print("Number of  Vowels in the string: " + CountVowels.count_Vowels(str) + "\n");
	}
}
