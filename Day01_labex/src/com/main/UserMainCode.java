package com.main;

public class UserMainCode {
	public static int checkSum(int number) {
		int num1;
		int sum = 0;
		int out;
		while (number != 0) {
			num1 = number % 10;
			if (num1 % 2 != 0) {
				sum = sum + num1;
			}
			number = number / 10;
		}
		if (sum % 2 == 0) {
			out = -1;
		} else {
			out = 1;
		}

		return number;

	}

}
