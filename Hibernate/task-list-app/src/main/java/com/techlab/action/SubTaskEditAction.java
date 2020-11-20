package com.techlab.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.entity.SubTask;
import com.techlab.modelview.SubTaskAddViewModel;
import com.techlab.modelview.SubTaskUpdateViewModel;
import com.techlab.service.SubTaskService;

public class SubTaskEditAction extends ActionSupport implements ModelDriven<SubTaskUpdateViewModel> {

	private String taskId;
	private String subTaskId;
	private SubTaskUpdateViewModel subTaskUpdateViewModel;
	private static SubTask subTask;

	@Autowired
	SubTaskService subTaskService;

	public SubTaskEditAction() {
		// TODO Auto-generated constructor stub
		subTaskUpdateViewModel = new SubTaskUpdateViewModel();
	}

	@Override
	public void validate() {
		if ("".equals(subTaskUpdateViewModel.getTitle())) {
			addFieldError("title", "Title cannot be empty");
		}

	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Sub task Edit execute running");
		subTask = subTaskService.searchSubTask(subTaskId);
		System.out.println("sub task id:-" + subTaskId);
		System.out.println("sub task:- " + subTask);
		subTaskUpdateViewModel.setCheckBoxValue(subTask.isDone());
		subTaskUpdateViewModel.setTitle(subTask.getTitle());
		return "success";
	}

	public String doEdit() {
		subTask.setTitle(subTaskUpdateViewModel.getTitle());
		subTask.setDone(subTaskUpdateViewModel.isCheckBoxValue());
		System.out.println("subt Edit CheckBox:-" + subTaskUpdateViewModel.isCheckBoxValue());
		subTaskService.updateSubTask(subTask);
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

	public SubTaskUpdateViewModel getSubTaskUpdateViewModel() {
		return subTaskUpdateViewModel;
	}

	public void setSubTaskUpdateViewModel(SubTaskUpdateViewModel subTaskUpdateViewModel) {
		this.subTaskUpdateViewModel = subTaskUpdateViewModel;
	}

	@Override
	public SubTaskUpdateViewModel getModel() {
		// TODO Auto-generated method stub
		return subTaskUpdateViewModel;
	}

}
