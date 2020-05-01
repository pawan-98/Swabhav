package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Account;


class AccountTest {
	static Account accountObject ;
	@BeforeAll
	public static void runThisEveryTime() {
		accountObject = new Account(101, "Pawan", 5000);
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

	

	@Test
	void test_toCheckIfWithdrawMethodIsThrowingException() {

		Assertions.assertThrows(RuntimeException.class, () -> {

			accountObject.withdraw(5000);

		});
	}

	@Test
	void test_toCheckIfWithdrawMethodIsThrowingCorrectExcceptionMessage() {

		Exception exception = Assertions.assertThrows(RuntimeException.class, () -> {

			accountObject.withdraw(5000);

		});
		assertEquals("Insufficient banance", exception.getMessage());

	}

}
