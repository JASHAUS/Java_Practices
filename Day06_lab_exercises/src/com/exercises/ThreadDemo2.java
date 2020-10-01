package com.exercises;

/*Rewrite the earlier program so that, 
now the class DemoThread1 instead of implementing from Runnable interface, will now extend from Thread class.
*/
public class ThreadDemo2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());

		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
			System.out.println("Running child Thread in loop");
		}

	}

	public static void main(String[] args) {
		ThreadDemo2 runnable = new ThreadDemo2();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();

	}
}
