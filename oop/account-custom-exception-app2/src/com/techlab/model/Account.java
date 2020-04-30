package com.techlab.model;

import javax.management.RuntimeErrorException;

public class Account {

	private double balance = 5000;
	private static int MINIMUM_BALANCE;
	private static int noOfTransactions = 0;
	private String name;
	private double id;

	public Account(double id, String name, double balance) {
		this.balance = balance;
		this.name= name;
		this.id = id;

	}

	public void withdraw(double amount) {
		if (balance-amount > MINIMUM_BALANCE) {
			System.out.println(MINIMUM_BALANCE);
			balance = balance - amount;
			//System.out.println("Current balance after withdrawing :- " + balance);
			noOfTransactions=noOfTransactions+1;
		}
		else {
			throw new InsufficientFundsException(this);
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
	public double getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}

}
