package com.exercises;

import java.util.Scanner;

public class BiggestNumber {
	private static Scanner scan;

	public static void main(String[] args) {
		int number1, number2, number3;
		scan = new Scanner(System.in);
		System.out.print("Enter the first number:");
		number1 = scan.nextInt();
		System.out.print("Enter the second number:");
		number2 = scan.nextInt();
		System.out.print("Enter the third number:");
		number3 = scan.nextInt();
		if (number1 > number2 && number1 >number3) {
			System.out.println("Largest number is:" +number1);
		} else if (number2 >number3) {
			System.out.println("Largest number is:" + number2);
		} else {
			System.out.println("Largest number is:" + number3);
		}

	}
}
