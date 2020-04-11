package com.techlab.model.test;

import java.util.Random;
import java.util.Scanner;

import com.techlabs.model.Game;

public class GameTerminal {
	public static void main(String args[]) {
		boolean exitChecker = true;
		int yesNoInput;
		int gameLogicInput;
		
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
		 int randNumber = game.generateRandomNumber();
		// System.out.println(randNumber);

		while (exitChecker == true) {
			System.out.println("Enter a number!");
			int input = sc.nextInt();

			gameLogicInput = game.gameLogic(input, randNumber);

			if (gameLogicInput == 0) {
				System.out.println("Correct guess");
				break;
			}
			else if (gameLogicInput == 1) {
				System.out.println("Too low");
			}
			else if (gameLogicInput == 2) {
				System.out.println("Too high!");
				
			}

			System.out.println("Do you want to play more? \n enter 1 to exit \n or enter any other key to play more");
			yesNoInput = sc.nextInt();

			if (yesNoInput == 1) {
				exitChecker = false;
			}

		}

	}

}
