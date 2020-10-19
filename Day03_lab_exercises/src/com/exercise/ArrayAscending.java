package com.exercise;

//3.	write a Java program to sort an integer array of 10 elements in ascending.

public class ArrayAscending {
	public static void main(String[] args) {

		int[] array = new int[] { 9, 2, 5, 7, 1 };
		int temp = 0;

		System.out.println("Elements of original array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
