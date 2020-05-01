package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private int id;
	private String address;
	private Date dob;
	private String personType;
	
	public Person(int id,String address,String dob,String personType) throws ParseException {
		this.id = id;
		this.address=address;
		this.dob = new SimpleDateFormat("MM/dd/yyyy").parse(dob);
		this.personType=personType;
	}
	public int getId() {
		return this.id;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public Date getDateOfBirth() {
		return this.dob;
	}
	public String getPersonType() {
		return this.personType;
	}
}
