package com.techlabs.model;

public class TableTennisGame extends Game {

	@Override
	public void endPlay() {
		System.out.println("Table Tennis Game Ended");
	}

	@Override
	public void initialize() {
		System.out.println("Table Tennis Game Initialized");
	}

	@Override
	public void startPlay() {
		System.out.println("Table tennis Game Started");
	}
}
