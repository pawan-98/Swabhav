package com.techlabs.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AsyncFrame  {
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;

	public AsyncFrame() {
		JFrame frame = new JFrame();
		JButton button =new JButton("Alert");
		button.setBounds(WIDTH/2-50, HEIGHT/2-50, 100, 100);
		frame.add(button);
		JButton buttonTwo =new JButton("Print");
		buttonTwo.setBounds(WIDTH/2+50, HEIGHT/2-50, 100, 100);

		frame.add(buttonTwo);
		
		
		frame.setSize(WIDTH,HEIGHT);
		frame.setLayout(null);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	JOptionPane.showMessageDialog(null,"Hello"); 
		    }
		});
		buttonTwo.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	Thread t = new Thread(new PrintThread());
		    	t.start();
		    }
		});
		}
}
