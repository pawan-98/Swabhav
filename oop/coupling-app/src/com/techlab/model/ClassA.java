package com.techlab.model;

public class ClassA {
	private ClassB b;
	 public ClassA(ClassB b) {
		 this.b = b;
		 
	}
	 public void bar() {
		 b.foo();
	 }
}
