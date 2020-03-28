package com.techlabs.overriding;

class Human {
	public void eat() {
		System.out.println("Human is eating");
	}
}

class Boy extends Human {
	public void eat() {
		System.out.println("Boy is eating");
	}
}

public class OverridingTest {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
	}
}
