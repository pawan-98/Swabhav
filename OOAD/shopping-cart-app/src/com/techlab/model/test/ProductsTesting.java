package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Product;

class ProductsTesting {
	 static Product chair;
		@BeforeAll
		public static void runThisEveryTime() {
			 chair = new Product(1, "chair", 90, 60);
		}
	@Test	
	void test_toCheckIfProductsgetNameIsWorking() {
		assertEquals("chair", chair.getName());
	}
	@Test
	void test_toCheckIfProductsgetPriceIsWorking() {
		assertEquals(90, chair.getPrice());
	}
	@Test
	void test_toCheckIfProductsgetDisscountPercentageIsWorking() {
		assertEquals(60, chair.getDiscountPercentage());
	}
	@Test
	void test_toCheckIfProductsgetIdIsWorking() {
		assertEquals(1, chair.getId());
	}

}
