package com.techlabs.model.test;

import com.techlabs.model.Student;
import com.techlabs.model.StudentThirdCase;

public class StudentThirdTest {
	
	public static void main(String args[]) {
		StudentThirdCase s1 = new StudentThirdCase(101,"abc");
		System.out.println(s1.getCount());

		StudentThirdCase s2 = new StudentThirdCase(101,"xyz");
		System.out.println(s1.getCount());

		StudentThirdCase s3 = new StudentThirdCase(101,"lmno",8.0f);
		System.out.println(s1.getCount());
		
	}

	
}
