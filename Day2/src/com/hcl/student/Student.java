package com.hcl.student;



public class Student {
	int studentNumber1;
	String firstName1;
	String lastName1;
	int age1;
	char gender1;
	float englishMark1;
	float mathsMark1;
	String majorSubject1;
	
	int studentNumber2;
	String firstName2;
	String lastName2;
	int age2;
	char gender2;
	float englishMark2;
	float mathsMark2;
	String majorSubject2;
	
	public void display1() {
		System.out.println("StudentNumber:" + studentNumber1);
		System.out.println("FirstName: " + firstName1);
    	System.out.println("LastName: " + lastName1);
		System.out.println("Age:" + age1);
		System.out.println("Gender:" + gender1);
    	System.out.println("EnglishMark:" + englishMark1);
		System.out.println("MathsMark:" + mathsMark1);
		System.out.println("MajorSubject:" + majorSubject1);
		System.out.println("-------------------------------");
		
	}
	public void display2() {
		System.out.println("StudentNumber:" + studentNumber2);
		System.out.println("FirstName: " + firstName2);
		System.out.println("LastName: " + lastName2);
		System.out.println("Age:" + age2);
		System.out.println("Gender:" + gender2);
		System.out.println("EnglishMark:" + englishMark2);
		System.out.println("MathsMark:" + mathsMark2);
	  	System.out.println("MajorSubject:" + majorSubject2);
	  	System.out.println("-------------------------------");
	}
	



	public String getStudentFullName(String firstName1, String lastName1) {
		String fullName = this.firstName1 + " " + this.lastName1;
		System.out.println("FullNameStudent1:" + fullName);
		return fullName;
	}

	public int getStudentAge(int age) {
		int Age = this.age1;
		System.out.println("StudentAge1:" + Age);
		return Age;
	}

	public float getTotalMarks(float englishMark, float mathsMark) {
		float totalMarks = this.englishMark1 + this.mathsMark1;
		System.out.println("TotalMarksStudent1:" + totalMarks);
		return totalMarks;

	}

	public float getAverageMark(float englishMark, float mathsMark) {
		float averageMark = this.getTotalMarks(englishMark, mathsMark) / 2;
		System.out.println("AverageMarkStudent1:" + averageMark);
		return averageMark;
	}
	
	public String getStudentFullName2(String firstName2, String lastName2) {
		String fullName = this.firstName2 + " " + this.lastName2;
		System.out.println("FullNameStudent2:" + fullName);
		return fullName;
	}

	public int getStudentAge2(int age) {
		int Age = this.age2;
		System.out.println("StudentAge2:" + Age);
		return Age;
	}

	public float getTotalMarks2(float englishMark, float mathsMark) {
		float totalMarks = this.englishMark2 + this.mathsMark2;
		System.out.println("TotalMarksStudent2:" + totalMarks);
		return totalMarks;

	}

	public float getAverageMark2(float englishMark, float mathsMark) {
		float averageMark = this.getTotalMarks2(englishMark, mathsMark) / 2;
		System.out.println("AverageMarkStudent2:" + averageMark);
		return averageMark;
	}

}
