package com.techlab.model.test;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import com.techlab.model.CsvFileLoader;
import com.techlab.model.Employee;
import com.techlab.model.EmployeeDataAnalyzer;
import com.techlab.model.UrlLoader;

public class EmployeeDataAnalyzerTest {
	public static void main(String args[]) throws MalformedURLException {

		EmployeeDataAnalyzer analyzer = new EmployeeDataAnalyzer(new UrlLoader());
		printInfoAccordinfToDesignation(analyzer.getCountAccordingToDesignation());
		printInfo(analyzer.getMaxSalariedEmployee());
		

	}

	public static void printInfoAccordinfToDesignation(Map<String, Integer> map) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Count Of " + entry.getKey() + " is  " + entry.getValue());
		}
	}


	public static void printInfo(Employee employee) {
		System.out.println("Max salaried employee is " + employee.getName());
	}

}
