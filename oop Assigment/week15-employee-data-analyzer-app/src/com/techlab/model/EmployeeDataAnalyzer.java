package com.techlab.model;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class EmployeeDataAnalyzer {
	CsvFileLoader csvFileLoader;
	UrlLoader urlLoader;
	ILoader loader;
	TreeSet<Employee> treeSet = new TreeSet<Employee>();
	List<String> data = new ArrayList<String>();
	TreeSet<Employee> personsData = new TreeSet<Employee>(new Comparator<Employee>() {

		@Override
		public int compare(Employee obj1, Employee obj2) {

			return Integer.compare(obj1.getSalary(), obj2.getSalary());
		}
	});


	public EmployeeDataAnalyzer(ILoader loader) throws MalformedURLException {
		this.loader = loader;
		data = loader.getData();
	}

	public Map<String, Integer> getCountAccordingToDesignation() {
		
		List<String> lines = data;
		for (String line : lines) {
			String[] parts = line.split(",");
			parts[1] = cleanData(parts[1]);
			parts[2] = cleanData(parts[2]);
			parts[4] = cleanData(parts[4]);
			parts[6] = removeNull(parts[6]);
			parts[3] = removeNull(parts[3]);
			try {
				personsData.add(new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]),
						parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7])));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (Employee employee : personsData) {
			String employeeDesignation = employee.getDesignation();
			if (map.containsKey(employeeDesignation)) {
				map.put(employeeDesignation, map.get(employeeDesignation) + 1);
			} else {
				map.put(employeeDesignation, 1);
			}
		}
		return map;
	}

	public Employee getMaxSalariedEmployee() {
		Employee maxSalariedEmployee = null;
		int temp = 0;
		
		for (Employee employee : personsData) {
			if (employee.getSalary() > temp) {
				maxSalariedEmployee = employee;
			}
		}
		return maxSalariedEmployee;
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
