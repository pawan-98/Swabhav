package com.techlab.model;

public class Game {
	private Player currentPlayer;
	private Player nextPlayer;
	private Board board;
	private Player[] players;
	private ResultAnalyzer resultAnalyzer;
	private Player temp;
	private String status;

	public Game(Player[] players, Board board, ResultAnalyzer resultAnalyzer) {
		this.players = players;
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;
		this.status = "In Progress";
		currentPlayer = players[0];
		nextPlayer = players[1];

	}

	public void play(int position) {

		board.markCell(position, currentPlayer.getMark());
		resultAnalyzer.setMark(currentPlayer.getMark());
		this.status = resultAnalyzer.analyzeResult();
		temp = currentPlayer;
		currentPlayer = nextPlayer;
		nextPlayer = temp;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public String getStatus() {
		return status;
	}
}
