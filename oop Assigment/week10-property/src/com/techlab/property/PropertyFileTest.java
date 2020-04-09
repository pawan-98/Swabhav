package com.techlab.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertyFileTest {

	public static void main(String args[]) throws IOException {
		
	
			Properties p = new Properties();
			InputStream is = new FileInputStream("data2.properties");
		
			
		p.load(is);
		
		Iterator <?> data = p.keySet().iterator();
		System.out.println("Using enhance for loop:-");
		for(Object stock : p.keySet()){
			   System.out.println(p.getProperty(stock.toString()));
			}
	System.out.println("Using Iterator:-");
	while(data.hasNext()) {
		System.out.println(p.getProperty(data.next().toString()));
	}
	}
}
