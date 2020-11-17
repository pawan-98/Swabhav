package com.techlabs.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Sync extends JFrame {
	public Sync() {
		JButton button =new JButton("Print Time");
		button.setBounds(200/2-50, 200/2-50, 100, 100);
		add(button);
		
		JButton buttonTwo =new JButton("Print Hello");
		buttonTwo.setBounds(200/2+50, 200/2-50, 100, 100);
		add(buttonTwo);

		setSize(200,200);
		setLayout(null);
		setVisible(true);
		
		button.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	for (int i = 0; i < 5; i--) {
					System.out.println(java.time.LocalTime.now());
				}
		    }
		});
		buttonTwo.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println("Hello");

		    }
		});

	}
}
