package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.modelview.AddViewModel;
import com.techlab.service.StudentService;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddViewModel>  {
	private AddViewModel addViewModel;
	@Autowired
	StudentService studentService;

	public AddStudentAction() {
		// TODO Auto-generated constructor stub
		addViewModel=new AddViewModel();
	}
	@Override
	public AddViewModel getModel() {
		// TODO Auto-generated method stub
		return addViewModel;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	
	public AddViewModel getStudent() {
		return addViewModel;
	}
	public void setStudent(AddViewModel student) {
		this.addViewModel = student;
	}
	
	public String addDo() {
		studentService.addStudent(addViewModel.getName(), addViewModel.getGender());
		
		return "success";
		}
	

	
	

}
