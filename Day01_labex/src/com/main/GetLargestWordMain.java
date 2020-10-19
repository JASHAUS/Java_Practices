package com.main;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.exercises.GetLargestWord;

public class GetLargestWordMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
	 
		String output = GetLargestWord.lengthiestString(s1);
		System.out.println(output);
	}

}
