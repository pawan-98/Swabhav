package com.techlab.model.test;

import com.techlab.model.Account;

public class AccountToStringTest {
	public static void main(String args[]) {
		Account.setMinimumBalance(500);

		Account a1 = new Account(5000, "Pawan", 101);
		a1.withdraw(500);
		a1.deposit(4000);

		Account a2 = new Account(7000, "Amit", 202);
		a2.withdraw(700);
		a2.deposit(600);

		System.out.println("Number of trnasactions:- " + Account.getNoOfTransaction());

		System.out.println(a1.toString());

	}

}
