package com.techlab.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlab.entity.SubTask;
import com.techlab.entity.Task;

@Repository
@Transactional
public class SubTaskRepository {
	@Autowired
	private SessionFactory factory;
	
	
	private List<SubTask> tasks = new ArrayList<SubTask>();
	
	public List<Task> getTasks() {
		Session session = factory.openSession();
		try {
			tasks = session.createQuery("from task").list();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return tasks;
	}
	
	public void deleteTask(String id) {
		Task currentTask = searchTask(id);

		factory.getCurrentSession().delete(currentTask);
	}
	
	public Task searchTask(String id) {
		getTasks();
		for (Task taskInfo : tasks) {
			if (taskInfo.getId().toString().equals(id)) {

				return taskInfo;

			}
		}
		return null;
	}
	
	public void addTask(String title,Date date) {
		Task addTask = new Task();
		addTask.setDate(date);
		addTask.setDone(false);
		addTask.setId(UUID.randomUUID().toString());
		addTask.setTitle(title);
		factory.getCurrentSession().save(addTask);

	}
	
	public void updateTask(Task taskUpdateInfo) {
		Task currentTask = searchTask(taskUpdateInfo.getId());
		currentTask.setDate(taskUpdateInfo.getDate());
		currentTask.setDone(taskUpdateInfo.isDone());
		currentTask.setSubTask(taskUpdateInfo.getSubTask());
		currentTask.setTitle(taskUpdateInfo.getTitle());

		factory.getCurrentSession().update(currentTask);
		
	}




}
