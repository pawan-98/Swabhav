package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.Board;
import com.techlab.model.Cell;
import com.techlab.model.Mark;

class BoardTest {

	@Test
	void checkIfBoardIsFull() {
		Board board = new Board();
		assertEquals(false, board.checkIfBoardIsFull());
	}

	@Test
	void checkIfBoardSizeIsBeingReturnedProperly() {
		Board board = new Board();
		assertEquals(9, board.getSize());
	}

	@Test
	void checkIfBoardIsEmptyInStart() {
		Board board = new Board();
		Cell[] cells = new Cell[board.getSize()];
		for (int i = 0; i < board.getSize(); i++) {
			Cell cell = new Cell();
			cells[i] = cell;
		}
		assertEquals(cells[1].getMark(), board.getBoard()[1].getMark());
		assertEquals(cells[2].getMark(), board.getBoard()[2].getMark());
		assertEquals(cells[3].getMark(), board.getBoard()[3].getMark());

	}
	@Test
	void checkIfBoardIsMarkingProperly() {
		Board board = new Board();
		board.markCell(7, Mark.X);
		assertEquals(Mark.X, board.getBoard()[7].getMark());
	}

}
