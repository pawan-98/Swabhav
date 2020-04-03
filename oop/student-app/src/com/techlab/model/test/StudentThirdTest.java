package com.techlab.model.test;

import com.techlab.model.Student;

public class StudentThirdTest {
	
	public static void main(String args[]) {
		Student s1 = new Student(101,"abc");

		Student s2 = new Student(101,"xyz");

		Student s3 = new Student(101,"lmno",8.0f);
		

	System.out.println("Count:- "+Student.headCount());
	
	
	}

	
}
