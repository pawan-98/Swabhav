package com.techlab.model.test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientFundsException;

public class Test {
	public static void main(String args[]) {
		Account acc = new Account(101,"abc",5000);
		Account.setMinimumBalance(100);
		try {
		acc.withdraw(5000);
		}catch(InsufficientFundsException e){
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
	}

}
