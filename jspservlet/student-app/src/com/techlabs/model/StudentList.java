package com.techlabs.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class StudentList {
	private List<Student> students = new ArrayList<Student>();
	public StudentList() {
		// TODO Auto-generated constructor stub
		students.add(new Student(UUID.randomUUID(), "pawan", "male"));
		students.add(new Student(UUID.randomUUID(), "amit", "male"));
		
	}
	
	public void addStudent(String name,String gender) {
		students.add(new Student(UUID.randomUUID(), name, gender));
		
	}
	public List<Student> getStudents(){
		return students;
		
	}
}
