package com.techlab.model;

public class Product {

	private int id;
	private String name;
	private double price;
	private float dicountPercentage;
	
	public Product(int id, String name, double price, float discountPercentage) {
		this.id=id;
		this.dicountPercentage=discountPercentage;
		this.name=name;
		this.price=price;
	}
	
	public double totalCost() {
		return price*(dicountPercentage/100);
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
	public float getDiscountPercentage() {
		return dicountPercentage;
	}
	
	public String getName() {
		return name;
	}
	
}
