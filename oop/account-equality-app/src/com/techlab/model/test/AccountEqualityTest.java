package com.techlab.model.test;

import com.techlab.model.Account;

public class AccountEqualityTest {
	public static void main(String args[]) {
	
		Account acc1 = new Account(101,"abc",5000);
		Account acc2 = new Account(101,"abc",5000);
		System.out.println(acc1.hashCode());
		System.out.println(acc2.hashCode());
		
		Account acc3 = acc1;
		System.out.println(acc1 == acc1);
		System.out.println(acc1 == acc2); 
		System.out.println(acc3 == acc1);
		System.out.println();
	
	
		System.out.println(acc1.equals(acc1));
		System.out.println(acc1.equals(acc2)); 
		
	}

}
