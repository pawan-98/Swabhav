package com.techlab.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.techlab.entity.Task;
import com.techlab.service.TaskService;

public class DisplayTaskAction implements Action,SessionAware{
	private String userId;
	private List<Task> tasks;
	private SessionMap<String, Object> sessionMap;
	
	@Autowired
	TaskService taskService;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("task execute method");
		
		//this.sessionMap = (SessionMap<String, Object>) ActionContext.getContext().getSession();
			if(userId !=null) {
				sessionMap.put("userId", userId);
			}else {
				System.out.println("session user id" +(String)sessionMap.get("userId"));
				setUserId((String)sessionMap.get("userId"));
			}
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

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>) session;
	}
	
	
}
