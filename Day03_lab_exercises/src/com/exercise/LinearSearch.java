package com.exercise;

//4.	write a Java program to search for an element of an integer array of 10 elements.

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]) {
		int elements, number1, search, array[];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements");
		number1 = input.nextInt();
		array = new int[number1];

		System.out.println("Enter those " + number1 + " elements");

		for (elements = 0; elements < number1; elements++)
			array[elements] = input.nextInt();

		System.out.println("Enter value to find");
		search = input.nextInt();

		for (elements = 0; elements < number1; elements++) {
			if (array[elements] == search) {
				System.out.println(search + " is present at location " + (elements + 1) + ".");
				break;
			}
		}
		if (elements == number1)
			System.out.println(search + " isn't present in array.");
	}
}
