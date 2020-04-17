package com.techlab.model;

import java.text.ParseException;

public class SavingsAccount extends Account {

	public SavingsAccount(int accNo, String name, double balance,String creationDate,String dateOfBirth) throws ParseException {
		super(accNo, name, balance,creationDate,dateOfBirth,"S");

	}

	@Override
	public void withdraw(double amount) {
		if (super.balance - amount > 1000) {
			super.balance = super.balance - amount;
		}

	}

}
