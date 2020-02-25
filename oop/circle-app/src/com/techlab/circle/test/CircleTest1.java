package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest1 {

	public static void main(String args[]) {
		
		
		Circle c1 = new Circle();
		c1.setRadius(5);
		System.out.println(c1.getRadius());
		System.out.println(c1.calculateArea());
		System.out.println(c1.calculatePerimeter());
	}
	
}
