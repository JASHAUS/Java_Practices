package com.main;

/*Consider the below code and you must add a ‘bark method to the Dog class, then modify the main method accordingly so that the code prints the following lines:
I am walking
I am eating
I am barking
*/

public class Inheritance {
	public static class Animal {
		public void walk() {
			System.out.println("I am walking");
		}
	}

	public static class Dog extends Animal {
		public void eat() {
			System.out.println("I am eating");
		}

		public void bark() {
			System.out.println("I am barking");
		}
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();
	}

}