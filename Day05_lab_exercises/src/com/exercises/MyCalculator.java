package com.exercises;


public class MyCalculator {
	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0 )
			throw new Exception("n and p should be non-negative");
		else if(n==0 || p == 0){
			throw new Exception("n and p should be not be zero");
		}
		return (int) Math.pow((double) n, (double) p);
	}
	
	}




