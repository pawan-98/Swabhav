package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.techlab.model.Student;

@Repository
public class StudentRepository {
	private List<Student> students = new ArrayList<Student>();
	private static StudentRepository instance;

	private StudentRepository() {
		students.add(new Student(UUID.randomUUID().toString(), "pawan", "male"));
		students.add(new Student(UUID.randomUUID().toString(), "amit", "male"));

	}

	public static StudentRepository getInstance() {
		if (instance == null) {
			instance = new StudentRepository();
		}
		return instance;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void deleteStudent(String id) {
		for (Student studentInfo : students) {
			if (studentInfo.getId().toString().equals(id)) {
				
				students.remove(studentInfo);
				break;
			}
		}
	}

	public void addStudent(String name,String gender) {
		
		students.add(new Student(UUID.randomUUID().toString(),name,gender));
	}
	
	public Student searchStudent(String id) {
		for (Student studentInfo : students) {
			if (studentInfo.getId().toString().equals(id)) {
				
				return studentInfo;
			}
		}
		return null;
	}
	
	public void updateStudent(Student studentUpdateInfo) {
		System.out.println(studentUpdateInfo.getGender());
		for (Student studentInfo : students) {
			if (studentInfo.getId().toString().equals(studentUpdateInfo.getId().toString())) {
				
				studentInfo.setGender(studentUpdateInfo.getGender());
				studentInfo.setName(studentUpdateInfo.getName());
			}
		}
	}

}
