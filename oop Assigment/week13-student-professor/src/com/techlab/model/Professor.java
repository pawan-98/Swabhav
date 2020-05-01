package com.techlab.model;

import java.text.ParseException;

public class Professor extends Person {
		private double dailySalary;
	public Professor(int id, String address, String dob,double salary) throws ParseException {
		super(id, address, dob,"Professor");
		this.dailySalary=salary;
		
	}
	
	public double getSalary() {
		return this.dailySalary;
	}
	public double getNetSalary() {
		return this.dailySalary*365;
	}

}
