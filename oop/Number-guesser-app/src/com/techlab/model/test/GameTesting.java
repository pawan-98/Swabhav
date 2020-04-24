package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.Game;

class GameTesting {
	

	@Test
	void test_toCheckIfcheckGuessMethodIsWorkingPerfectly() {
		Game game = new Game();
		game.generateRandomNumber();
		String lowOutput = game.checkGuess(game.getRandomNumber()-1);
		String highOutput = game.checkGuess(game.getRandomNumber()+1);
		String correctOutput = game.checkGuess(game.getRandomNumber());
		assertEquals("your in put number is too low", lowOutput);
		assertEquals("your input number is too high", highOutput);
		assertEquals("you guessed the correct number", correctOutput);
	}
	@Test
	void test_toCheckIfGetStatusMethodIsWorkingPerfectly() {
		Game game = new Game();
		
		game.generateRandomNumber();
		assertEquals("Notstarted", game.getStatus());
		
	}
	@Test
	void test_toCheckIfScoreMethodIsWorkingPerfectly() {
		Game game = new Game();
		
		game.generateRandomNumber();
		assertEquals(100, game.getScore());
		
	}


}
