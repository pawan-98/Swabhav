package com.techlabs.model.test;

import com.techlabs.model.ColorType;
import com.techlabs.model.Rectangle;

public class RectangleTest {
	public static void main(String args[]) {
		
		Rectangle r1 = new Rectangle(10, 5, ColorType.GREEN);
		printDetails(r1);
		
		Rectangle r2 = new Rectangle(-5, -2);
		printDetails(r2);
		
		Rectangle r3 = new Rectangle(4, 5,ColorType.RED);
		printDetails(r3);
		
		Rectangle r4 = new Rectangle(10,2,ColorType.BLUE);
		printDetails(r4);
		
		Rectangle r5 = new Rectangle(4, 5,null);
		printDetails(r5);

	}
public static void printDetails(Rectangle rect) {
		
		System.out.println("Colour " + rect.getColour());
		System.out.println("Height " + rect.getHeight());
		System.out.println("Width " + rect.getWidth());
		System.out.println("Area " + rect.calculateArea()+"\n");

	}

}
