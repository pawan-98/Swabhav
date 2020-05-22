package com.techlabs.model.test;

import com.techlabs.model.CarromGame;
import com.techlabs.model.TableTennisGame;
import com.techlabs.model.Game;

public class GameTest {
	public static void main(String[] args) {

		Game game = new CarromGame();
		game.play();
		System.out.println();
		game = new TableTennisGame();
		game.play();
	}
}
