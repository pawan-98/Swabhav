package com.techlabs.boxing;

public class UnboxingTest {
	public static void main(String args[]) {
		Integer object = new Integer("456");
		unboxingToInt(object);

	}

	public static void unboxingToInt(int inputVariable) {
		System.out.println(inputVariable);
	}
}
