package com.techlabs.basic;

public class WelcomeTest {

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

	public static void printInfo(String s) {
		System.out.println(s);

	}

	public static void printInfo(double s) {
		System.out.println(s);

	}

	public static void printInfo(float s) {
		System.out.println(s);

	}

	public static void printInfo(Boolean s) {
		System.out.println(s);

	}

	public static void printInfo(Character s) {
		System.out.println(s);

	}

}
