package com.techlabs.model;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondFrame extends JFrame {
	JLabel label;
	public SecondFrame() {
		label = new JLabel();
		label.setBounds(0, 0, 200, 100);
		add(label);
		setSize(500,500);
		setLayout(null);
	}
	public void setTextInLabel(String text) {
		label.setText(text);
	}
}
