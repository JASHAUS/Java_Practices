package com.main;

public class SumOfSquaresMain {

	public static int sumOfSquares(int number) {
		
		int num1 = 0, num2 = 0;
		while (number != 0) {
			num1 = number % 10;
			if ((num1 % 2) == 0) {
				num2 += num1 * num1;
				}
			number /= 10;
		}
	
	System.out.println(num2);
	return 	 num2;
	}}

		
		
	
