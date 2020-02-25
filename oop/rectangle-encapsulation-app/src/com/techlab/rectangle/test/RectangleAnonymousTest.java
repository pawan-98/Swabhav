package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleAnonymousTest {
	public static void main(String args[]) {
		System.out.println(new Rectangle());
		System.out.println(new Rectangle());

		new Rectangle().setHeight(5);
		new Rectangle().setWidth(10);
		System.out.println(new Rectangle().getHeight());
		System.out.println(new Rectangle().getWidth());
		printInfo(new Rectangle());
		
		
		
		
	}
	public static void printInfo(Rectangle r) {
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.calculateArea());
		
		
	}

}
