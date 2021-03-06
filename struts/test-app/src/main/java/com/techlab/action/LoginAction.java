package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.techlabs.service.LoginService;

public class LoginAction implements Action,SessionAware {
	private String name;
	private String password;
	private String message;
	private LoginService loginService;
	private SessionMap<String,Object> sessionMap; 
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		sessionMap.put("status","notLogged");
		return "success";
	}
	
	public String loginDo() throws Exception {
		this.sessionMap = (SessionMap<String, Object>) ActionContext.getContext().getSession();
		loginService= new LoginService();
		if(name.equals("")) {
			message = "Username is empty";
			return "input";
		}
		else if(password.equals("")) {
			message="Password is required ";
			return "input";
		}
		else if (loginService.checkUser(getName(), getPassword())==false) {
			message="Incorrect Username or Pasword";
			return "input";
		}
		 
		return "success";
		
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>) session;
		
	}
	

}
