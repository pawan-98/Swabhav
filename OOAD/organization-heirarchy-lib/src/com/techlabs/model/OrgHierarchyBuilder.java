package com.techlabs.model;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrgHierarchyBuilder {
	CsvFileLoader csvFileLoader;
	UrlLoader urlLoader;
	ILoader loader;
	List<String> data = new ArrayList<String>();
	Map<Integer, Employee> employeeData = new TreeMap<Integer, Employee>();

	public OrgHierarchyBuilder(ILoader loader) throws MalformedURLException {
		this.loader = loader;
		data = loader.getData();
	}

	public Employee getCeo() {
		for (Map.Entry employee : employeeData.entrySet()) {
			Employee currentEmployee = (Employee) employee.getValue();
			if (currentEmployee.getDesignation().contains("PRESIDENT")) {
				return currentEmployee;
			}
		}
		return null;
	}

	public Map<Integer, Employee> getData() {

		List<String> lines = data;
		for (String line : lines) {
			String[] parts = line.split(",");
			parts[1] = cleanData(parts[1]);
			parts[2] = cleanData(parts[2]);
			parts[4] = cleanData(parts[4]);
			parts[6] = removeNull(parts[6]);
			parts[3] = removeNull(parts[3]);
			parts[7] = removeNull(parts[7].replaceAll("\\s+", ""));

			employeeData.put(Integer.parseInt(parts[0]),
					new Employee(Integer.parseInt(parts[0]), parts[1], parts[2], Integer.parseInt(parts[3]), parts[4],
							Integer.parseInt(parts[5]), Integer.parseInt(parts[6]), Integer.parseInt(parts[7])));

		}
		for (Map.Entry employee : employeeData.entrySet()) {
			findEmployee((Employee) employee.getValue());
		}

		return employeeData;
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

	private void findEmployee(Employee employee) {
		Employee firstEmployee = employee;
		Employee secondEmployee = employeeData.get(employee.getManagerId());
		if (secondEmployee != null && firstEmployee != null)
			secondEmployee.addEmployeesUnderThisEmployee(firstEmployee);
	}

}
