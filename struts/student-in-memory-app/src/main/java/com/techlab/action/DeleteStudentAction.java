package com.techlab.action;

import com.opensymphony.xwork2.Action;
import com.techlab.service.StudentService;

public class DeleteStudentAction implements Action {
	private String deleteId;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		StudentService.getInstance().deleteStudent(getDeleteId());
		return "success";
	}
	public String getDeleteId() {
		return deleteId;
	}
	public void setDeleteId(String deleteId) {
		this.deleteId = deleteId;
	}

}
