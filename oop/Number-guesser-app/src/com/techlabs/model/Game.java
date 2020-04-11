package com.techlabs.model;

import java.util.Random;

public class Game {

	public int gameLogic(int input,int randNumber) {
		if(input>randNumber) {
		return 2;
		}
		else if (input<randNumber) {
			return 1;
		}
		else {
			return 0;
		}
	
	
	}
	
	public int generateRandomNumber() {
		
		Random rand = new Random();
		int genratedRandNumber = 1 + rand.nextInt(100);
		return genratedRandNumber;
	}
}
