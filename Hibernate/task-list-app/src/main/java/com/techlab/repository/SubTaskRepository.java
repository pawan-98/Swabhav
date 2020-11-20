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
	
	
	private List<SubTask> subTasks = new ArrayList<SubTask>();
	
	public List<SubTask> getSubTasks() {
		Session session = factory.openSession();
		try {
			subTasks = session.createQuery("from SubTask").list();
			System.out.println("subtask list in repo:- "+subTasks);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return subTasks;
	}
	
	public void deleteSubTask(String id) {
		SubTask currentSubTask = searchSubTask(id);

		factory.getCurrentSession().delete(currentSubTask);
	}
	
	public SubTask searchSubTask(String id) {
		getSubTasks();
		for (SubTask subTaskInfo : subTasks) {
			if (subTaskInfo.getId().toString().equals(id)) {

				return subTaskInfo;

			}
		}
		return null;
	}
	
	public void addSubTask(String title,Date date,Task task) {
		SubTask addSubTask = new SubTask();
		addSubTask.setDate(date);
		addSubTask.setDone(false);
		addSubTask.setId(UUID.randomUUID().toString());
		addSubTask.setTitle(title);
		addSubTask.setTask(task);
		factory.getCurrentSession().save(addSubTask);

	}
	
	public void updateSubTask(SubTask subTaskUpdateInfo) {
		SubTask currentSubTask = searchSubTask(subTaskUpdateInfo.getId());
		currentSubTask.setDate(subTaskUpdateInfo.getDate());
		currentSubTask.setDone(subTaskUpdateInfo.isDone());
		currentSubTask.setTitle(subTaskUpdateInfo.getTitle());

		factory.getCurrentSession().update(currentSubTask);
		
	}




}
