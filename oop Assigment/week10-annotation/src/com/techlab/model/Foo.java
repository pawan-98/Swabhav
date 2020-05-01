package com.techlab.model;

public class Foo {
	@Bar
	public void printBarAnnotation() {
		System.out.println("@Bar is being run");
	}
	
	@UnitTestCase
	public boolean m1() {
		return true;
	}
	
	public boolean m2() {
		return true;
	}
	
	@UnitTestCase
	public boolean m3() {
		return false;
	}
	
	@UnitTestCase
	public boolean m4() {
		return false;
	}
	
}
