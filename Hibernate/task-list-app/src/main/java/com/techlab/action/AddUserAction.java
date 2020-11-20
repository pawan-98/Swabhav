package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.modelview.UserAddViewModel;
import com.techlab.service.UserService;

public class AddUserAction extends ActionSupport implements ModelDriven<UserAddViewModel>{
	
	private UserAddViewModel userAddViewModel;
	@Autowired
	UserService userService;
	
	public AddUserAction() {
		// TODO Auto-generated constructor stub
		userAddViewModel = new UserAddViewModel();
	}
	public String doAdd() {
		userService.addUser(userAddViewModel.getFirstName(), userAddViewModel.getLastName(), userAddViewModel.getEmail(), userAddViewModel.getUsername(), userAddViewModel.getPassword());
		return "success";
	}
	@Override
	public void validate() {
		if ("".equals(userAddViewModel.getFirstName())) {
			addFieldError("firstName", "First Name cannot be empty");
		}

		
		if ("".equals(userAddViewModel.getLastName())) {
			addFieldError("lastName", "Last Name can not be empty");
		}
		
		if ("".equals(userAddViewModel.getUsername())) {
			addFieldError("username", "User Name can not be empty");
		}
		if ("".equals(userAddViewModel.getEmail())) {
			addFieldError("email", "Email can not be empty");
		}
		
		if ("".equals(userAddViewModel.getPassword())) {
			addFieldError("password", "Password can not be empty");
		}
		
	}
	@Override
	public UserAddViewModel getModel() {
		// TODO Auto-generated method stub
		return userAddViewModel;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	public UserAddViewModel getUserAddViewModel() {
		return userAddViewModel;
	}
	public void setUserAddViewModel(UserAddViewModel userAddViewModel) {
		this.userAddViewModel = userAddViewModel;
	}
	

}
