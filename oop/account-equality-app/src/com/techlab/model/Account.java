package com.techlab.model;

public class Account  {
	private double balance = 5000;
	private String name;
	private int accNo;
	private static int MINIMUM_BALANCE;
	private static int noOfTransactions = 0;

	public Account(double balance, String name, int accNo) {
		this.balance = balance;
		this.accNo = accNo;
		this.name = name;

	}

	public void withdraw(double amount) {
		if (balance > MINIMUM_BALANCE) {
			balance = balance - amount;
			System.out.println("Current balance after withdrawing :- " + balance);
			noOfTransactions = noOfTransactions + 1;
		}
	}

	public void deposit(double amount) {

		balance = balance + amount;
		System.out.println("Current balance after depositing :- " + balance);
		noOfTransactions = noOfTransactions + 1;
	}

	public static void setMinimumBalance(int minBlanace) {
		MINIMUM_BALANCE = minBlanace;
	}

	public static int getNoOfTransaction() {
		return noOfTransactions;
	}
	@Override
	public  String toString() {
		System.out.println(super.toString());
		String stringContainingOutput = String.format("Account No = " +accNo+ "\nName = " +name+ "\nBalance = " +balance);		
		
		return stringContainingOutput;
	}
}
