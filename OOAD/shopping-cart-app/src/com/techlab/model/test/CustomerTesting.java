package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Customer;
import com.techlab.model.Product;

class CustomerTesting {
	static Customer cutomer;
	@BeforeAll
	public static void runThisEveryTime() {
		cutomer= new Customer(101, "kishore", "Chembur");
	}
	@Test
	void test_toChectIfgetIdIsWorking() {
		assertEquals(101, cutomer.getId());
	}
	@Test
	void test_toChectIfgetNameIsWorking() {
		assertEquals("kishore", cutomer.getName());
	}
	@Test
	void test_toChectIfgetAddressIsWorking() {
		assertEquals("Chembur", cutomer.getAddress());
	}

}
