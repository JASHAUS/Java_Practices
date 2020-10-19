package com.main;

//4. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.

import com.assignments.ExerciseClass;

public class ExerciseClassMain {
	public static void main(String[] args) {

		ExerciseClass exerciseClass = new ExerciseClass(11, "Chennai", "LG");
		System.out.println("Room No : " + exerciseClass.getRoomNo());
		System.out.println("Room Area : " + exerciseClass.getRoomArea());
		System.out.println("AcMachine : " + exerciseClass.getAcMachine());

	}

}
