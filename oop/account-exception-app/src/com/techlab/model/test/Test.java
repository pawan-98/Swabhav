package com.techlab.model.test;

import java.io.IOException;

import javax.naming.InsufficientResourcesException;

import com.techlab.model.Account;

public class Test {
	public static void main(String args[]) {
		Account acc = new Account(101,"abc",1000);
		Account.setMinimumBalance(100);
		try {
		acc.withdraw(6000);
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		System.out.println("End of main");
	
	}

}
