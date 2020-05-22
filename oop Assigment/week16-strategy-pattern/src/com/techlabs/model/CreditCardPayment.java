package com.techlabs.model;

public class CreditCardPayment implements IPayment{
	private String name;
	private String cardNumber;
	private String cvv;
	
	public  CreditCardPayment(String name, String cardNumber, String cvv){
		this.name=name;
		this.cardNumber=cardNumber;
		this.cvv=cvv;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount +" paid with credit/debit card");	
	}

}
