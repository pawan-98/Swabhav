package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.Account;

class DepositTest {

	@Test
	void test_checkingWhetherMoneyIsDepositedProperly() {
		Account accountObject = new Account(5000);
		accountObject.deposit(500);
		double expectedBalance= accountObject.getBalance();
		assertEquals(5500, expectedBalance);
	}

}
