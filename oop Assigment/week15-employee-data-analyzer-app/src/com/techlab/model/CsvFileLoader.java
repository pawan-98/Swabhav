package com.techlab.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CsvFileLoader implements ILoader {
	ArrayList<String> lines = new ArrayList<String>();

	public CsvFileLoader() {
	}

	public List<String> getData() {
		
		StringBuilder content = new StringBuilder();

		try {
			File file = new File("dataFile_emp.txt");
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
