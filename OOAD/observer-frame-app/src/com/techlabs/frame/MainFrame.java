package com.techlabs.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame  extends JFrame{
	public MainFrame() {
		EmailListener email = new EmailListener();
		SmsListner sms = new SmsListner();
		JButton button =new JButton("Order");
		button.setBounds(200,200, 100, 100);
		add(button);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
		button.addActionListener(email);
		button.addActionListener(sms);
		
	}

}
