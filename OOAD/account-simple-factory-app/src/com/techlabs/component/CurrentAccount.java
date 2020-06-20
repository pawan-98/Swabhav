package com.techlabs.component;

import java.text.ParseException;

public class CurrentAccount extends Account{
	
	
	

	@Override
	public void withdraw(double amount) {
		if (super.balance - amount >= -5000) {
			super.balance = super.balance - amount;
		}
	}
}
