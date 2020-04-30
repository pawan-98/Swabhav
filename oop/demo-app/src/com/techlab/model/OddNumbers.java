package com.techlab.model;

import java.util.ArrayList;

public class OddNumbers {
	ArrayList<Integer> oddArray = new ArrayList<Integer>();

	public ArrayList<Integer> getOddNumber(int input) {
		for (int i = 1; i <= input; i++) {
			if (i % 2 != 0) {
				oddArray.add(i);
			}
		}
		return oddArray;
	}

	
}
