package com.techlabs.basic;

public class OverloadingTest {

	public static void main(String[] args) {
		System.err.println("hello world");
		System.err.println(false);
		System.err.println("f");
		System.err.println(5.00);
		System.err.println(5.0);

		printInfo("hello");
		printInfo(5.0);                                                         
		printInfo(6.0);
		printInfo(true);
		printInfo("k");
	}

	private static void printInfo(String inputString) {
		System.out.println(inputString);

	}

	public static void printInfo(double inputDouble) {
		System.out.println(inputDouble);

	}

	public static void printInfo(float inputfloat) {
		System.out.println(inputfloat);

	}

	public static void printInfo(Boolean inputBoolean) {
		System.out.println(inputBoolean);

	}

	public static void printInfo(Character inputCharacter) {
		System.out.println(inputCharacter);

	}

}
