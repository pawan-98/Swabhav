package com.techlabs.model.test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.techlabs.model.CsvFileLoader;
import com.techlabs.model.Employee;
import com.techlabs.model.EmployeeData;
import com.techlabs.model.UrlLoader;

public class Test {
	public static void main(String args[]) throws MalformedURLException {
		EmployeeData data = new EmployeeData(new CsvFileLoader());
		ArrayList<Employee> employees= data.getData();
		System.out.println(employees.get(6).show(0));
	}

}
