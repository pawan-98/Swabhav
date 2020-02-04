package com.techlabs.basic;

import java.util.Arrays;

public class urlExtractionSplitTest {

	public static void main(String args[]) {
		//String url = "https://developer=pawan&role=architect";
		//String url = "https://www.swabhavtechlabs.com?role=architect";
		//String url = "https://www.swabhavtechlabs.com?developer=pawan&";
		String url = "https://www.swabhavtechlabs.com?developer=pawan&role=architect";

		boolean testRole = url.contains("role");
		boolean testDeveloper = url.contains("developer");
		boolean testCompany = url.contains("www");

		url = url.replaceAll("[^a-zA-Z0-9]", " ");

		String[] splittedString = url.split(" ");
		int splittedStringLength = splittedString.length;

		for (int i = 0; i <= splittedStringLength - 1; i++) {

			if (splittedString[i].equals("www")) {

				System.out.println("Company Name = " + splittedString[i + 1]);
			} else if (splittedString[i].equals("developer")) {
				System.out.println("Developer Name = " + splittedString[i + 1]);

			} else if (splittedString[i].equals("role")) {

				System.out.println("Role = " + splittedString[i + 1]);
			}

		}

		if (testCompany == false) {
			System.out.println("Company Name not found");
		}

		if (testDeveloper == false) {
			System.out.println("Developer Name not found");
		}

		if (testRole == false) {

			System.out.println("Role not found");

		}

	}

}
