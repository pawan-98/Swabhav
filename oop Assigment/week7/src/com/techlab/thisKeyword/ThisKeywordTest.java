package com.techlab.thisKeyword;

public class ThisKeywordTest {
	public static void main(String args[]) {

		StudentInfo s1 = new StudentInfo(1, "pawan", 5500f);
		StudentInfo s2 = new StudentInfo(2, "amit", 9500f);
		display(s1);
		display(s2);

	}

	public static void  display(StudentInfo student) {
		System.out.println("Roll number:- " + student.getRollNo() + " Name:- " + student.getName() + " Fees:- " + student.getName());
		
	
	}
}
