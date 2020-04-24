package com.techlab.model;

import java.util.Random;
import java.util.Scanner;

import com.techlab.model.Game;

public class GameTerminal extends Game {

	public void start() {
		int choiceOfTheUser = 0;
		int guessedNumber;
		String result = null;
		generateRandomNumber();
		Scanner sc = new Scanner(System.in);

		while (choiceOfTheUser != 2) {
			System.out.println("Enter a number:");
			guessedNumber = sc.nextInt();
			result = checkGuess(guessedNumber);
			if (result == "correct") {
				System.out.println("The guess is " + result);
				System.out.println("score:" + getScore());
				break;
			}
			System.out.println("The guess is " + result);
			System.out.println("Press 2 to exit or press any other number key to continue playing:-");
			choiceOfTheUser = sc.nextInt();
		}
		System.out.println("exiting the game");
	}
}
