package com.techlabs.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;  

public class SyncFrame extends JFrame{
	private static final int WIDTH=500;
	private static final int HEIGHT=500;
	
	public SyncFrame() {
		JButton button =new JButton("Print");
		button.setBounds(WIDTH/2-50, HEIGHT/2-50, 100, 100);
		add(button);
		
		JButton buttonTwo =new JButton("Alert");
		buttonTwo.setBounds(WIDTH/2+50, HEIGHT/2-50, 100, 100);
		add(buttonTwo);

		setSize(WIDTH,HEIGHT);
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
		        JOptionPane.showMessageDialog(null,"Hello");     

		    }
		});
	}
}
