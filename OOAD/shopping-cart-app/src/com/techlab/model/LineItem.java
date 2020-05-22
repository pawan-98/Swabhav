package com.techlab.model;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;
	
	public LineItem(int id, int quantity, Product product) {
		this.id=id;
		this.quantity=quantity;
		this.product=product;
	}
	
	public double calculateItemCost() {
		double cost = quantity*(product.getPrice());
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public Product getProduct() {
		return product;
	}
	

}
