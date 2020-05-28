package com.techlabs.model;

public class MarksScanner {
	
	public boolean checkForThreeMarks(String[][] board,String mark) {
		if(checkRows(board,mark)) {
			return true;
		}
		else if (checkColumns(board,mark)) {
			return true;
		}
		else if (checkDiagonals(board,mark)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkRows(String[][] board,String mark) {
		if(board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && board[0][2].equals(mark)){
			return true;
		}
		else if(board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && board[1][2].equals(mark)){
			return true;
		}
		else if(board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && board[2][2].equals(mark)){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkColumns(String[][] board,String mark) {
		if(board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && board[2][0].equals(mark)){
			return true;
		}
		else if(board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && board[2][1].equals(mark)){
			return true;
		}
		else if(board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && board[2][2].equals(mark)){
			return true;
		}
		else {
			return false;
		}
	}
	public boolean checkDiagonals(String[][] board,String mark) {
		if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[2][2].equals(mark)){
			return true;
		}
		else if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[2][0].equals(mark)){
			return true;
		}
		
		else {
			return false;
		}
	}
	public boolean checkIfPresentInBoard(String[][] board,String position) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if(board[row][col].equals(position)){
					return true;
				}
			}
		}
		return false;
	}
	public boolean checkIfDraw(String[][] board) {
		int length = board.length*board[0].length;
		for (int i = 0; i < length; i++) {
			if(checkIfPresentInBoard(board, Integer.toString(i))) {
				return false;
			}
		}
		return true;
	}
}
