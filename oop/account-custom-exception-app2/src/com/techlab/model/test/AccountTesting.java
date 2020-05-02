package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientFundsException;

class AccountTesting {
	static Account accountObject ;
	@BeforeAll
	public static void runThisEveryTime() {
		accountObject = new Account(101, "Pawan", 5000);
	}


	@Test
	void test_toCheckIfWithdrawMethodIsThrowingException() {
		Assertions.assertThrows(InsufficientFundsException.class, () -> {

			accountObject.withdraw(5000);

		});
	}
	
	@Test
	void test_toCheckIfWithdrawMethodIsThrowingCorrectExcceptionMessage() {
		Exception exception = Assertions.assertThrows(InsufficientFundsException.class, () -> {

			accountObject.withdraw(5000);

		});
		assertEquals("Pawan your Current balance for account 101.0 is 5000.0", exception.getMessage());

	}
	@Test
	void test_checkIfNoOfTransactionFetchedIsCorrect() {
		accountObject.deposit(500);
		accountObject.withdraw(600);
		accountObject.withdraw(900);
		accountObject.deposit(4000);
		int expectedNoOfTransaction = accountObject.getNoOfTransaction();
		assertEquals(4, expectedNoOfTransaction);
	}
}
