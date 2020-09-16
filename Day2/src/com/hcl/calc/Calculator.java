package com.hcl.calc;

public class Calculator {

	public void addition(float number1, float number2) {
		float add = number1 + number2;
		System.out.println("Addition of two numbers: " + add);
	}

	public void subtraction(float number1, float number2) {
		float subtract = number1 - number2;
		System.out.println("Subtraction of two numbers: " + subtract);
	}

	public void multiply(float number1, float number2) {
		float multiply = number1 * number2;
		System.out.println("Multiplication of two numbers: " + multiply);
	}

	public void division(float number1, float number2) {
		float divide = number1 / number2;
		System.out.println("Division of two numbers: " + divide);
	}

}
