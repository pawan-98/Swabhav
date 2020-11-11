package com.techlab.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class DisplayStudentAction implements Action  {
	private List<Student> students;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		students=StudentService.getInstance().getStudents();
		return "success";
	}
	public List<Student> getStudents(){
		return students;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
