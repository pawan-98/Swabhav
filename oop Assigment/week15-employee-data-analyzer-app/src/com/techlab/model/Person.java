package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private int empId;
	private String empName;
	private String role;
	private int managerId;
	private Date doj;
	private int salary;
	private int comm;
	private int deparmentNo;
	
	public Person( int empId, String empName,String role, int managerId, String doj, int salary, int comm, int deparmentNo) throws ParseException {
		 this.empId=empId;
		this.empName=empName;
		this.role=role;
		this.managerId=managerId;
		this.doj= new SimpleDateFormat("dd/MM/yyyy").parse(doj); 
		this.salary=salary;
		this.comm=comm;
		this.deparmentNo=deparmentNo;
		
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
	
	public Date getDateOfJoining() {
		return doj;
	}
	
	
	public int getCommission() {
		return comm;
	}
	
	public int getDepartmentNo() {
		return deparmentNo;
	}

}
