package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.User;
import com.techlab.service.UserService;

public class DisplayUserAction implements Action {
	private List<User> users;
	@Autowired
	UserService userService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		users= userService.getUsers();
		return "success";
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
