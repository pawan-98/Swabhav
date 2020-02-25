package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleRefTest {
	public static void main(String args[]) {
		Rectangle r1=null ;
		Rectangle r2 = new Rectangle();
		
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
		
		r2.setHeight(4);
		r2.setWidth(5);
		System.out.println(r2.getHeight());
		System.out.println(r2.getWidth());
		r1=r2;
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		
		Rectangle r3 = new Rectangle();
		System.out.println(r1.getHeight());
		System.out.println(r1.getWidth());
	}

}
