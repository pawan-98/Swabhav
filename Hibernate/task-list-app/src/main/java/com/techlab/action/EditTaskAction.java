package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.Task;
import com.techlab.modelview.TaskUpdateViewModel;
import com.techlab.service.TaskService;

public class EditTaskAction extends ActionSupport implements ModelDriven<TaskUpdateViewModel> {
	
	private String taskId;
	private String userId;
	private TaskUpdateViewModel taskUpdateViewModel;
	private static Task task;
	
	@Autowired
	TaskService taskService;

	 public EditTaskAction() {
		// TODO Auto-generated constructor stub
		taskUpdateViewModel= new TaskUpdateViewModel();
	}
	 
	 @Override
		public void validate() {
			if ("".equals(taskUpdateViewModel.getTitle())) {
				addFieldError("title", "Title cannot be empty");
			}

			
			
		}
	 
	 @Override
		public String execute() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Edit execute running");
			task=taskService.searchTask(taskId);
			System.out.println("task id:-"+taskId);
			System.out.println("task:- "+task);
			taskUpdateViewModel.setCheckBoxValue(task.isDone());;
			taskUpdateViewModel.setTitle(task.getTitle());
			return "success";
		}
	 
	@Override
	public TaskUpdateViewModel getModel() {
		// TODO Auto-generated method stub
		return taskUpdateViewModel;
	}
	
	public String doEdit() {
		task.setTitle(taskUpdateViewModel.getTitle());
		task.setDone(taskUpdateViewModel.isCheckBoxValue());
		System.out.println("Edit CheckBox:-"+taskUpdateViewModel.isCheckBoxValue());
		taskService.updateTask(task);
		return "success";
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public TaskUpdateViewModel getTaskUpdateViewModel() {
		return taskUpdateViewModel;
	}

	public void setTaskUpdateViewModel(TaskUpdateViewModel taskUpdateViewModel) {
		this.taskUpdateViewModel = taskUpdateViewModel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
	
	
	

}
