package com.techlab.model;

public class LineItem {
	private int id;
	private String name;
	private double price;
	private int quantity;
	
	public LineItem(int id,String name,double price,int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity=quantity;
	}
	public double calculateTotal() {
		return this.price*this.quantity;
	}
	public int  getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
}
