package com.techlabs.calisthenics;

public class WithRuleOneTest {
	public static void main(String args[]) {

		System.out.println("Addistion of inputs:- " + additionOfNumbers(45, 10));
		System.out.println("Subtraction of inputs:- " + subtractionOfNumbers(45, 10));

	}

	public static int additionOfNumbers(int firstInput, int secondInput) {

		int add;
		add = firstInput + secondInput;

		return add;
	}

	public static int subtractionOfNumbers(int firstInput, int secondInput) {

		int sub;
		sub = firstInput - secondInput;

		return sub;
	}

}
