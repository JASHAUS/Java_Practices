package com.main;

/*Write a Java method to display the middle character of a string. 
a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
*/

import java.util.Scanner;

import com.assignments.MiddleCharacter;

public class MiddleCharacterMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = input.nextLine();
		MiddleCharacter character = new MiddleCharacter();
		System.out.print("The middle character in the string: " + character.middle(str) + "\n");
	}

}
