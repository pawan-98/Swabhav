package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;

public class EditStudentAction implements Action,ModelDriven<Student> {
	private String editId;
	private Student editStudent;
	
	public String getEditId() {
		return editId;
	}

	public void setEditId(String editId) {
		this.editId = editId;
	}

	public Student getEditStudent() {
		return editStudent;
	}

	public void setEditStudent(Student editStudent) {
		this.editStudent = editStudent;
	}
	public String doEdit() {
		System.out.println(editStudent.getId() + " " + editStudent.getName());
		StudentService service = StudentService.getInstance();
		service.updateStudent(editStudent);
		return "success";
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		editStudent = StudentService.getInstance().searchStudent(editId);
		return "success";
	}

	@Override
	public Student getModel() {
		// TODO Auto-generated method stub
		editStudent = new Student();
		return editStudent;
		
		
	}

}
