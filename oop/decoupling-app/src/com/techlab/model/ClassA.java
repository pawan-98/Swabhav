package com.techlab.model;

public class ClassA {
	private IClassC c;
	
	 public ClassA(ClassB b) {
		 this.c = b;
		 
	}
	 public void bar() {
		 c.foo();
	 
	 }
}
