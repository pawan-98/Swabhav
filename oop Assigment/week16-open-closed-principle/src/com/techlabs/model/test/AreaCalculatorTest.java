package com.techlabs.model.test;

import com.techlabs.model.AreaCalculator;
import com.techlabs.model.Circle;
import com.techlabs.model.IShape;

public class AreaCalculatorTest {
	public static void main(String args[]) {
		AreaCalculator areaCalculator = new AreaCalculator();
		IShape shape = new Circle(5);
		System.out.println(areaCalculator.calculateShapeArea(shape));
		
	}
	
	

}
