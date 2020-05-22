package com.techlab.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class UrlLoader implements ILoader {

	List<String> lines = new ArrayList<String>();

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

	public List<String> getData() throws MalformedURLException {
		String theUrl = "https://swabhav-tech.firebaseapp.com/emp.txt";
		URL url = new URL(theUrl);
		StringBuilder content = new StringBuilder();
		try {

			URLConnection urlConnection = url.openConnection();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			String line;

			while ((line = bufferedReader.readLine()) != null) {
				lines.add(line);
			}
			bufferedReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return lines;
	}
}
