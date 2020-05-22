package com.techlabs.model;

public class CarromGame extends Game {
	@Override
	void endPlay() {
		System.out.println("Carrom Game Ended");
	}

	@Override
	void initialize() {
		System.out.println("Carrom Game Initialized.");
	}

	@Override
	void startPlay() {
		System.out.println("Carrom Game Started");
	}

}
