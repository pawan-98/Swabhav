package com.techlab.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.repository.TaskRepository;
@Service
public class TaskService {
	@Autowired
	private TaskRepository taskRepository;
	
	public List<Task> getTasks() {
		System.out.println("Task Service getTask");
//		List<Task> tasks= new ArrayList<Task>();
//			tasks= taskRepository.getTasks();
//		for (Task task : tasks) {
//			task.setDate(new SimpleDateFormat("dd-MM-yyyy").format(task.getDate()));
//			System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(task.getDate()));
//		}
		return taskRepository.getTasks();
	}

	public void deleteTask(String id) {
		taskRepository.deleteTask(id);
	}

	public void addTask(String title,Date date,User user) {
		taskRepository.addTask(title, date,user);
	}

	public Task searchTask(String id) {
		return taskRepository.searchTask(id);
	}
	
	public void updateTask(Task taskUpdateInfo) {
		taskRepository.updateTask(taskUpdateInfo);;
	}
	
	public List<Task> getUsersTask(String id) {
		List<Task> customTask = new ArrayList<Task>();
		System.out.println("Users Task Service");
		for (Task task : getTasks()) {
			System.out.println(task.getUser().getId()+" "+id);
			if(task.getUser().getId().equals(id)) {
				customTask.add(task);
			}
		}
		return customTask;
	}

}
