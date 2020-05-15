package com.techlab.model.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.TreeSet;

import com.techlab.model.DatabaseGenerator;
import com.techlab.model.Person;

public class DataAnalyzerTest {
	public static void main(String args[]) throws MalformedURLException {
		TreeSet<Person> personsData = new TreeSet<Person>();
		DatabaseGenerator db = new DatabaseGenerator();
		String theUrl =  "https://swabhav-tech.firebaseapp.com/emp.txt";
		URL url = new URL(theUrl);
		File file = new File("dataFile_emp.txt"); 
		personsData = db.getNames(url);
		
		printData(personsData, "Clerk");
		printData(personsData, "Manager");
		printData(personsData, "Salesman");
		printData(personsData, "President");
		printData(personsData, 10);
		printData(personsData, 20);
		printData(personsData, 30);
		printMaxSalary(personsData);
	}

	public static void printData(TreeSet<Person> personsData, String designation) {
		int count = 0;
		for (Object data : personsData) {
			Person person = (Person) data;
			if (person.getDesignation().equalsIgnoreCase(designation)) {
				count++;
			}
		}

		System.out.println("Count of number for employees for designation " + designation + " is " + count);

	}

	public static void printData(TreeSet<Person> personsData, int departmentNo) {
		int count = 0;
		for (Object data : personsData) {
			Person person = (Person) data;
			if (person.getDepartmentNo() == departmentNo) {
				count++;
			}
		}

		System.out.println("Count of number for employees of department " + departmentNo + " is " + count);

	}
	public static void printMaxSalary(TreeSet<Person> personsData) {
		Person maxSalariedEmployee = null;
		int temp =0;
		for (Object data : personsData) {
			Person person = (Person) data;
			if (person.getSalary() > temp ) {
				maxSalariedEmployee = person;
			}
		}
		System.out.println("Maximum Salaried employee is "+maxSalariedEmployee.getName() );
	}
}
