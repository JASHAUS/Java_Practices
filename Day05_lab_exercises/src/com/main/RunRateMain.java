package com.main;

/*Given total runs scored and  total overs faced as the input. Write a program to calculate the run rate with the formula,
Run rate= total runs scored/total overs faced.
Use BufferedReader class to get the inputs from user.
 This program may generate Arithmetic Exception / NumberFormatException. Use exception handling mechanisms to handle this exception. Use a single catch block. In the catch block, print the class name of the exception thrown.

*/
import com.exercises.RunRate;

public class RunRateMain {
	public static void main(String[] args) {
		RunRate obj = new RunRate();
		obj.input();
		obj.compute();
	}
}
