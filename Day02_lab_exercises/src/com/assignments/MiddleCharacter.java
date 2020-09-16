package com.assignments;

/*Write a Java method to display the middle character of a string. 
a) If the length of the string is odd there will be two middle characters.
b) If the length of the string is even there will be one middle character.
*/

public class MiddleCharacter {
	public static String middle(String str) {
		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		return str.substring(position, position + length);
	}

}
