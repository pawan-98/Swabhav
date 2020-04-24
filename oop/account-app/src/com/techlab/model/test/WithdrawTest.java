package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.Account;

class WithdrawTest {

	@Test
	void test_checkingWhetherMoneyIsWithdrawnProperly() {
		Account accountObject = new Account(5000);
		accountObject.withdraw(500);
		double expectedBalance= accountObject.getBalance();
		assertEquals(4500, expectedBalance);
	}

}
