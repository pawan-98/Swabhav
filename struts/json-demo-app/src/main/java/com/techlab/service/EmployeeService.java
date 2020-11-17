package com.techlab.service;

import java.util.List;
import java.util.UUID;

import com.techlab.model.Employee;

public class EmployeeService {
	private static EmployeeService instance;
	public List<Employee> employees;
	
	public EmployeeService() {
		employees.add(new Employee(UUID.randomUUID().toString(), "Pawan", "Java Developer", "male"));
		employees.add(new Employee(UUID.randomUUID().toString(), "Amit", "Python Developer", "male"));
		employees.add(new Employee(UUID.randomUUID().toString(), "Karan", "JS Developer", "male"));
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public static EmployeeService getInstance() {
		if (instance == null) {
			instance = new EmployeeService();
		}
		return instance;
	}
}
