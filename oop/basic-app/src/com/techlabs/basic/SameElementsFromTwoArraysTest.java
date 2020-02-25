package com.techlabs.basic;

import java.util.*;

public class SameElementsFromTwoArraysTest {
	public static void main(String args[]) {
		
		int firstArray[] = {4,5,6,7,8};
		int secondArray[] = {5,0,7,8};
		List<Integer> outputArray = new ArrayList<>();
		
		for(int i =0;i<=firstArray.length-1;i++) {
			for(int j= 0;j<=secondArray.length-1;j++) {
				if(firstArray[i]==secondArray[j]) {
					outputArray.add(firstArray[i]);
				}
			}
		}
		
		
		
		System.out.println(outputArray);
	}

}
