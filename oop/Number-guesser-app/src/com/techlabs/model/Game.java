package com.techlabs.model;

import java.util.Random;

public class Game {

	private int randomNumber;
	private int count;
	private String status;
	
	public void generateRandomNumber() {
		status="Notstarted";
		Random rand = new Random();
		this.randomNumber = 1 + rand.nextInt(100);
		count = 0;
	}

	public String checkGuess(int guess) {
		status="inprogress";
		count++;
		if (guess < randomNumber) {
			return "your in put number is too low";
			}
		if (guess > randomNumber) {
			return "your input number is too high";
		}
		if (guess == randomNumber) {
			return "you guessed the correct number";
		}
		status="hasresult";
		return "out of bounds";
		
	}



	public String getStatus() {
		return status;

	}
	public int getScore() {
		status="end";
		int score=100-(10*count);
		if(score<5)
			return 5;
		return score;
	}	



}
