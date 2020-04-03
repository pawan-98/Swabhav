package com.techlab.model;

public class Customer {
	private String name;
	private int orders;
	private String id;
	private static int nextId;
	static {
		nextId = 1000;
	}

	public Customer(String name, int orders) {
		this.orders = orders;
		this.name = name;
		nextId = nextId + 1;
		this.id = "C" + nextId;
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
