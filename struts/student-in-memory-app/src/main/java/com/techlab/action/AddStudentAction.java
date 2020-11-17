package com.techlab.action;

import java.util.UUID;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.AddViewModel;

public class AddStudentAction extends ActionSupport implements ModelDriven<AddViewModel>  {
	private AddViewModel addViewModel;
	

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
		StudentService.getInstance().addStudent(addViewModel.getName(), addViewModel.getGender());
		
		return "success";
		}
	

	
	

}
