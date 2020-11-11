package com.techlabs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.techlabs.model.Student;

public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private static StudentService instance = new StudentService();
	private Student student;

	public StudentService() {
		// TODO Auto-generated constructor stub
		students.add(new Student(1, "Pawan", "Male"));
		students.add(new Student(2, "Amit", "Male"));
	}

	
	public List<Student> getStudents() {

		return students;

	}

	

	public static StudentService getInstance() {
		return instance;
	}
	

}
