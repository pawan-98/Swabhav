package com.techlabs.abstractclass;
abstract class Show{
	abstract void display(); 
}




public class AbstractClass extends Show {
	public void display() {
		System.out.println("Abstract class is being called");
	}

}
