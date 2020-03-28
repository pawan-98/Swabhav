package com.techlab.model;

public class Customer {
	private String name;
	private int orders;
	private String id;
	private static int count;
	static {
		count = 1000;
	}

	public Customer(String name, int orders) {
		this.orders = orders;
		this.name = name;
		count = count + 1;
		this.id = "C" + Integer.toString(count);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getOrders() {
		return orders;
	}
}
