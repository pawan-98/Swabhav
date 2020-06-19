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

	}

	public void play(int position) {
		if (currentPlayer == null) {
			currentPlayer = players[0];
			nextPlayer = players[1];
		}
		board.markCell(position, currentPlayer.getMark());

		status = resultAnalyzer.analyzeResult();

		temp = currentPlayer;
		currentPlayer = nextPlayer;
		nextPlayer = currentPlayer;
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
