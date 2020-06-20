package com.techlabs.component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Account {
	private int accNo;
	private String  name ;
	protected double balance;
	public Account() {
		this.balance=0;
	}
	
	
	public void deposit(double amount) {
		this.balance = this.balance+amount;
		
	}
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public int getAccNo() {
		return this.accNo;
	}
	public void setName(String name) {
		 this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public double getBalance() {
		return this.balance;
	}
	
	
	public abstract void withdraw(double amount) throws Exception;
}
