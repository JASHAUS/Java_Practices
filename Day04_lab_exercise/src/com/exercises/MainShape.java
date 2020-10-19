package com.exercises;

//Find the area of shape using inheritance

import java.util.Scanner;

public class MainShape {
	public static void main(String[] args) {
		int select;
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Area of Triangle\n2.Area of Rectangle\n3.Area of Square");
		select = scan.nextInt();
		switch (select) {
		case 1:
			System.out.println("Area of triangle:");
			Triangle tri = new Triangle();
			tri.getData();
			tri.displayArea();
			break;

		case 2:
			System.out.println("Area of triangle:");
			Rectangle rect = new Rectangle();
			rect.getData();
			rect.displayArea();
			break;

		case 3:
			System.out.println("Area of triangle:");
			Square sq = new Square();
			sq.getData();
			sq.displayArea();
			break;
		default:
			System.out.println("Wrong choice");
			break;

		}
	}

}
