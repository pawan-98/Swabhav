package com.techlabs.client;

import com.techlabs.component.Account;
import com.techlabs.component.AccountFactory;
import com.techlabs.component.AccountType;

public class AccountTest {
	public static void main(String args[]) throws Exception {
		AccountFactory factory = AccountFactory.getInstance();
		Account acc = factory.make(AccountType.SA);
		acc.setAccNo(101);
		acc.setName("Pawan");
		acc.deposit(10000);
		acc.withdraw(10000);
		printInfo(acc);
		
	}
	public static void printInfo(Account acc) {
		System.out.println(acc.getAccNo());
		System.out.println(acc.getBalance());
		System.out.println(acc.getName());
	}

}
