package com.techlab.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.User;


@Repository
@Transactional
public class UserRepository {
	@Autowired
	private SessionFactory factory;
	
	
	private List<User> users = new ArrayList<User>();
	
	public List<User> getUsers() {
		Session session = factory.openSession();
		try {
			users = session.createQuery("from User").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return users;
	}
	
	public void deleteUser(String id) {
		User currentUser = searchUser(id);

		factory.getCurrentSession().delete(currentUser);
	}
	
	public User searchUser(String id) {
		getUsers();
		for (User userInfo : users) {
			System.out.println(userInfo.getId()+"  "+id);
			System.out.println(userInfo.getId().equals(id));
			if (userInfo.getId().equals(id)) {

				return userInfo;

			}
		}
		return null;
	}
	
	public void addUser(String firstName,String lastName,String email,String usermame,String password) {
		User addUser = new User();
		addUser.setEmail(email);
		addUser.setFirstName(firstName);
		addUser.setId(UUID.randomUUID().toString());
		addUser.setLastName(lastName);
		addUser.setPassword(password);
		addUser.setUsermame(usermame);
		
		factory.getCurrentSession().save(addUser);

	}
	
	public void updateUser(User userUpdateInfo) {
		User currentUser = searchUser(userUpdateInfo.getId());
		currentUser.setEmail(userUpdateInfo.getEmail());
		currentUser.setFirstName(userUpdateInfo.getFirstName());
		currentUser.setLastName(userUpdateInfo.getLastName());
		currentUser.setPassword(userUpdateInfo.getPassword());
		currentUser.setTask(userUpdateInfo.getTask());

		factory.getCurrentSession().update(currentUser);
		
	}

}
