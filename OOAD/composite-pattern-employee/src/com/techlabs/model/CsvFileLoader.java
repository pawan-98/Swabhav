package com.techlabs.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvFileLoader implements ILoader {
	private ArrayList<String> lines ;

	public CsvFileLoader() {
		lines = new ArrayList<String>();
	}

	public List<String> getData() {

		StringBuilder content = new StringBuilder();

		try {
			File file = new File("Employees.csv");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;

			while ((line = bufferedReader.readLine()) != null) {

				lines.add(line + "\n");
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lines;
	}

}
