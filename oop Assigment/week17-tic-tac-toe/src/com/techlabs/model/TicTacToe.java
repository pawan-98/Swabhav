package com.techlabs.model;

import javax.swing.text.MaskFormatter;

public class TicTacToe {
	final static int ROW_SIZE = 3;
	final static int COL_SIZE = 3;
	String[][] board = new String[ROW_SIZE][COL_SIZE];
	private int count;
	private String status ;
	private Player currentPlayer;
	private Player nextplayer;
	private Player winningPLayer;
	private MarksScanner marksScanner;
	public TicTacToe(Player playerOne,Player playerTwo) {
		currentPlayer=playerOne;
		nextplayer= playerTwo;
		status = "started";
		count=1;
		marksScanner = new MarksScanner();
		initializeBoard();
	}
	
	public Player getCurrentPLayer() {
		return currentPlayer;
	}

	public void initializeBoard() {
		int count = 1;
		for (int row = 0; row < ROW_SIZE; row++) {
			for (int col = 0; col < COL_SIZE; col++) {
				board[row][col] = Integer.toString(count);
				count++;
			}
		}
	}

	public void playThisMove(Player player) {
		Player temp;
		for (int row = 0; row < ROW_SIZE; row++) {
			for (int col = 0; col < COL_SIZE; col++) {
				if (board[row][col].equals(Integer.toString(player.getCurrentInputPostion()))) {
					board[row][col] = player.getMarkAssigned();
					break;
				}
			}
		}
		if(marksScanner.checkForThreeMarks(getBoard(), currentPlayer.getMarkAssigned())) {
			winningPLayer=player;
			status="Won";
		}
		
		else if (marksScanner.checkIfDraw(getBoard())) {
			status= "Draw";
		}
		temp=currentPlayer;
		currentPlayer=nextplayer;
		nextplayer=temp;
		count++;
	}

	public String[][] getBoard() {
		return board;
	}
	
	public Player getWinningPlayer() {
		return this.winningPLayer;
	}
	public String getStatus() {
		return this.status;
	}
	public boolean checkIfPresentInBoard(int position) {
		if(marksScanner.checkIfPresentInBoard(getBoard(), Integer.toString(position))){
			return true;
		}
		return false;
	}
}
