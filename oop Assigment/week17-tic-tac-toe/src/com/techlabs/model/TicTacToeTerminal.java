package com.techlabs.model;

import java.util.Scanner;

public class TicTacToeTerminal {

	public void start() {
		int positionSelectedByUser;
		String board[][];
		String playerOneName, playerTwoName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first player's name!");
		playerOneName = sc.nextLine();
		Player playerOne = new Player(playerOneName, 1, "X");

		System.out.println("Enter second player's name!");
		playerTwoName = sc.nextLine();
		Player playerTwo = new Player(playerTwoName, 1, "O");
		TicTacToe game = new TicTacToe(playerOne, playerTwo);

		while (game.getStatus().equals("started")) {

			Player player = game.getCurrentPLayer();
			System.out.println(player.getName() + " mark the postion which you prefer");
			board = game.getBoard();
			displayBoard(board);
			positionSelectedByUser = sc.nextInt();

			if (game.checkIfPresentInBoard(positionSelectedByUser)) {
				player.setCurrentInputPostion(positionSelectedByUser);
				game.playThisMove(player);
			} else {
				System.out.println("Enter a valid input");
			}
		}
		if (game.getStatus().equals("Won")) {
			System.out.println(game.getWinningPlayer().getName() + " Won!!");
		} else if (game.getStatus().equals("Draw")) {
			System.out.println("Its a draw!");
		}
		sc.close();
	}

	public void displayBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}

}
