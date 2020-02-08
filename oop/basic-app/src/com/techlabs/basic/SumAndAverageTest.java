package com.techlabs.basic;

public class SumAndAverageTest {

	public static void main(String numbers[]) {

		if (numbers.length == 0) {
			System.out.println("No argumnets passed");
			return;

		}

		sumOfNumbers(numbers);

	}

	public static void sumOfNumbers(String numbers[]) {
		int sum = 0;
		int arrayLength = numbers.length;
		int temp = 0;

		if (numbers[arrayLength - 1].equals("-even")) {
			for (int i = 0; i < arrayLength - 1; i++) {
				if ((Integer.parseInt(numbers[i]) % 2 == 0)) {
					sum = sum + Integer.parseInt(numbers[i]);
					System.out.print(numbers[i] + " ");
					temp++;
				}
			}

		} else if (numbers[arrayLength - 1].equals("-odd"))
			for (int i = 0; i < arrayLength - 1; i++) {
				if ((Integer.parseInt(numbers[i]) % 2 == 1)) {
					sum = sum + Integer.parseInt(numbers[i]);
					System.out.print(numbers[i] + " ");
					temp++;
				}
			}
		else {
			for (int i = 0; i < arrayLength; i++) {

				sum = sum + Integer.parseInt(numbers[i]);
				System.out.print(numbers[i] + " ");
				temp++;

			}
		}

		int average = sum / temp;
		System.out.println("\nSum is:- " + sum);
		System.out.println("Average is:- " + average);

	}
}
