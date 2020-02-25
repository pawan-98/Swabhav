package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest2 {
	public static void main(String args[]) {

		Circle[] circles = new Circle[5];

		Circle c0 = new Circle();
		c0.setRadius(5);
		circles[0] = c0;

		Circle c1 = new Circle();
		c1.setRadius(15);
		circles[1] = c1;

		Circle c2 = new Circle();
		c2.setRadius(20);
		circles[2] = c2;

		Circle c3 = new Circle();
		c3.setRadius(07);
		circles[3] = c3;

		Circle c4 = new Circle();
		c4.setRadius(25);
		circles[4] = c4;
		for(int i =0;i<circles.length;i++) {
		printInfo(circles[i]);
		}
		findBigAndSmallCircle(circles);
		
	}
	
	

	public static void printInfo(Circle circ) {
		
			//System.out.println("Data for circle" + i);
			System.out.println("Radius:-" + circ.getRadius());
			System.out.println("Area:-" + circ.calculateArea());
			System.out.println("Perimeter:-" + circ.calculatePerimeter());

		
	}
	public static void findBigAndSmallCircle(Circle[] circleArray) {
		Circle biggerCircle= circleArray[0];
		Circle smallerCircle= circleArray[0];
		for(int i = 0;i<circleArray.length;i++) {
			if(biggerCircle.getRadius()<circleArray[i].getRadius()) {
				biggerCircle=circleArray[i];
			}
			if(smallerCircle.getRadius()>circleArray[i].getRadius()) {
				smallerCircle=circleArray[i];
			}
			
		}
		System.out.println("Radius of biggest circle:- "+biggerCircle.getRadius());
		System.out.println("Radius of smallest circle:- "+smallerCircle.getRadius());
		
	}
	
}
