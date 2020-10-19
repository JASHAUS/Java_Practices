package com.exercises;

import java.util.Scanner;

public class Rectangle extends Shape {
	double area;

	public void getData() {
		System.out.println("Enter the two values : ");
		Scanner scan = new Scanner(System.in);
		length = scan.nextDouble();
		breadth = scan.nextDouble();

	}

	public void displayArea() {
		area = length * breadth;
		System.out.println("Area is " + area);
	}
}
