package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {
	private int accNo;
	private String  name ;
	Date creationDate;
	Date dateOfBirth;
	protected double balance;
	
	public Account(int accNo,String name,double balance,String creationDate,String dateOfBirth) throws ParseException{
		this.creationDate = new SimpleDateFormat("dd/MM/yyyy").parse(creationDate);
		this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth); 
		this.accNo=accNo;
		this.balance =balance;
		this.name = name;
	}
	public void deposit(double amount) {
		this.balance = this.balance+amount;
		
	}
	public int getAccNo() {
		return this.accNo;
	}
	public String getName() {
		return this.name;
	}
	public double getBalnce() {
		return this.balance;
	}
	
	public Date getCreationDate() {
		
		return this.creationDate;
	}
	
	public Date getDateOfBirth() {
		
		return this.dateOfBirth;
	}
	
	public abstract void withdraw(double amount);
}
