package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Cell;
import com.techlab.model.Mark;

class CellTest {
	
	@Test
	void checkIfMarkIsBeingSet() {
		Cell cell = new Cell();
		cell.setMark(Mark.O);
		cell.setMark(Mark.X);
		
		assertEquals(Mark.O, cell.getMark());
	}

	@Test
	void checkIfMarkIsAvailabe() {
		Cell cell = new Cell();
		
		assertEquals(true, cell.checkIfCellAvailabe());
	}

	@Test
	void checkIfItIsBlankInStart() {
		Cell cell = new Cell();
		
		assertEquals(Mark.BLANK, cell.getMark());
	}
}
