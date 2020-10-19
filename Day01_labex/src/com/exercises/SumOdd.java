package com.exercises;

import java.util.Scanner;

import com.main.UserMainCode;

public class SumOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sum = UserMainCode.checkSum(number);
		if (sum == 1) {
			System.out.println("The sum of the odd digits are odd");

		}else {
			System.out.println("The sum of the odd digits are even");
		}

	}

}
