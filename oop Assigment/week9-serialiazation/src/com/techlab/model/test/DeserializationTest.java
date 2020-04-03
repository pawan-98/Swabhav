package com.techlab.model.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlab.model.Account;

public class DeserializationTest {
	public static void main(String args[]) throws IOException, ClassNotFoundException { 
		Account a1;
		String filename = "file.data";
		FileInputStream file = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file);

		a1 = (Account) in.readObject();

		in.close();
		file.close();
		System.out.println(a1.getBalance());
	}

}
