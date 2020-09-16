package com.exercises;

public class WrapperClass {

	public static void main(String[] args) {
		System.out.println("String: " + args[0]);
		System.out.println("Integer: " +args[1]);
		//wrapper class
		int val = Integer.parseInt(args[1]);
		System.out.println(val);
		
	}

}
