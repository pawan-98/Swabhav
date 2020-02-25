package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleRefOneTest {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2;
		r2=r1;
		r2.setWidth(r2.getWidth()+1);
		r2.setHeight(r2.getHeight()+1);
		System.out.println(r1.getWidth());
		System.out.println(r1.getHeight());
		System.out.println(r2.getWidth());
		System.out.println(r2.getWidth());
		Rectangle r3 = new Rectangle();
		r2=r3;
		System.out.println(r2.getHeight());
		
	}

}
