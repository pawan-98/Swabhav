package com.techlab.model.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.techlab.model.Account;

public class SerializationTest {
	public static void main(String args[]) throws IOException {
		Account.setMinimumBalance(500);

		/*
		 * Account a1 = new Account(5000, "Pawan", 101);
		 * 
		 * String filename = "file.data"; FileOutputStream file = new
		 * FileOutputStream(filename); ObjectOutputStream out = new
		 * ObjectOutputStream(file);
		 * 
		 * out.writeObject(a1);
		 * 
		 * out.close(); file.close();
		 * 
		 * System.out.println("Account Object has been serialized");
		 */

			Account arr[] = new Account[2];
			
			arr[0] = new Account(101,"abc",1000);
			arr[1] = new Account(102,"def",2000);
			
			FileOutputStream fileOut = new FileOutputStream("file.data");
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        
	        out.writeObject(arr);
	        out.close();
	        fileOut.close();
	        
	        System.out.println("Serialized data is stored in account.ser file");
		
		
	   }
	}


