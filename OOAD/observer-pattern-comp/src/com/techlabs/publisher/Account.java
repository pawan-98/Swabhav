package com.techlabs.publisher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private List<IBalanceObserver> observers;

	public Account(int accNo, double balance, String name) {
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
		observers= new ArrayList<IBalanceObserver>();
	}

	public void deposit(double amount) {
		this.balance = this.balance + amount;
		update();
	}

	public void withdraw(double amount) {
		this.balance = this.balance - amount;
		update();
	}
	
	public void addBalanceObserver(IBalanceObserver observer) {
		observers.add(observer);
	}
	public int getAccNo() {
		return this.accNo;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}
	private void update() {
		Iterator<IBalanceObserver> i = observers.iterator();
	      while (i.hasNext()) {
	         i.next().update(this);
	      }
	}
}
