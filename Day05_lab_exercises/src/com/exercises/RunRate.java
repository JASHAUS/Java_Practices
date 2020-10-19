package com.exercises;

import java.util.Scanner;

public class RunRate {
	Scanner scan = new Scanner(System.in);
	int runs, balls;
	float runRate;

	public void input() {
		try {
			System.out.println("Enter total runs Scored: ");
			runs = scan.nextInt();
			System.out.println("Enter total over ");
			balls = scan.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Error Code: " + e);
			System.exit(0);
		}
	}

	public void compute() {
		runRate = runs / balls;
		System.out.println("Score is " + runs + " runs in " + balls + " balls with the Run Rate of " + runRate
				+ " runs per over.");
	}
}
