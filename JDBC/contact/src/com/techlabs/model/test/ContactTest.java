package com.techlabs.model.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.techlabs.model.Contact;

public class ContactTest {

	public static void main(String[] args) throws SQLException {
		Contact contact = new Contact();
		int input =100;
		Scanner sc = new Scanner(System.in);
		while (input !=0) {
			System.out.println("Select your choice:- \n 1)Display \n 2)Add \n 3)Delete \n 0)Exit \n");
			input= sc.nextInt();
			if(input==1) {
				System.out.println(contact.display());
			}
			else if(input == 2) {
				String firstName;
				String lastName;
				String number;
				String email;
				
				System.out.println("Enter first name:-\n");
				firstName = sc.next();
				
				System.out.println("Enter last name:-");
				lastName = sc.next();
				
				System.out.println("Enter contact:-");
				number = sc.next();
				
				System.out.println("Enter email:-");
				email = sc.next();
				contact.add(firstName, lastName, number, email);
				System.out.println("Contact added");
			}
			else if (input == 3) {
				String contactNumber;
				System.out.println("Enter number of whose row you want to delete:-");
				contactNumber=sc.next();
				contact.delete(contactNumber);
			}
			else if (input==0) {
				System.out.println("Exiting!!!");
			}
			else {
				System.out.println("Enter correct input.");
			}
		}
		
	}

}
