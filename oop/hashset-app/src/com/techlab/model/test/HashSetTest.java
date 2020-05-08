package com.techlab.model.test;

import java.util.ArrayList;
import java.util.HashSet;

import com.techlab.model.LineItem;

public class HashSetTest {
public static void main(String args[]) {
	case1();
	case2();
	
}


public static void case1() {
	int count = 0;
	HashSet<String> cart = new HashSet<String>(); 
	cart.add("Swabhav");
	cart.add("Swabhav");
	
	
		for (Object item : cart) {
				count++;
		}
		System.out.println(count);
}
public static void case2() {
	int count = 0;
	HashSet<LineItem> cart = new HashSet<LineItem>();
	cart.add(new LineItem(101,"book",10,500));
	cart.add(new LineItem(101,"book",10,500));
	LineItem item3 = new LineItem(103,"pen",5,100);
	LineItem item4 = new LineItem(103,"pen",5,100);
    cart.add(item3);
    cart.add(item4);
    
	for (Object item : cart) {
		
		count++;
	}
	System.out.println(count	);
}


}
