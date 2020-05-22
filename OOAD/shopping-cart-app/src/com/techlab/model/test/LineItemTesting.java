package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.LineItem;
import com.techlab.model.Product;

class LineItemTesting {
	 static Product chair;
	 static LineItem chairItem;
		@BeforeAll
		public static void runThisEveryTime() {
			 chair = new Product(1, "chair", 90, 60);
			 chairItem = new LineItem(101, 10, chair);
		}

	@Test
	void test_toCheckGetIdIsWorkingProperly() {
		assertEquals(101, chairItem.getId());
	}
	@Test
	void test_toCheckGetQuanntityIsWorkingProperly() {
		Product pencil = new Product(2, "pencil", 15, 55);
		LineItem pencilItem = new LineItem(202, 10, pencil);
		assertEquals(10, pencilItem.getQuantity());
	}
	@Test
	void test_toCheckSetQuanntityIsWorkingProperly() {
		chairItem.setQuantity(40);
		System.out.println(chairItem.getQuantity());
		
		assertEquals(40,chairItem.getQuantity());
	}
	

}
