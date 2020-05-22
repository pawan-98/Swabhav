package com.techlabs.model;

public class CarromGame extends Game {
	@Override
	public void endPlay() {
		System.out.println("Carrom Game Ended");
	}

	@Override
	public void initialize() {
		System.out.println("Carrom Game Initialized.");
	}

	@Override
	public void startPlay() {
		System.out.println("Carrom Game Started");
	}

}
