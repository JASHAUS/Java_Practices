package com.exercises;

import java.util.Scanner;

public class Triangle extends Shape {

	double area;

	public void getData() {
		System.out.println("Enter the two value : ");
		Scanner scan = new Scanner(System.in);
		length = scan.nextDouble();
		breadth = scan.nextDouble();
	}

	public void displayArea() {
		area = (0.5 * length * breadth);
		System.out.println("Area is " + area);
	}
}
