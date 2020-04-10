package com.techlab.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CsvTest {
	public static void main(String args[]) throws FileNotFoundException {

		String filename = "products_updated.csv";
		File file = new File(filename);
		String[] testArray = new String[10];

		int i = 0;
		Scanner inputStream = new Scanner(file);
		while (inputStream.hasNext()) {

			String data = inputStream.nextLine();

			String[] products = data.split(",");

			if (products.length == 4 && i != 0) {
				displyPurchaseCost(products);
			}

			testArray[i] = data;
			i++;
		}

		inputStream.close();
	}

	public static void displyPurchaseCost(String[] products) {
		double finalAmount;
		System.out.println("id= " + products[0] + " productName= " + products[1] + " Buying amount= " + products[2]
				+ " Discount Percentage= " + products[3]);
		finalAmount = (100 - Double.parseDouble(products[3])) * (Double.parseDouble(products[2])) / 100;
		System.out.println("final amount after discount " + finalAmount);
	}

}
