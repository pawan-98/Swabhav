package com.techlab.action;

import java.util.UUID;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class AddStudentAction extends ActionSupport implements ModelDriven<Student>  {
	private Student student;
	private String name;
	private String gender;
	

	public AddStudentAction() {
		// TODO Auto-generated constructor stub
		student=new Student();
	}
	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		return student;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		student.setId(UUID.randomUUID().toString());
		StudentService.getInstance().addStudent(student);
		return "success";
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String addDo() {
		System.out.println(student.getGender());
		System.out.println(student.getName());
		
		return "success";
	}
	

	
	

}
