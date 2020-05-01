package com.techlab.model;

import java.text.ParseException;

public class Student extends Person {
	public Branch branch ;

	public Student(int id, String address, String dob,Branch branch) throws ParseException {
		super(id, address, dob,"Student");
		this.branch = branch;
	
	}
	
	public Branch getBranch() {
		
		return this.branch;
	}

	
	
}
