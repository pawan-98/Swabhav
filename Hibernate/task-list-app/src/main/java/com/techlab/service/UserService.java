package com.techlab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.User;
import com.techlab.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

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
		System.out.println(username + " " + password);
		users = getUsers();
		for (User user : users) {
			System.out.println("Login checking:-" + user.getUsermame() + " " + user.getPassword());
			if (user.getUsermame().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
