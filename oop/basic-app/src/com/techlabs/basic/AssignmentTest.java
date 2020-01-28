package com.techlabs.basic;

public class AssignmentTest {

	public static void main(String[] args) {
		String inputString = "https://www.swabhavtechlabs.com?developer=pawan&role=architect";
        
		//Displaying company name
		int companyNameStart = inputString.indexOf('.');
		int companyNameEnd = inputString.lastIndexOf('.');
		String companyString = inputString.substring(companyNameStart + 1, companyNameEnd);
		System.out.println("Company name = "+companyString);
	    
		//Displaying Developer name
		int developerNameStart = inputString.indexOf('=');
		int developerNameEnd = inputString.lastIndexOf('&');
		String developerString = inputString.substring(developerNameStart + 1, developerNameEnd);
		System.out.println("Developer name = "+developerString);
	
		//Displaying Role
				int roleEnd = inputString.length();
				int roleStart = inputString.lastIndexOf('=');
				String roleString = inputString.substring(roleStart + 1, roleEnd);
				System.out.println("Role = "+roleString);	
	
	}

}
