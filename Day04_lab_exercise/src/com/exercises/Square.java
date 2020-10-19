package com.exercises;

import java.util.Scanner;

public class Square extends Shape {
	double area;

	public void getData() {
		System.out.println("Enter the value : ");
		Scanner scan = new Scanner(System.in);
		length = scan.nextDouble();
//		breadth = scan.nextDouble();

	}

	public void displayArea() {
		area = length * length;
		System.out.println("Area is " + area);
	}

}
