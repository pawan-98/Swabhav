package com.techlab.model.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlab.model.Account;

public class SerializationTest {
	public static void main(String args[]) throws IOException {
		Account.setMinimumBalance(500);

		Account a1 = new Account(5000, "Pawan", 101);

		String filename = "file.data";
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(a1);

			out.close();
			file.close();

			System.out.println("Account Object has been serialized");


	}

}
