package com.hcl.student;

public class Main1 {

	public static void main(String[] args) {
		Student student = new Student();
		student.studentNumber1 = 01;
		student.firstName1 = "Usha";
		student.lastName1 = "J";
		student.age1 = 12;
		student.gender1 = 'F';
		student.englishMark1 = 50.00f;
		student.mathsMark1 = 40.00f;
		student.majorSubject1 = "CSE";
  
		student.display1();
		
		System.out.println("------The Student1 Details-----");
		student.getStudentFullName(student.firstName1, student.lastName1);
		student.getStudentAge(student.age1);
//		student.getTotalMarks(student.englishMark1, student.mathsMark1);
		student.getAverageMark(student.englishMark1, student.mathsMark1);

		student.studentNumber2 = 02;
		student.firstName2 = "Ashok";
		student.lastName2 = "K";
		student.age2 = 11;
		student.gender2 = 'M';
		student.englishMark2 = 40.00f;
		student.mathsMark2 = 60.00f;
		student.majorSubject2 = "ECE";
		
		System.out.println("------------------------------");
		student.display2();
		
		
		
		System.out.println("------The Student2 Details-----");
		student.getStudentFullName2(student.firstName2, student.lastName2);
		student.getStudentAge2(student.age2);
//		student.getTotalMarks2(student.englishMark1, student.mathsMark1);
		student.getAverageMark2(student.englishMark2, student.mathsMark2);
		

		if (student.gender1 == 'M' || student.gender2 == 'M') {
			System.out.println("The Current Student is Male");
		} else {
			System.out.println("The Current Student is female");
		}
		if (student.majorSubject1 == "CSE" || student.majorSubject2 == "CSE") {
			System.out.println("The student choose CS as a major subject");
		} else {
			System.out.println("The student choose other subject as a major subject");
		}
	}
}
