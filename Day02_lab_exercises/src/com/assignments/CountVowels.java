package com.assignments;

//Write a Java method to count all vowels in a string. 

public class CountVowels {

	public static int count_Vowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
}
