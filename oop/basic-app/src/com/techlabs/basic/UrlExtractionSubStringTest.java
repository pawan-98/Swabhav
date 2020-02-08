package com.techlabs.basic;

public class UrlExtractionSubStringTest {

	public static void main(String[] args) {

		// String url = "https://developer=pawan&role=architect";
		// String url = "https://www.swabhavtechlabs.com?role=architect";
		// String url = "https://www.swabhavtechlabs.com?developer=pawan&";
		String url = "https://www.swabhavtechlabs.com?developer=pawan&role=architect";

		boolean testRole = url.contains("role");
		boolean testDeveloper = url.contains("developer");
		boolean testCompany = url.contains("www");

		// Displaying company name
		if (testCompany == true) {
			int companyNameStart = url.indexOf('.');
			int companyNameEnd = url.lastIndexOf('.');
			String companyString = url.substring(companyNameStart + 1, companyNameEnd);
			System.out.println("Company name = " + companyString);
		} else {

			System.out.println("Comany name not found");
		}

		// Displaying Developer name
		if (testDeveloper == true) {
			int developerNameStart = url.indexOf('=');
			int developerNameEnd = url.lastIndexOf('&');
			String developerString = url.substring(developerNameStart + 1, developerNameEnd);
			System.out.println("Developer name = " + developerString);
		} else {

			System.out.println("Developer not found");
		}

		// Displaying Role
		if (testRole == true) {
			int roleEnd = url.length();
			int roleStart = url.lastIndexOf('=');
			String roleString = url.substring(roleStart + 1, roleEnd);
			System.out.println("Role = " + roleString);
		} else {
			System.out.println("Role not found");
		}
	}

}
