package com.techlabs.model;

public class PaytmPayment implements IPayment{
	private String emailId;
	private String password;
	
	public PaytmPayment(String emailId, String password){
		this.emailId=emailId;
		this.password=password;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
