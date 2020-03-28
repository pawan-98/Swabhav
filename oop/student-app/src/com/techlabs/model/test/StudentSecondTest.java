package com.techlabs.model.test;

import com.techlabs.model.Student;
import com.techlabs.model.StudentSecondCase;

public class StudentSecondTest {
	
	public static void main(String args[]) {
		StudentSecondCase s1 = new StudentSecondCase(101,"abc");
		System.out.println(s1.getCount());

		StudentSecondCase s2 = new StudentSecondCase(101,"xyz");
		System.out.println(s1.getCount());

		StudentSecondCase s3 = new StudentSecondCase(101,"lmno",8.0f);
		System.out.println(s1.getCount());
		
	}

}
