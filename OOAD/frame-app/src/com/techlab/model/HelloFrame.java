package com.techlab.model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFrame extends JFrame {
	private static final int WIDTH=500;
	private static final int HEIGHT=500;
	  public static final Color LIGHT_BLUE = new Color(51,204,255);

	public HelloFrame(String title) {
		JButton button =new JButton("button");
		button.setBounds(WIDTH/2-50, HEIGHT/2-50, 100, 100);
		add(button);
		
		JButton buttonTwo =new JButton("button");
		buttonTwo.setBounds(WIDTH/2+50, HEIGHT/2-50, 100, 100);
		buttonTwo.setBackground(LIGHT_BLUE);
		add(buttonTwo);
		
		JLabel label = new JLabel();
		label.setText("Button has not been clicked");
		label.setBounds(0, 0, 200, 100);
		add(label);
		
		setTitle(title);
		setSize(WIDTH,HEIGHT);
		setLayout(null);
		setVisible(true);
		
		button.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	label.setText("Button has been clicked");
		    }
		});
	}

}
