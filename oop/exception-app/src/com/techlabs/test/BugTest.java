package com.techlabs.test;

public class BugTest {

	public static void main(String args[]) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);	
			int c = a/b;
			System.out.println(c);			
		} catch (NumberFormatException e) {
			System.out.println("Enter only integers");
		}catch(ArithmeticException e) {
			System.out.println("cant divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You need to pass reuired number of values");
		}

		
		System.out.println("End of main");
		
		//main(args);
		
	}
	
	
}
