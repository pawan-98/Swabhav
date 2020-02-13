package com.techlabs.boxing;

public class BoxingTest {

	public static void main(String args[]) {

		boxingOfInt(456);

	}

	public static void boxingOfInt(int inputInt) {

		Integer object = new Integer(inputInt);
		int i = object.intValue();
		System.out.println(i);
	}

}
