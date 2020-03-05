package com.techlab.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\chhab\\OneDrive\\Desktop\\file.txt");

		int temp;

		while ((temp = fr.read()) != -1) {
			System.out.print((char) temp);
		}
		fr.close();
	}
}
