package com.exercises;

import java.util.Scanner;


public class MyCalculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 1;
		for (int i = 2; i <= (n / 2); i++) {
			if (n % i == 0)
				sum += i;
		}
		if (n != 1)
			return sum + n;
		else
			return sum;
	}

	public static class InterfaceSolution {

		public static void  main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			AdvancedArithmetic myCalculator = new MyCalculator();
			int sum = myCalculator.divisorSum(n);
			System.out.println("I implemented: AdvancedArithmetic\n" + sum);
		}
	}
}
