package com.exercises;

import java.time.LocalTime;

/*Write a program to assign the current thread to t1. 
Change the name of the thread to MyThread. 
Display the changed name of the thread. Also it should display the current time.
Put the thread to sleep for 10 seconds and display the time again.
*/

public class ThreadName extends Thread {

	public void run() {
		System.out.println("running...");
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		ThreadName t1 = new ThreadName();
		ThreadName t2 = new ThreadName();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());

		t1.start();
		t2.start();

		t1.setName("New Thread ");
		System.out.println("After changing name of t1:" + t1.getName());

		LocalTime time = LocalTime.now();
		System.out.println("Current Ti" + time);
	}
}
