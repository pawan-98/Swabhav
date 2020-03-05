package com.techlab.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String args[]) throws IOException {
		String str = "Sample Text ";

		FileWriter fw = new FileWriter("C:\\Users\\chhab\\OneDrive\\Desktop\\file.txt", true);

		for (int i = 0; i < str.length(); i++) {
			fw.write(str.charAt(i));
		}
		System.out.println("Writing successful");

		fw.close();
	}
}
