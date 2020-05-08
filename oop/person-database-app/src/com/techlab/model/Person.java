package com.techlab.model;

public class Person {
	
	private int empId;
	private String empName;
	private String role;
	private int managerId;
	private String doj;
	private int salary;
	private int comm;
	private int deparmentNo;
	
	public Person( int empId, String empName,String role, int managerId, String doj, int salary, int comm, int eparmentNo) {
		 this.empId=empId;
		this.empName=empName;
		this.role=role;
		this.managerId=managerId;
		this.doj= doj;
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

}
