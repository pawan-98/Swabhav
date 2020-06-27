package com.techlabs.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MainFrame extends JFrame {
	public MainFrame() {
	
		JButton button =new JButton("Button");
		button.setBounds(200,200, 100, 100);
		add(button);
		JTextField textField = new JTextField();
		textField.setBounds(0, 0, 200, 100);
		add(textField);
		button.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	String inputText = textField.getText();	 
		    	SecondFrame frame = new SecondFrame();
		    	frame.setTextInLabel("Welcome "+inputText);
		    	frame.setVisible(true);
		    	dispose();
		    }
		});
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		
		
	}
}
