package com.techlab.model.test;

import java.util.ArrayList;
import java.util.ListIterator;

import com.techlab.model.LineItem;

public class LineItemTest {
	public static void main(String arsg[]) {
		
		case1();
		case2();
	}
	public static void case1() {
		int toatalCost = 0;
		ArrayList cart = new ArrayList();
		cart.add(new LineItem(101, "Book", 10, 500));
		cart.add(new LineItem(102, "Pen", 5, 50));
		cart.add(new LineItem(103, "Pencil", 3, 10));
		cart.add("Swabhav");
		
		
			for (Object item : cart) {
				if(item instanceof LineItem) {
					LineItem product = (LineItem) item;
					System.out.println("Price of total " + product.getName() + " is " + product.calculateTotal());
					toatalCost = (int) product.calculateTotal() + toatalCost;
				}
			}
		System.out.println("Total cost is " + toatalCost);

	}
	public static void case2() {
		int toatalCost = 0;
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "Book", 10, 500));
		cart.add(new LineItem(102, "Pen", 5, 50));
		cart.add(new LineItem(103, "Pencil", 3, 10));
		for (Object item : cart) {
				LineItem product = (LineItem) item;
				System.out.println("Price of total " + product.getName() + " is " + product.calculateTotal());
				toatalCost = (int) product.calculateTotal() + toatalCost;
		}
		
		System.out.println("Total cost is " + toatalCost);
	}
}
