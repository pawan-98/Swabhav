package com.techlabs.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class LoginService {
	private Map<String, String> usersMap;

	public LoginService() {
		usersMap= new HashMap<String, String>();
		usersMap.put("pawan", "pawan");
		usersMap.put("admin", "admin");
	}
	
	public boolean checkUser(String name,String password) {
		 HttpSession session=ServletActionContext.getRequest().getSession(false); 
		for (Map.Entry<String,String> user: usersMap.entrySet()) {
			if(user.getKey().equals(name) && user.getValue().equals(password)) {
				
				return true;
			}
		}
		return false;
	}
	
	

}
