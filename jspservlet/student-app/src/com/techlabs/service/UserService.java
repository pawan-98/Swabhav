package com.techlabs.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.techlabs.model.User;

public class UserService {
	private List<User> admins = new ArrayList<User>();
	private static UserService instance = new UserService();

	public UserService() {
		admins.add(new User("admin", "admin","admin"));
		admins.add(new User("pawan", "pawan","guest"));
	}

	public List<User> getAdmins() {
		return admins;
	}

	public static UserService getInstance() {
		return instance;
	}
	public String getRole(String name,String password) {
		for (User admin : admins) {
			if(admin.getUserName().equals(name) && admin.getPassword().equals(password)) {
				return admin.getRole();
			}
		}
		return null; 
		
		
	}
	public String getStatus(String name, String password, String sessionName, String sessionPassword) {
		for (User admin : admins) {
			
			if (sessionName != null) {
				if (admin.getUserName().equals(sessionName) && admin.getPassword().equals(sessionPassword)) {
					System.out.println("accepted session");
					return "session";

				}
			} else if (admin.getUserName().equals(name) && admin.getPassword().equals(password)) {
				System.out.println("accepted normal");
				return "normal";

			}

		}
		System.out.println("failed");
		return "failed";
	}
	
	public static boolean checkAdmin(HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (session.getAttribute("role") == "admin") {
			return true;
		} 
		return false;
	}

}
