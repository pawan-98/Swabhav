package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String address;
	private List<Order> orders = new ArrayList<Order>();
	
	public Customer(int id, String name, String address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public List<Order> getOrders(){
		return orders;
	}

}
