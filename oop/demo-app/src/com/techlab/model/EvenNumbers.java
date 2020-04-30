package com.techlab.model;

import java.util.ArrayList;

public class EvenNumbers {
	ArrayList<Integer> evenArray = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> getEvenNumber(int input) {
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				evenArray.add(i);
			}
		}
		return evenArray;
	}
}
