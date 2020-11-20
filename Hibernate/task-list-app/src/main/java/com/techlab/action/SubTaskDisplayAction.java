package com.techlab.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.entity.SubTask;
import com.techlab.service.SubTaskService;

public class SubTaskDisplayAction implements Action {
	private String taskId;
	private List<SubTask> subTasks;
	
	@Autowired
	SubTaskService subTaskService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("sub task execute method");
		subTasks = subTaskService.getTasksSubTask(taskId);
		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(List<SubTask> subTasks) {
		this.subTasks = subTasks;
	}

	
}
