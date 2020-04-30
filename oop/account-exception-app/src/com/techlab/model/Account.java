package com.techlab.model;

import javax.management.RuntimeErrorException;

public class Account {

	private double balance = 5000;
	private static int MINIMUM_BALANCE;
	private static int noOfTransactions = 0;

	public Account(double id, String string, double balance) {
		this.balance = balance;

	}

	public void withdraw(double amount) {
		if (balance-amount > MINIMUM_BALANCE) {
			System.out.println(MINIMUM_BALANCE);
			balance = balance - amount;
			//System.out.println("Current balance after withdrawing :- " + balance);
			noOfTransactions=noOfTransactions+1;
		}
		else {
			throw new RuntimeException("Insufficient banance");
		}
	}

	public void deposit(double amount) {

		balance = balance + amount;
		//System.out.println("Current balance after depositing :- " + balance);
		noOfTransactions=noOfTransactions+1;
	}
	public static void setMinimumBalance(int minBlanace) {
		MINIMUM_BALANCE = minBlanace;
	}
	public static int getNoOfTransaction() {
		return noOfTransactions;	
		}
	public double getBalance() {
		return balance;
	}
	

}
