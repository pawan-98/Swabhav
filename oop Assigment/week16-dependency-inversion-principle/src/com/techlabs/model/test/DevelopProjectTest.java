package com.techlabs.model.test;

import com.techlabs.model.BackEndDeveloper;
import com.techlabs.model.FrontEndDeveloper;
import com.techlabs.model.IDeveloper;

public class DevelopProjectTest {
	public static void main(String args[]) {
		IDeveloper pawan= new FrontEndDeveloper();
		IDeveloper amit = new BackEndDeveloper();
		printInfo(pawan);
		printInfo(amit);
	
	}
	public static  void printInfo(IDeveloper developer) {
		System.out.println(developer.develop());
	}
}
