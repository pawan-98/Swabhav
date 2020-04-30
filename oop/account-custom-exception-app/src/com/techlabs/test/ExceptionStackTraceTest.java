package com.techlabs.test;

public class ExceptionStackTraceTest {
public static void main(String args[])  {
	try{
		m1();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	System.out.println("End of main");
}

public static void m1() throws Exception {
	System.out.println("In m1");
	m2();
}
public static void m2() throws Exception {
	System.out.println("In m2");
	m3();
}
public static void m3() throws Exception {
	System.out.println("In m3");
	throw new Exception("Some fatal error in m3");
}
}
