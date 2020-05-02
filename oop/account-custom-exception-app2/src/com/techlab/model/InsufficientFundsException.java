package com.techlab.model;

public class InsufficientFundsException extends RuntimeException{
	String errorMessageString;
	public InsufficientFundsException(Account acc) {
		
		//System.out.println(acc.getName()+" your Current balance for account is "+acc.getId()+" is "+acc.getBalance());
		//super(acc.getName()+" your Current balance for account is "+acc.getId()+" is "+acc.getBalance());
		errorMessageString = acc.getName()+" your Current balance for account "+acc.getId()+" is "+acc.getBalance();
	}
	
	public String getMessage() {
		return errorMessageString;
	}

}
