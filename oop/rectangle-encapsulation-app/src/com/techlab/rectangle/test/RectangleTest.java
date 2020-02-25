package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.setHeight(-400);
		r1.setWidth(5);
		r1.checkDimensions();
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		System.out.println(r1.calculateArea());
		
	}

}
