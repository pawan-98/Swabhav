package com.techlab.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlab.model.Employee;
import com.techlab.service.EmployeeService;

public class EmployeeAction implements Action  {
	private List<Employee> employees;
	private EmployeeService employeeService;
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		employeeService= new EmployeeService();
		employees=employeeService.getEmployees();
		return "success";
	}

}
