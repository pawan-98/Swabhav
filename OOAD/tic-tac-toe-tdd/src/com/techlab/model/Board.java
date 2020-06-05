package com.techlab.model;

public class Board {
	private Cell[] cells;
	private final static int BOARD_SIZE = 9;

	public Board() {
		initialize();
	}

	public void initialize() {
		cells = new Cell[BOARD_SIZE];
		for (int i = 0; i < BOARD_SIZE; i++) {
			Cell cell = new Cell();
			cells[i] = cell;
		}
	}

	public int getSize() {
		return this.BOARD_SIZE;
	}

	public Cell[] getBoard() {
		return cells;
	}

	public boolean checkIfBoardIsFull() {

		for (int i = 0; i < BOARD_SIZE; i++) {
			if (cells[i].getMark() == Mark.BLANK) {
				return false;
			}
		}
		return true;
	}

	public void markCell(int postion, Mark mark) {
		cells[postion].setMark(mark);
	}

	public Cell getCell(int position) {
		return cells[position];
	}
}
