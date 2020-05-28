package com.techlab.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.techlab.model.Account;

public class DeserializationTest {
	public static void main(String args[]) throws IOException, ClassNotFoundException { 
		/*
		 * Account a1; String filename = "file.data"; FileInputStream file = new
		 * FileInputStream(filename); ObjectInputStream in = new
		 * ObjectInputStream(file);
		 * 
		 * //a1 = (Account) in.readObject(); a1 = (ArrayList) ois.readObject();
		 * in.close(); file.close(); System.out.println(a1.getBalance());
		 */
Account acc[] = null;
		
		FileInputStream fileIn = new FileInputStream("file.data");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		 acc = (Account[]) in.readObject();
		 
		 in.close();
		 fileIn.close();
		 
		 System.out.println(acc[0]);
		 System.out.println(acc[1]);
   }
	}


