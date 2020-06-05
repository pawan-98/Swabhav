package com.techlab.model;

public class ResultAnalyzer {
	private Board board;
	Mark mark;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}
	
	public String analyzeResult() {
		if(checkRow()) {
			return "WIN";
		}
		else if(checkColumn()) {
			return "WIN";
		}
		else if(checkdiagonal()) {
			return "WIN";
		}
		else if(board.checkIfBoardIsFull()) {
			return "Draw";
		}
		else {
			return "In Progress";
		}
		
	}
	public void setMark(Mark mark) {
		this.mark=mark;
	}

	public boolean checkdiagonal() {
		if(board.getCell(0).getMark().equals(board.getCell(4).getMark()) && board.getCell(4).getMark().equals(board.getCell(8).getMark()) && board.getCell(8).getMark().equals(mark)) {
			return true;
		}else if (board.getCell(4).getMark().equals(board.getCell(4).getMark())&& board.getCell(4).getMark().equals(board.getCell(6).getMark()) && board.getCell(6).getMark().equals(mark)) {
			
		}

		return false;
	}

	public boolean checkColumn() {
		if(board.getCell(0).getMark().equals(board.getCell(3).getMark()) && board.getCell(3).getMark().equals(board.getCell(3).getMark()) && board.getCell(6).getMark().equals(mark)) {
			return true;
		}else if (board.getCell(1).getMark().equals(board.getCell(4).getMark()) && board.getCell(4).getMark().equals(board.getCell(7).getMark()) && board.getCell(7).getMark().equals(mark)) {
			
		}
		else if (board.getCell(2).getMark().equals(board.getCell(5).getMark()) && board.getCell(5).getMark().equals(board.getCell(8).getMark()) && board.getCell(8).getMark().equals(mark)) {
			
		}
		return false;
	}

	public boolean checkRow() {
		if(board.getCell(0).getMark().equals(board.getCell(1).getMark()) && board.getCell(1).getMark().equals(board.getCell(2).getMark()) && board.getCell(2).getMark().equals(mark)) {
			return true;
		}else if (board.getCell(3).getMark().equals(board.getCell(4).getMark()) && board.getCell(4).getMark().equals(board.getCell(5).getMark()) && board.getCell(5).getMark().equals(mark)) {
			
		}
		else if (board.getCell(6).getMark().equals(board.getCell(7).getMark()) && board.getCell(7).getMark().equals(board.getCell(8).getMark()) && board.getCell(8).getMark().equals(mark)) {
			
		}
		return false;
	}
}
