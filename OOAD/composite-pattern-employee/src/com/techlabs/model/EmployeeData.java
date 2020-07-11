package com.techlabs.model;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	CsvFileLoader csvFileLoader;
	UrlLoader urlLoader;
	ILoader loader;
	List<String> data = new ArrayList<String>();
	ArrayList<Employee> personsData = new ArrayList<Employee>();

	public EmployeeData(ILoader loader) throws MalformedURLException {
		this.loader = loader;
		data = loader.getData();
	}

	public ArrayList<Employee> getData() {

		List<String> lines = data;
		for (String line : lines) {
			String[] parts = line.split(",");
			parts[1] = cleanData(parts[1]);
			parts[2] = cleanData(parts[2]);
			parts[4] = cleanData(parts[4]);
			parts[6] = removeNull(parts[6]);
			parts[3] = removeNull(parts[3]);
			parts[7] = removeNull(parts[7].replaceAll("\\s+", ""));

			personsData.add(new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
					parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7])));
		}
		addRepotees(personsData);
		return personsData;
	}

	public void addRepotees(ArrayList<Employee> employees) {
		for (Employee employeeFromFirstLoop : employees) {
			for (Employee employeeFromSecondLoop : employees) {
				if (employeeFromSecondLoop.getManagerId() == employeeFromFirstLoop.getId()) {
					employeeFromFirstLoop.addEmployeesUnderThisEmployee(employeeFromSecondLoop);
				}
			}
		}
	}

	public String cleanData(String givenString) {
		givenString = givenString.replace("'", "");
		return givenString;
	}

	public String removeNull(String givenString) {
		if (givenString.equals("NULL")) {
			givenString = "0";
		}
		return givenString;
	}

}
