package com.techlabs.model;

public class Player {
	private int id;
	private String name;
	private int currentInputPosition;
	private String markAssigned;

	public Player(String name, int id, String markAssigned) {
		this.name = name;
		this.id = id;
		this.markAssigned = markAssigned;
	}

	public String getName() {
		return name;
	}

	public String getMarkAssigned() {
		return this.markAssigned;
	}

	public int getId() {
		return id;
	}

	public int getCurrentInputPostion() {
		return currentInputPosition;
	}

	public void setCurrentInputPostion(int position) {
		this.currentInputPosition = position;
	}

}
