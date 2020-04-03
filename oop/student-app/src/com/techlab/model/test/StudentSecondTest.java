package com.techlab.model.test;

import com.techlab.model.Student;
public class StudentSecondTest {
	
	public static void main(String args[]) {
		Student s1 = new Student(101,"abc");
		System.out.println(s1.getCount());

		Student s2 = new Student(101,"xyz");
		System.out.println(s1.getCount());

		Student s3 = new Student(101,"lmno",8.0f);
		System.out.println(s1.getCount());
		
	}

}
