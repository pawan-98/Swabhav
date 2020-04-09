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
			
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()) {
				String data = inputStream.next();
				System.out.println(data+ "***" );
				
			}

			inputStream.close();
	}
}
