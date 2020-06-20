package com.techlabs.component;


public class SavingsAccount extends Account {

	

	@Override
	public void withdraw(double amount) throws Exception {
		if (super.balance - amount > 1000) {
			super.balance = super.balance - amount;
		}
		else {
			throw new Exception("Minimum balance req");
		}

	}

}
