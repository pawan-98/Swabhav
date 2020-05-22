package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private int empId;
	private String empName;
	private String role;
	private int managerId;
	private String doj;
	private int salary;
	private int comm;
	private int deparmentNo;

	public Employee(int empId, String empName, String role, int managerId, String doj, int salary, int comm,
			int deparmentNo) throws ParseException {
		this.empId = empId;
		this.empName = empName;
		this.role = role;
		this.managerId = managerId;
		this.doj = doj;
		this.salary = salary;
		this.comm = comm;
		this.deparmentNo = deparmentNo;

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
