package com.techlab.crud;
public class ArrayListTest {
	public static void main(String args[]) {

	java.util.ArrayList arrayList = new java.util.ArrayList(5);
	//create
	for (int i=1; i<=5; i++) {
		arrayList.add(i);
	}
	//update
	arrayList.set(2, 77);
	
	//delete
	arrayList.remove(3); 
	
	//read
	System.out.println(arrayList);
	
	//search
	System.out.println(arrayList.indexOf(1));
	
	}

}
