package com.techlab.model.test;

import com.techlab.model.ClassA;
import com.techlab.model.ClassB;

public class CouplingTest {
	public static void main(String args[]) {
		ClassB b = new ClassB();
		ClassA  a = new ClassA(b); 
		a.bar();
	}
}
