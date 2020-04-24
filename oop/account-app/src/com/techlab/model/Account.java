package com.techlab.model;

public class Account {

	private double balance = 5000;
	private static int MINIMUM_BALANCE;
	private static int noOfTransactions = 0;

	public Account(double balance) {
		this.balance = balance;

	}

	public void withdraw(double amount) {
		if (balance > MINIMUM_BALANCE) {
			balance = balance - amount;
			//System.out.println("Current balance after withdrawing :- " + balance);
			noOfTransactions=noOfTransactions+1;
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
