package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.model.Student;
import com.techlab.service.StudentService;
import com.techlab.viewmodel.UpdateViewModel;

public class EditStudentAction implements Action,ModelDriven<UpdateViewModel> {
	private String editId;
	private UpdateViewModel updateViewModel;
	private static Student student;
	StudentService service;
	public EditStudentAction() {
		// TODO Auto-generated constructor stub
		updateViewModel = new UpdateViewModel();
		service = StudentService.getInstance();
	}
	
	public String getEditId() {
		return editId;
	}

	public void setEditId(String editId) {
		this.editId = editId;
	}

	public UpdateViewModel getEditStudent() {
		return updateViewModel;
	}

	public void setEditStudent(UpdateViewModel updateViewModel) {
		this.updateViewModel = updateViewModel;
	}
	public String doEdit() {
		//System.out.println(updateViewModel.getId() + " " + updateViewModel.getName());
		 
		//service.updateStudent(updateViewModel);
		/*
		 * student= service.searchStudent(editId);
		 * updateViewModel.setGender(student.getGender());
		 * updateViewModel.setName(student.getName());
		 */
		System.out.println("Edit VM:-"+updateViewModel.getGender()+" "+updateViewModel.getName());
		System.out.println(student);
		//student= service.searchStudent(getEditId());
		//System.out.println(student);
		student.setGender(updateViewModel.getGender());
		student.setName(updateViewModel.getName());
		System.out.println(student.getGender()+" "+student.getGender()+" "+student.getName());
		service.updateStudent(student);
		return "success";
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//student = StudentService.getInstance().searchStudent(editId);
		student= service.searchStudent(editId);
		//System.out.println(student.getGender()+" "+student.getName());
		updateViewModel.setGender(student.getGender());
		updateViewModel.setName(student.getName());
		//System.out.println(updateViewModel.getGender()+"  "+updateViewModel.getName());
		return "success";
	}

	@Override
	public UpdateViewModel getModel() {
		// TODO Auto-generated method stub
		
		return updateViewModel;
		
		
	}

}
