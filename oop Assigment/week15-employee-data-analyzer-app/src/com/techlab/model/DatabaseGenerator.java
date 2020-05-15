package com.techlab.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Comparator;
import java.util.TreeSet;

public class DatabaseGenerator {
	public  TreeSet<Person> getNames(URL url)
	  {
		
	    StringBuilder content = new StringBuilder();
	    TreeSet<Person> personsData = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person obj1, Person obj2) {

				return Integer.compare(obj1.getSalary(), obj2.getSalary());
			}
	    
		});
	    try
	    {
	     
	      URLConnection urlConnection = url.openConnection();
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	      String line;
	      
	      while ((line = bufferedReader.readLine()) != null)
	      {
	    	  String[] parts = line.split(",");
	    	  parts[1]=cleanData(parts[1]);
	    	  parts[2]=cleanData(parts[2]);
	    	  parts[4]=cleanData(parts[4]);
	    	  parts[6]=removeNull(parts[6]);
	    	  parts[3]=removeNull(parts[3]);
	    	  personsData.add(new Person(Integer.parseInt(parts[0]),parts[1],parts[2],Integer.parseInt(parts[3]),parts[4],Integer.parseInt(parts[5]),Integer.parseInt(parts[6]),Integer.parseInt(parts[7])));
	    	  content.append(line + "\n");
	      }
	      bufferedReader.close();
	    }
	    catch(Exception e)
	    {
	      e.printStackTrace();
	    }
	    return personsData;   
	  }
	public  TreeSet<Person> getNames(File file)
	  {
		
	    StringBuilder content = new StringBuilder();
	    TreeSet<Person> personsData = new TreeSet<Person>(new Comparator<Person>() {

			@Override
			public int compare(Person obj1, Person obj2) {

				return Integer.compare(obj1.getSalary(), obj2.getSalary());
			}
	    
		});
	    try
	    {
	     
	      BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
	      String line;
	      
	      while ((line = bufferedReader.readLine()) != null)
	      {
	    	  String[] parts = line.split(",");
	    	  parts[1]=cleanData(parts[1]);
	    	  parts[2]=cleanData(parts[2]);
	    	  parts[4]=cleanData(parts[4]);
	    	  parts[6]=removeNull(parts[6]);
	    	  parts[3]=removeNull(parts[3]);
	    	  personsData.add(new Person(Integer.parseInt(parts[0]),parts[1],parts[2],Integer.parseInt(parts[3]),parts[4],Integer.parseInt(parts[5]),Integer.parseInt(parts[6]),Integer.parseInt(parts[7])));
	    	  content.append(line + "\n");
	      }
	      bufferedReader.close();
	    }
	    catch(Exception e)
	    {
	      e.printStackTrace();
	    }
	    return personsData;   
	  }
	public String cleanData(String givenString) {
		givenString = givenString.replace("'", "");
		return givenString;
	}
	public String removeNull(String givenString) {
		if(givenString.equals( "NULL")) {
			givenString="0";
	  }
		return givenString;
	}
	
}
