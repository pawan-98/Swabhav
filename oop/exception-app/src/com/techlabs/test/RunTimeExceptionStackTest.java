package com.techlabs.test;

public class RunTimeExceptionStackTest {
	public static void main(String args[]) {
		try{
			m1();
		}catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of main");
		
	}
	public static void m1()  {
		System.out.println("In m1");
		m2();
	}
	public static void m2()  {
		System.out.println("In m2");
		m3();
	}
	public static void m3()  {
		System.out.println("In m3");
		throw new RuntimeException("Some fatal error in m3");
	}
	

}
