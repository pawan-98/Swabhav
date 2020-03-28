package com.techlabs.model.test;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String args[]) {
		Student s1 = new Student(101,"abc");
		System.out.println(s1.getCount());

		Student s2 = new Student(101,"xyz");
		System.out.println(s2.getCount());

		Student s3 = new Student(101,"lmno",8.0);
		System.out.println(s3.getCount());
		
	}
	
}
