package com.techlabs.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.techlab.model.Board;
import com.techlab.model.Game;
import com.techlab.model.Mark;
import com.techlab.model.Player;
import com.techlab.model.ResultAnalyzer;

public class MainFrame extends JFrame {
	Board board;
	ResultAnalyzer resultAnalyzer;
	Player[] players;
	Game game;
	JButton buttonZero;
	JButton buttonOne;
	JButton buttonTwo;
	JButton buttonThree;
	JButton buttonFour;
	JButton buttonFive;
	JButton buttonSix;
	JButton buttonSeven;
	JButton buttonEight;
	JLabel currentPlayerLabel;
	JLabel statusLabel;

	public MainFrame(String playerOneName, String playerTwoName) {
		board = new Board();
		resultAnalyzer = new ResultAnalyzer(board);
		players = new Player[2];
		players[0] = new Player(playerOneName, Mark.X);
		players[1] = new Player(playerTwoName, Mark.O);
		game = new Game(players, board, resultAnalyzer);

		buttonZero = new JButton("Zero");
		buttonZero.setBounds(0, 150, 100, 50);
		add(buttonZero);

		buttonOne = new JButton("One");
		buttonOne.setBounds(200, 150, 100, 50);
		add(buttonOne);

		buttonTwo = new JButton("Two");
		buttonTwo.setBounds(400, 150, 100, 50);
		add(buttonTwo);

		buttonThree = new JButton("Three");
		buttonThree.setBounds(0, 250, 100, 50);
		add(buttonThree);

		buttonFour = new JButton("Four");
		buttonFour.setBounds(200, 250, 100, 50);
		add(buttonFour);

		buttonFive = new JButton("Five");
		buttonFive.setBounds(400, 250, 100, 50);
		add(buttonFive);

		buttonSix = new JButton("Six");
		buttonSix.setBounds(0, 350, 100, 50);
		add(buttonSix);

		buttonSeven = new JButton("Seven");
		buttonSeven.setBounds(200, 350, 100, 50);
		add(buttonSeven);

		buttonEight = new JButton("Eight");
		buttonEight.setBounds(400, 350, 100, 50);
		add(buttonEight);

		statusLabel = new JLabel();
		statusLabel.setText("Status:-" + game.getStatus());
		statusLabel.setBounds(0, 0, 150, 100);
		add(statusLabel);

		currentPlayerLabel = new JLabel();
		currentPlayerLabel.setText("Current Player:-" + game.getCurrentPlayer().getName());
		currentPlayerLabel.setBounds(200, 0, 200, 100);
		add(currentPlayerLabel);

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		startTheMainFrame();
	}

	public void startTheMainFrame() {
			buttonOne.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(1);
					buttonOne.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});
			buttonZero.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(0);
					buttonZero.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			buttonTwo.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(2);
					buttonTwo.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			buttonThree.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(3);
					buttonThree.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			buttonFour.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(4);
					buttonFour.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			buttonFive.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(5);
					buttonFive.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			buttonSix.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(6);
					buttonSix.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});

			buttonSeven.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(7);
					buttonSeven.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});
			buttonEight.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(8);
					buttonEight.setText("" + game.getNextPlayer().getMark());
					statusLabel.setText("Status:-" + game.getStatus());
					currentPlayerLabel.setText("CurrentPLayer:-" + game.getCurrentPlayer().getName());
					checkStatus();
				}
			});
			
			}
	public void checkStatus() {
		if(!game.getStatus().equals("In Progress")) {
			buttonOne.setVisible(false);
			buttonZero.setVisible(false);
			buttonTwo.setVisible(false);
			buttonThree.setVisible(false);
			buttonFour.setVisible(false);
			buttonFive.setVisible(false);
			buttonSix.setVisible(false);
			buttonSeven.setVisible(false);
			buttonEight.setVisible(false);
			currentPlayerLabel.setText(game.getNextPlayer().getName()+"Won!!");
		}
	}
}
