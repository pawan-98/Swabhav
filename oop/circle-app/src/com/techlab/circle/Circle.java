package com.techlab.circle;

public class Circle {
	private float radius;
	private static final double PI = 3.14;

	public float getRadius() {

		return radius;

	}

	public void setRadius(float inputRadius) {

		radius = inputRadius;
	}

	public double calculateArea() {

		return PI * radius * radius;
	}

	public double calculatePerimeter() {

		return 2 * PI * radius;
	}
}
