package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.User;
import com.techlab.modelview.UserUpdateViewModel;
import com.techlab.service.UserService;

public class EditUserAction extends ActionSupport implements ModelDriven<UserUpdateViewModel>  {
	private String editId;
	private UserUpdateViewModel userUpdateViewModel;
	private static User user;
	@Autowired
	UserService service;
	
	public EditUserAction() {
		// TODO Auto-generated constructor stub
		userUpdateViewModel= new UserUpdateViewModel();
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Edit execute running");
		user = service.searchUser(editId);
		System.out.println(getEditId());
		System.out.println(user);
		userUpdateViewModel.setFirstName(user.getFirstName());
		userUpdateViewModel.setEmail(user.getEmail());
		userUpdateViewModel.setLastName(user.getLastName());
		userUpdateViewModel.setUsername(user.getUsermame());
		userUpdateViewModel.setPassword(user.getPassword());
		System.out.println("Blocked:-"+user.isBlocked());
		userUpdateViewModel.setBlocked(user.isBlocked());
		System.out.println(user.getFirstName());
		return "success";
	}
	
	@Override
	public void validate() {
		if ("".equals(userUpdateViewModel.getFirstName())) {
			addFieldError("firstName", "First Name cannot be empty");
		}

		
		if ("".equals(userUpdateViewModel.getLastName())) {
			addFieldError("lastName", "Last Name can not be empty");
		}
		
		if ("".equals(userUpdateViewModel.getUsername())) {
			addFieldError("username", "User Name can not be empty");
		}
		if ("".equals(userUpdateViewModel.getEmail())) {
			addFieldError("email", "Email can not be empty");
		}
		
		if ("".equals(userUpdateViewModel.getPassword())) {
			addFieldError("password", "Password can not be empty");
		}
		
	}
	
	@Override
	public UserUpdateViewModel getModel() {
		// TODO Auto-generated method stub
		
		return userUpdateViewModel;
	}
	
	public String doEdit() {
		user.setEmail(userUpdateViewModel.getEmail());
		user.setFirstName(userUpdateViewModel.getFirstName());
		user.setLastName(userUpdateViewModel.getLastName());
		user.setPassword(userUpdateViewModel.getPassword());
		user.setUsermame(userUpdateViewModel.getUsername());
		user.setBlocked(userUpdateViewModel.isBlocked());
		System.out.println("Blocked uvm:-"+userUpdateViewModel.isBlocked());
		service.updateStudent(user);
		return "success";
	}

	public String getEditId() {
		return editId;
	}

	public void setEditId(String editId) {
		this.editId = editId;
	}

	public UserUpdateViewModel getUserUpdateViewModel() {
		return userUpdateViewModel;
	}

	public void setUserUpdateViewModel(UserUpdateViewModel userUpdateViewModel) {
		this.userUpdateViewModel = userUpdateViewModel;
	}
	
	
}
