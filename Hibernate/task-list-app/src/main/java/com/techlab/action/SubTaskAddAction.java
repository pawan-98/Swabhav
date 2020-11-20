package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.modelview.SubTaskAddViewModel;
import com.techlab.service.SubTaskService;
import com.techlab.service.TaskService;

public class SubTaskAddAction extends ActionSupport implements ModelDriven<SubTaskAddViewModel> {

	private SubTaskAddViewModel subTaskAddViewModel;
	private String taskId;
	@Autowired
	SubTaskService subTaskService;
	@Autowired
	TaskService taskService;
	
	 public SubTaskAddAction() {
		// TODO Auto-generated constructor stub
		 subTaskAddViewModel= new SubTaskAddViewModel();
	 }
	 public String doAdd() {
			System.out.println("taskId:-"+taskId);
			System.out.println(subTaskService.searchSubTask(taskId));
			subTaskService.addSubTask(subTaskAddViewModel.getTitle(), subTaskAddViewModel.getDate(),taskService.searchTask(taskId));
			return "success";
		}
	 @Override
		public void validate() {
			if ("".equals(subTaskAddViewModel.getTitle())) {
				addFieldError("title", "Title cannot be empty");
			}

			
			if ("".equals(subTaskAddViewModel.getDate())) {
				addFieldError("date", "Date can not be empty");
			}
		}
	 
	@Override
	public SubTaskAddViewModel getModel() {
		// TODO Auto-generated method stub
		return subTaskAddViewModel;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Add Sub Task success");
		System.out.println("taskId:-"+taskId);
		return "success";
	}
	public SubTaskAddViewModel getSubTaskAddViewModel() {
		return subTaskAddViewModel;
	}
	public void setSubTaskAddViewModel(SubTaskAddViewModel subTaskAddViewModel) {
		this.subTaskAddViewModel = subTaskAddViewModel;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	
	

}
