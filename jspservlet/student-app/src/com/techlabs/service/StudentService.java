package com.techlabs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.databse.StudentCrud;
import com.techlabs.model.Student;

public class StudentService {
	private List<Student> students = new ArrayList<Student>();
	private static StudentService instance = new StudentService();
	private Student student;
	private StudentCrud studentCRUD;

	public StudentService() {
		// TODO Auto-generated constructor stub
		studentCRUD = new StudentCrud();
	}

	public void addStudent(String name, String gender) {
		// students.add(new Student(id, name, gender));
		studentCRUD.insertStudent(name, gender);

	}

	public List<Student> getStudents()
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

		return studentCRUD.getAllStudents();

	}

	public Student getStudentUsingId(String id) {
		return studentCRUD.getStudentUsingId(Integer.parseInt(id));
	}

	public void updateStudent(String id, String name, String gender) {
		studentCRUD.updateStudent(Integer.parseInt(id), name, gender);

	}

	public void deleteStudent(String id) {
		studentCRUD.deleteStudent(Integer.parseInt(id));
	}
	public List<Student> getSearchedStudents(String name){
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from student_jsp where name like'"+name+"%'");
			
			while (res.next()) {
				
				students.add(new Student(res.getInt(1),res.getString(2),res.getString(3)));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	}

	public static StudentService getInstance() {
		return instance;
	}
	

}
