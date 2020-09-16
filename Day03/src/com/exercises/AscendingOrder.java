package com.exercises;

import java.util.Scanner;

public class AscendingOrder {
	private static Scanner scan;

	public static void main(String[] args) {
		int no_of_elements, temp;
		scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		no_of_elements = scan.nextInt();
		int a[] = new int[no_of_elements];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < no_of_elements; i++) {
			a[i] = scan.nextInt();
		}
		for (int i = 0; i < no_of_elements; i++) {
			for (int j = i + 1; j < no_of_elements; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Ascending Order:");
		for (int i = 0; i < no_of_elements - 1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.print(a[no_of_elements - 1]);
	}
}
