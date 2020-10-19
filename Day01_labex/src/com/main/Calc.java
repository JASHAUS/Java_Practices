package com.main;

import com.exercises.MathCalc;

public class Calc {
	public static void main(String[] args) {
		MathCalc calc = new MathCalc();
		System.out.println(calc.add(20, 4));
		System.out.println(calc.sub(20, 4));
		System.out.println(calc.mul(20, 4));
		System.out.println(calc.div(20, 4));
	}

}
