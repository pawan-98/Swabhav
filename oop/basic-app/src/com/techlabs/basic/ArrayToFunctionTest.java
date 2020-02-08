package com.techlabs.basic;

public class ArrayToFunctionTest {

	public static void main(String args[]) {
		
		double cgpa[] = {6.5,7.5,8,5.6,9};
		upgadeCgpa(cgpa);
		for(int i =0;i<cgpa.length;i++) {
			System.out.println(cgpa[i]);	
		}
		
		
	}
	
	public static void upgadeCgpa(double cgpaList[]) {
		
		for(int i =0;i<cgpaList.length;i++) {
			cgpaList[i]=cgpaList[i]+cgpaList[i]* 0.1;
			
		}
	}
}
