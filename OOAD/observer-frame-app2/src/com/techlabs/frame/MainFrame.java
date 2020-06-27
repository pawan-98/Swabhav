package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	JButton redButton;
	JButton greenButton;
	JPanel pannel ;

	public MainFrame() {
		this.setVisible(true);
		this.setSize(500, 500);
		
		CommonListener commonListener = new CommonListener(this);
		pannel = new JPanel();
		greenButton = new JButton("Green Button");
		pannel.add(greenButton);
		redButton = new JButton("Red Button");
		pannel.add(redButton);
		this.add(pannel);
		
		greenButton.addActionListener(commonListener);
		redButton.addActionListener(commonListener);

	}

	public JButton getRedButton() {
		return redButton;
	}
	public JButton getGreenButton() {
		return greenButton;
	}
	public JPanel getPannel() {
		return pannel;
	}
}
