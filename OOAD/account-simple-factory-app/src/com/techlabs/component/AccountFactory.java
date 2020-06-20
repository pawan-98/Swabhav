package com.techlabs.component;


public class AccountFactory {
	private static AccountFactory instance;
	private AccountFactory() {
		
	}
	public static AccountFactory getInstance() {
		if (instance == null) {
			instance= new AccountFactory();
		}
		return instance;
	}
	public Account make(AccountType type) {
			if (type.equals(AccountType.CA)) {
				return new CurrentAccount();
			} 
				return new SavingsAccount();
	}
}
