package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String args[]) {
		
		Rectangle small = new Rectangle();
		small.height=5;
		small.width=10;
		small.checkDimentions();
		int area = small.calculateArea();
		System.out.println(area);
		
		Rectangle big = new Rectangle();
		big.height=-5;
		big.width=100;
		big.checkDimentions();
		int area1 = big.calculateArea();
		System.out.println(area1);
		
	}
}
