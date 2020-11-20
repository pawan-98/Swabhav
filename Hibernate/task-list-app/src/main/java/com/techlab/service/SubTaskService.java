package com.techlab.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.entity.SubTask;
import com.techlab.entity.Task;
import com.techlab.entity.User;
import com.techlab.repository.SubTaskRepository;
import com.techlab.repository.TaskRepository;

@Service
public class SubTaskService {
	@Autowired
	private SubTaskRepository subTaskRepository;
	
	public List<SubTask> getSubTasks() {
		System.out.println("Sub Task Service getTask");
		return subTaskRepository.getSubTasks();
	}

	public void deleteSubTask(String id) {
		subTaskRepository.deleteSubTask(id);;
	}

	public void addSubTask(String title,Date date,Task task) {
		//taskRepository.addTask(title, date,user);
		subTaskRepository.addSubTask(title, date, task);
	}

	public SubTask searchSubTask(String id) {
		
		return subTaskRepository.searchSubTask(id);
	}
	
	public void updateSubTask(SubTask subTaskUpdateInfo) {
		subTaskRepository.updateSubTask(subTaskUpdateInfo);
	}
	
	public List<SubTask> getTasksSubTask(String id) {
		List<SubTask> customSubTask = new ArrayList<SubTask>();
		System.out.println("Users Sub Task Service");
		for (SubTask subTask : getSubTasks()) {
			System.out.println(subTask.getTask().getId()+" "+id);
			if(subTask.getTask().getId().equals(id)) {
				customSubTask.add(subTask);
			}
		}
		return customSubTask;
	}			


}
