package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.techlab.model.LineItem;
import com.techlab.model.Order;
import com.techlab.model.Product;

class OrderTesting {

	@Test
	void test_toCheckIfCheckOutCostIsWorking() throws ParseException {
		Product chair = new Product(1, "chair", 90, 60);
		LineItem chairItem = new LineItem(201, 12, chair);
		Order order1 = new Order(1, "1/02/2020");
		order1.addItem(chairItem);
		System.out.println(order1.checkoutCost());
		assertEquals(1080.0, order1.checkoutCost());
	}
	@Test
	void test_toCheckIfAddItemIsWorking() throws ParseException {
		Product chair = new Product(1, "chair", 90, 60);
		LineItem chairItem = new LineItem(201, 12, chair);
		Order order1 = new Order(1, "1/02/2020");
		order1.addItem(chairItem);
		order1.addItem(chairItem);
		order1.addItem(chairItem);
		System.out.println(order1.checkoutCost());
System.out.println(order1.getItems().get(0).getQuantity());
		assertEquals(48, order1.getItems().get(0).getQuantity());
	}

}
