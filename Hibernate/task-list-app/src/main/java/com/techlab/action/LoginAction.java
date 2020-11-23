package com.techlab.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.UserService;

public class LoginAction extends ActionSupport implements SessionAware {
	private String usermame;
	private String password;
	private boolean role;
	private String message;
	private SessionMap<String,Object> sessionMap;
	@Autowired
	private UserService userService;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	
	public String loginDo() throws Exception {
		this.sessionMap =  (SessionMap<String, Object>) ActionContext.getContext().getSession();
		if(usermame.equals("")) {
			message = "Username is empty";
			return "input";
		}
		else if(password.equals("")) {
			message="Password is required ";
			return "input";
		}
		
		else if (userService.checkAuthentication(getUsermame(),getPassword())==false && role==true) {
			message="Incorrect Username or Pasword or blocked";
			return "input";
		}
		else if (role==false) {
			
			return "display";
		}
		return "success";
		
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsermame() {
		return usermame;
	}

	public void setUsermame(String usermame) {
		this.usermame = usermame;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>) session;
		
	}

	
	
}
