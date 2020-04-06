package com.techlab.model.test;

import java.util.Random;
import java.util.Scanner;

import com.techlabs.model.NumberGuesser;

public class NumberGuesserTest {
	public static void main(String args[]) {
		boolean exitChecker = true;
		int yesNoInput;
		int gameLogicInput;
		Random rand = new Random();
		int randNumber = 1 + rand.nextInt(100);
		Scanner sc = new Scanner(System.in);
		NumberGuesser game = new NumberGuesser();

		// System.out.println(randNumber);

		while (exitChecker == true) {
			System.out.println("Enter a number!");
			int input = sc.nextInt();

			gameLogicInput = game.gameLogic(input, randNumber);

			if (gameLogicInput == 0) {
				break;
			}

			System.out.println("Do you want to play more? \n enter 1 to exit \n or enter any other key to play more");
			yesNoInput = sc.nextInt();

			if (yesNoInput == 1) {
				exitChecker = false;
			}

		}

	}

}
