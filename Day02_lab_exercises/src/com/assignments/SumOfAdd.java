package com.assignments;

//Your task is to create the class Addition and the required methods so that the code prints the sum of the numbers passed to the function addition.

import java.util.Scanner;

public class SumOfAdd {

	public static void main(String[] args) {

		int num, count, total = 0;

		System.out.println("Enter the value of n:");

		Scanner scan = new Scanner(System.in);
		// nextInt() method reads integer entered by user
		num = scan.nextInt();
		// closing scanner after use
		scan.close();
		for (count = 1; count <= num; count++) {
			total = total + count;

		}

		System.out.println("Sum of first " + num + " natural numbers is: " + total);
	}
}
