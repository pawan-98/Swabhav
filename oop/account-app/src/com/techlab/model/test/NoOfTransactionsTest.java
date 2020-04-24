package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.Account;

class NoOfTransactionsTest {

	@Test
	void test_checkIfNoOfTransactionFetchedIsCorrect() {
		Account accountObject = new Account(5000);
		accountObject.deposit(500);
		accountObject.withdraw(600);
		accountObject.withdraw(900);
		accountObject.deposit(4000);
		int expectedNoOfTransaction = accountObject.getNoOfTransaction();
		assertEquals(4, expectedNoOfTransaction);
	}

}
