package com.techlabs.subscriber;

import com.techlabs.publisher.Account;
import com.techlabs.publisher.IBalanceObserver;

public class EmailObsever implements IBalanceObserver {
	@Override
	public void update(Account account) {
		System.out.println("Balanced changed to " + account.getBalance());
		System.out.println("Email sending....");

	}
}
