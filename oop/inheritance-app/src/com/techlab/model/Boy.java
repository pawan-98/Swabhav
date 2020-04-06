package com.techlab.model;

public class Boy extends Man {
	
	@Override
	public void play() {
		System.out.println("play in boy");
		
	}
	
	public void eat() {
		System.out.println("eat in boy");
	}
	
	public void run() {
		System.out.println("run in boy");
		
	}
}
