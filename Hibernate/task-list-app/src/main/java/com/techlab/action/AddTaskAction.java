package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.modelview.TaskAddViewModel;
import com.techlab.service.TaskService;
import com.techlab.service.UserService;

public class AddTaskAction extends ActionSupport implements ModelDriven<TaskAddViewModel> {

	private TaskAddViewModel taskAddViewModel;
	private String userId;
	@Autowired
	TaskService taskService;
	@Autowired
	UserService userService;

	public AddTaskAction() {
		// TODO Auto-generated constructor stub
		taskAddViewModel = new TaskAddViewModel();

	}

	public String doAdd() {
		System.out.println("userId:-"+userId);
		System.out.println(userService.searchUser(userId));
		taskService.addTask(taskAddViewModel.getTitle(), taskAddViewModel.getDate(),userService.searchUser(userId));
		return "success";
	}
	@Override
	public void validate() {
		if ("".equals(taskAddViewModel.getTitle())) {
			addFieldError("title", "Title cannot be empty");
		}

		
		if ("".equals(taskAddViewModel.getDate())) {
			addFieldError("date", "Date can not be empty");
		}
	}

	@Override
	public TaskAddViewModel getModel() {
		// TODO Auto-generated method stub
		return taskAddViewModel;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Add Task success");
		System.out.println("userId:-"+userId);
		return "success";
	}

	public TaskAddViewModel getTaskAddViewModel() {
		return taskAddViewModel;
	}

	public void setTaskAddViewModel(TaskAddViewModel taskAddViewModel) {
		this.taskAddViewModel = taskAddViewModel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
