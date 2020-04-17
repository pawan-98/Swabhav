package com.techlab.model;

import java.text.ParseException;

public class CurrentAccount extends Account{
	
	
	public  CurrentAccount(int accNo,String name,double balance,String creationDate,String dateOfBirth) throws ParseException {
		super(accNo,name,balance,creationDate,dateOfBirth,"C");
		 
			
	
	}

	@Override
	public void withdraw(double amount) {
		if (super.balance - amount >= -5000) {
			super.balance = super.balance - amount;
		}
	}
}
