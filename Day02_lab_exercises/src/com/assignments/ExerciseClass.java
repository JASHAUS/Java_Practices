package com.assignments;

//4. Write a program to create a room class, the attributes of this class is roomno, roomtype, roomarea and ACmachine. In this class the member functions are setdata and displaydata.

public class ExerciseClass {
	private int roomNo;
	private String roomArea;
	private String acMachine;

	public ExerciseClass() {
		super();
	}

	public ExerciseClass(int roomNo, String roomArea, String acMachine) {
		super();
		this.roomNo = roomNo;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getAcMachine() {
		return acMachine;
	}

	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}

}
