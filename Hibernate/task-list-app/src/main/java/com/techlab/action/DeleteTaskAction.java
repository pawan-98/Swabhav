package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.TaskService;

public class DeleteTaskAction implements Action {
	private String taskId;
	private String userId;
	@Autowired
	TaskService taskService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		taskService.deleteTask(taskId);
		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
}
