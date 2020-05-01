package com.techlab.crud;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String args[]) {
		//create
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");

		//delete
		linkedHashSet.remove("D");
		
		//read
		System.out.println(linkedHashSet);
	
	//search
	for (String index : linkedHashSet) {
		if (index.contains("A"))
			System.out.println(index+" is there in the hash set ");
	}
}
}
