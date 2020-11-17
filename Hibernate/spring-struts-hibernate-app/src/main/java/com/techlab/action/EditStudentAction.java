package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Student;
import com.techlab.modelview.UpdateViewModel;
import com.techlab.service.StudentService;

public class EditStudentAction implements Action, ModelDriven<UpdateViewModel> {
	private String editId;
	private UpdateViewModel updateViewModel;
	private static Student student;
	@Autowired
	StudentService service;

	public EditStudentAction() {
		// TODO Auto-generated constructor stub
		updateViewModel = new UpdateViewModel();
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

		System.out.println("Edit VM:-" + updateViewModel.getGender() + " " + updateViewModel.getName());
		System.out.println(student);
		student.setGender(updateViewModel.getGender());
		student.setName(updateViewModel.getName());
		System.out.println(student.getGender() + " " + student.getGender() + " " + student.getName());
		service.updateStudent(student);
		return "success";
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		student = service.searchStudent(editId);
		updateViewModel.setGender(student.getGender());
		updateViewModel.setName(student.getName());
		return "success";
	}

	@Override
	public UpdateViewModel getModel() {
		// TODO Auto-generated method stub

		return updateViewModel;

	}

}
