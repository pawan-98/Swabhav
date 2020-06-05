package com.techlab.model;

import javax.management.RuntimeErrorException;

public class Cell {
	private Mark mark;
	public Cell() {
		this.mark = Mark.BLANK;
	}
	
	public Mark getMark(){
		return mark;
	}
	public void setMark(Mark mark) {
		if(this.mark.equals(Mark.O) || this.mark.equals(Mark.X)) {
			throw new RuntimeException( "This cell is already marked");
		}
		this.mark=mark;
	}
	public boolean checkIfCellAvailabe() {
		if(this.mark.equals( Mark.BLANK)) {
			return true;
		}
		return false;
	}
}
