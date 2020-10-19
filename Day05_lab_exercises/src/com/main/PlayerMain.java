package com.main;

public class PlayerMain {
	public String validate(String n,int p) throws Exception {
		if (p < 16)
			throw new Exception("Custom Exception : Invalid AgeRange Exception");

		else {
			System.out.println("Player Name :"+n);
			System.out.println("Player Age :" + p);
		}
		return "Thank you";
	}
}
