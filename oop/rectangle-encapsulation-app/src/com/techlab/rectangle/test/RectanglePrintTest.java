package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectanglePrintTest {

public static void main(String args[]) {
	
	Rectangle r1 = new Rectangle();
	r1.setHeight(5);
	r1.setWidth(10);
	Rectangle r2 = new Rectangle();
	printInfo(r1);
	printInfo(r2);
	
	}
	public static void printInfo(Rectangle r) {
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.calculateArea());
	}
}
