package com.techlabs.calisthenics;

public class WithoutRuleOneTest {
	public static void main(String args[]) {
		int arrayOfInt[] = { 1, 2, 3, 4, 5 };
		boolean temp = true;
		if (temp) {
			for (int i = 0; i < arrayOfInt.length; i++) {

				System.out.println(arrayOfInt[i]);
			}

		} else {
			System.out.println("Nothing to show.");
		}

	}

}
