package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.Task;
import com.techlab.service.TaskService;

public class DisplayTaskAction implements Action {
	private String userId;
	private List<Task> tasks;
	
	@Autowired
	TaskService taskService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("task execute method");
		tasks = taskService.getUsersTask(userId);
		return "success";
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<Task> getTasks() {
		return tasks;
	}
	
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
}
