package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlab.service.SubTaskService;
import com.techlab.service.TaskService;

public class SubTaskDeleteAction implements Action {
	private String taskId;
	private String subTaskId;
	@Autowired
	SubTaskService subTaskService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		subTaskService.deleteSubTask(subTaskId);
		return "success";
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getSubTaskId() {
		return subTaskId;
	}
	public void setSubTaskId(String subTaskId) {
		this.subTaskId = subTaskId;
	}
	

}
