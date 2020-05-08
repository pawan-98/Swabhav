package com.techlab.model.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.techlab.model.DatabaseGenerator;
import com.techlab.model.Person;

public class DataFetcherTest {
	public static void main(String args[]) {
		TreeSet<Person> personsData = new TreeSet<Person>();
		DatabaseGenerator db = new DatabaseGenerator();
		personsData = db.getNames("https://swabhav-tech.firebaseapp.com/emp.txt");
		printData(personsData);

	}

	public static void printData(TreeSet<Person> personsData) {
		for (Object name : personsData) {
			Person person = (Person) name;
			System.out.println(person.getName());
		}

	}

}
