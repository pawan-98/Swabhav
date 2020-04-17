package com.techlab.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public abstract class Account {
	private int accNo;
	private String  name ;
	private int age;
	private Date creationDate;
	private Date dateOfBirth;
	private String type;
	protected double balance;
	
	public Account(int accNo,String name,double balance,String creationDate,String dateOfBirth,String type) throws ParseException{
		this.creationDate = new SimpleDateFormat("MM/dd/yyyy").parse(creationDate);
		this.dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirth); 
		this.accNo=accNo;
		this.balance =balance;
		this.name = name;
		this.type = type;
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
	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.dateOfBirth);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		LocalDate birthDate = LocalDate.of(year, month, date);
		LocalDate currentDate = LocalDate.now();
		//System.out.println(birthDate+"here in acc  " +currentDate);
		Period difference = Period.between(birthDate, currentDate);
		
		return difference.getYears() ;
	}
	public String getType() {
		return this.type;
	}
	
	public abstract void withdraw(double amount);
}
