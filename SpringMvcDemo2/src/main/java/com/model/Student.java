package com.model;

public class Student {
	private int studNo;
	private String studentName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studNo, String studentName) {
		super();
		this.studNo = studNo;
		this.studentName = studentName;
	}
	public int getStudNo() {
		return studNo;
	}
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
