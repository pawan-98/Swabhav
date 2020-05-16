package com.techlab.model.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlab.model.Student;

public class StudentHashMapTest {
	public static void main(String args[]) {
		Student s1 = new Student(1,10,"ABC",8.0);
		Student s2 = new Student(1,10,"xyz",7.5);
		
		Map<Student, Student> map = new TreeMap();
		map.put(s1,s1);
		map.put(s2,s2);

		System.out.println(map.size());
	
	}

}
