package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.UserService;

public class DeleteUserAction implements Action {
	private String deleteId;
	@Autowired
	UserService userService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		userService.deleteUser(deleteId);
		return "success";
	}
	public String getDeleteId() {
		return deleteId;
	}
	public void setDeleteId(String deleteId) {
		this.deleteId = deleteId;
	}
	
	
}
