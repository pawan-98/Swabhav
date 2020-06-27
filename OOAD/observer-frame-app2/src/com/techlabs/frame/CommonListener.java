package com.techlabs.frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommonListener implements ActionListener {
	public MainFrame mainFrame;
	public CommonListener(MainFrame mainFrame) {
		System.out.println("Common listeners constructor executed");
		this.mainFrame= mainFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== mainFrame.getRedButton()) {
			mainFrame.getPannel().setBackground(Color.RED);
		}
		else if (e.getSource()== mainFrame.getGreenButton()) {
			mainFrame.getPannel().setBackground(Color.GREEN);
		}
	}

}
