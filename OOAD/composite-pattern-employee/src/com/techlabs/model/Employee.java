package com.techlabs.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
	private int empId;
	private String empName;
	private String role;
	private int managerId;
	private String doj;
	private int salary;
	private int comm;
	private int deparmentNo;
	private List<Employee> employeesUnderThisEmployee;
	private String finalString;

	public Employee(int empId, String empName, String role, int managerId, String doj, int salary, int comm,
			int deparmentNo) {
		this.empId = empId;
		this.empName = empName;
		this.role = role;
		this.managerId = managerId;
		this.doj = doj;
		this.salary = salary;
		this.comm = comm;
		this.deparmentNo = deparmentNo;
		employeesUnderThisEmployee = new ArrayList<Employee>();
		finalString = "";

	}

	public void addEmployeesUnderThisEmployee(Employee employee) {
		employeesUnderThisEmployee.add(employee);
	}

	public List<Employee> getEmployeesUnderThisEmployee() {
		return employeesUnderThisEmployee;
	}

	public String show(int count) {
		count++;
		Iterator<Employee> i = employeesUnderThisEmployee.iterator();
		finalString = "|->" + finalString + getName() + "(" + getDesignation() + ")" + "\n";
		while (i.hasNext()) {
			Employee employee = i.next();
			finalString = finalString + getSpaces(count) + employee.show(count);
		}
		return finalString;
	}

	public String getSpaces(int count) {
		String stringWithSpaces = "";
		for (int i = 0; i < count; i++) {
			stringWithSpaces = stringWithSpaces + "\t";
		}
		return stringWithSpaces;
	}

	public String getName() {
		return this.empName;
	}

	public int getSalary() {
		return this.salary;
	}

	public int getId() {
		return empId;
	}

	public String getDesignation() {
		return role;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getDateOfJoining() {
		return doj;
	}

	public int getCommission() {
		return comm;
	}

	public int getDepartmentNo() {
		return deparmentNo;
	}

}
