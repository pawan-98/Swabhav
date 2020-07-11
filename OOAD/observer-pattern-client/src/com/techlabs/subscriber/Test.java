package com.techlabs.subscriber;

import com.techlabs.client.SmsObserver;
import com.techlabs.publisher.Account;

public class Test {
	public static void main(String args[]) {
		Account account = new Account(101, 60000, "Pawan");
		account.addBalanceObserver(new SmsObserver());
		account.addBalanceObserver(new EmailObsever());
		account.deposit(1000);
		account.withdraw(1000);
	}
}
