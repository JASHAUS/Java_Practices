package com.main;

/*10.	I have created a class Calculator inside a package name com.hcl

package com.hcl;
public class Calculator {
   public int add(int a, int b){
	return a+b;
   }
}
how to use add method from another package.*/


import com.exercise.Calculator;

public class CalcualtorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int temp = calculator.add(5, 5);
		System.out.println("The addition of two number is : " + temp);
		
	}

}
