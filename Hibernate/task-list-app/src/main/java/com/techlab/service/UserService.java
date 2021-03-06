package com.techlab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensymphony.xwork2.ActionContext;
import com.techlab.entity.User;
import com.techlab.repository.UserRepository;

@Service
public class UserService implements SessionAware {
	@Autowired
	private UserRepository userRepository;
	
	private SessionMap<String,Object> sessionMap;

	public List<User> getUsers() {
		return userRepository.getUsers();
	}

	public void deleteUser(String id) {
		userRepository.deleteUser(id);
		;
	}

	public void addUser(String firstName, String lastName, String email, String usermame, String password) {
		userRepository.addUser(firstName, lastName, email, usermame, password);
	}

	public User searchUser(String id) {
		return userRepository.searchUser(id);
	}

	public void updateStudent(User userUpdateInfo) {
		userRepository.updateUser(userUpdateInfo);
		;
	}

	public boolean checkAuthentication(String username, String password) {
		List<User> users = new ArrayList<User>();
		this.sessionMap =  (SessionMap<String, Object>) ActionContext.getContext().getSession();
		System.out.println(username + " " + password);
		users = getUsers();
		for (User user : users) {
			System.out.println("Login checking:-" + user.getUsermame() + " " + user.getPassword());
			if (user.getUsermame().equals(username) && user.getPassword().equals(password) && user.isBlocked()==false) {
				System.out.println("userId user service:- "+user.getId());
				sessionMap.put("userId",user.getId());
				System.out.println("userId in userSSSS:-"+user.getId());
				return true;
			}
		}
		return false;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>) session;
	}

}
