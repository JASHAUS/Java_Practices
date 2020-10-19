package com.main;

/*You are given a partially completed code in the editor. Modify the code so that the code prints the following text:
Hello I am a motorcycle, I am a cycle with an engine.
My ancestor is a cycle who is a vehicle with pedals.
*/

public class Snippet {
	public static class Cycle {
		String define_me() {

			return "a vehicle with pedals.";
		}
	}

	public static class Bike extends Cycle {
		String define_me() {
			return "a cycle with an engine.";
		}

		public Bike() {
			System.out.println("Hello I am a Motorcycle, I am " + define_me());
			Cycle cycle = new Cycle();
			String temp = cycle.define_me();

			System.out.println("My ancestor is a cycle who is " + temp);
		}

	}

}
