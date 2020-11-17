package com.techlabs.model;

import java.util.List;
public class Login {
	
	public String getStatus(String name, String password, String sessionName, String sessionPassword) {
		
		if (sessionName != null) {
			if (sessionName.equals("admin") && sessionPassword.equals("admin")) {

				return "session";

			}
		} else if (name.equals("admin") && password.equals("admin")) {
			return "normal";

		} 
		return "failed";
		

	}

}
