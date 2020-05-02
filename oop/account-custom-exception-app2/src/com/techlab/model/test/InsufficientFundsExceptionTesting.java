package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientFundsException;

class InsufficientFundsExceptionTesting {

	
	@Test
	void test_toCheckIfWithdrawMethodIsThrowingCorrectExcceptionMessage() {
		Account accountObject = new Account(101, "Pawan", 5000);
		Exception exception = Assertions.assertThrows(InsufficientFundsException.class, () -> {

			accountObject.withdraw(5000);

		});
		assertEquals("Pawan your Current balance for account 101.0 is 5000.0", exception.getMessage());

	}

}
