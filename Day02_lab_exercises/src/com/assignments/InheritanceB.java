package com.assignments;

//5. Create class named as ‘a’ and create a sub class ‘b’. Which is extends from class ‘a’. And use these classes in ‘inherit’ class.

public class InheritanceB extends InheritanceA {

	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public static void main(String args[]) {
		int a = 20, b = 10;


		InheritanceB inherit = new InheritanceB();
		inherit.addition(a, b);
		inherit.Subtraction(a, b);
		inherit.multiplication(a, b);
	}

}
