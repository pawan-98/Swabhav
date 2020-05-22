package com.techlabs.model;

public class TableTennisGame extends Game {

	@Override
	void endPlay() {
		System.out.println("Cricket Game Ended");
	}

	@Override
	void initialize() {
		System.out.println("Cricket Game Initialized");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started");
	}
}
