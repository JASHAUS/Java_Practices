package com.exercises;

import java.util.Scanner;

public class Shape {

	public double length;
	public double breadth;

	Shape() {
		length = 0;
		breadth = 0;
	}

	public void getData() {
		System.out.println("Enter the two values : ");
		Scanner scan = new Scanner(System.in);
		length = scan.nextDouble();
		breadth = scan.nextDouble();
	}

	public void displayArea() {

	}
}
