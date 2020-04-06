package com.techlabs.model;

public class NumberGuesser {

	public int gameLogic(int input,int randNumber) {
		if(input>randNumber) {
			System.out.println("Too high!");
		return 1;
		}
		else if (input<randNumber) {
			System.out.println("Too low");
			return 1;
		}
		else {
			System.out.println("Correct guess");
			return 0;
		}
	
	}
}
