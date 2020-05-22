package com.techlabs.model;

public class Circle implements IShape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		
		return (22/7)*radius*radius;
	}

}
