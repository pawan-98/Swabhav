package com.techlabs.model;

public class Rectangle implements IShape {
	private int width;
	private int length;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width=width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

}
