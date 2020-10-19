package com.exercises;

/*Write a program to create a class Number  which implements Runnable.
Run method displays the multiples of a number accepted as a parameter.
In main create three objects - first object should display the multiples of 2, second should display the multiples of 5 and third should display the multiples of 8. Display appropriate message at the beginning and ending of thread. The main thread should wait for the first object to complete.
Display the status of threads before the multiples are displayed and after completing the multiples.
*/
public class ThreadMultiply {

	public static void main(String[] args) {
		Runnable r1 = new Runnable1();
		Thread t1 = new Thread(r1);
		Runnable r2 = new Runnable2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new Runnable3();
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}
}

class Runnable3 implements Runnable {

	public void run() {
		System.out.println("Thread3 is started");
		for (int i = 0; i < 80; i++) {
			if (i % 8 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Thread3 is ended");
	}
}

class Runnable2 implements Runnable {

	public void run() {
		System.out.println("Thread2 is started");
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Thread2 is ended");
	}
}

class Runnable1 implements Runnable {

	public void run() {
		System.out.println("Thread1 is started");
		for (int i = 0; i <= 50; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Thread1 is ended");
	}
}