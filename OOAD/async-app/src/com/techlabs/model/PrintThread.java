package com.techlabs.model;

public class PrintThread implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i--) {
			System.out.println(java.time.LocalTime.now());
		}
	}
}
