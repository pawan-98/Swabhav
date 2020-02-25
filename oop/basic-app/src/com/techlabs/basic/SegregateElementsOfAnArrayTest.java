package com.techlabs.basic;

public class SegregateElementsOfAnArrayTest {
	public static void main(String args[]) {
		
		int array[] = {0,1,0,1,0,1,0,1,0};
		int count =0;
		int arraySize = array.length;
		for(int i =0;i<=arraySize-1;i++) {
			if(array[i]==0) {
				count++;
			}
		}
		for(int i =0;i<=count-1;i++) {
			
			array[i]=0;
		}
		for (int i=count;i<=arraySize-1;i++) {
			array[i]=1;
			
		}
		for(int i=0;i<=arraySize-1;i++) {
			System.out.print(array[i]);
		}
	}

}
