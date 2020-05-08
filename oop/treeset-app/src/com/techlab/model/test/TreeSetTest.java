package com.techlab.model.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.techlab.model.LineItem;

public class TreeSetTest {
	public static void main(String args[]) {
		case1();
		case2();
		case3();
		case4();
		case5();
	}

	public static void case1() {
		int count = 0;
		TreeSet<String> names = new TreeSet<String>();
		names.add("Swabhav");
		names.add("techlabs");
		names.add("techlabs");

		for (Object item : names) {
			count++;
		}
		System.out.println(count);
	}

	public static void case2() {
		System.out.println("case 2");
		TreeSet<LineItem> items = new TreeSet<LineItem>();
		// items.add(new LineItem(101,"book",10,500));
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(102, "pen", 102, 5500));
		items.add(new LineItem(103, "chair", 100, 5400));
		items.add(new LineItem(104, "notebook", 150, 700));
		for (Object item : items) {
			LineItem lineItem = (LineItem) item;
			System.out.println(lineItem.getName());
		}

	}

	public static void case3() {
		System.out.println("case 3");
		TreeSet<LineItem> items = new TreeSet<LineItem>(new Comparator<LineItem>() {

			@Override
			public int compare(LineItem obj1, LineItem obj2) {

				return obj1.getName().compareTo(obj2.getName());
			}
		});
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(102, "pen", 102, 5500));
		items.add(new LineItem(103, "chair", 100, 5400));
		items.add(new LineItem(104, "notebook", 150, 700));
		for (Object item : items) {
			LineItem lineItem = (LineItem) item;
			System.out.println(lineItem.getName());
		}

	}

	public static void case4() {
		System.out.println("case 4");
		TreeSet<LineItem> items = new TreeSet<LineItem>(new Comparator<LineItem>() {

			@Override
			public int compare(LineItem obj1, LineItem obj2) {

				return Double.compare(obj1.getPrice(), obj2.getPrice());
			}
		});
		// items.add(new LineItem(101,"book",10,500));
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(102, "pen", 102, 5500));
		items.add(new LineItem(103, "chair", 100, 5400));
		items.add(new LineItem(104, "notebook", 150, 700));
		for (Object item : items) {
			LineItem lineItem = (LineItem) item;
			System.out.println(lineItem.getName());
		}

	}

	public static void case5() {
		System.out.println("case 5");
		TreeSet<LineItem> items = new TreeSet<LineItem>(new Comparator<LineItem>() {

			@Override
			public int compare(LineItem obj1, LineItem obj2) {

				return Integer.compare(obj1.getQuantity(), obj2.getQuantity());
			}
		});
		// items.add(new LineItem(101,"book",10,500));
		items.add(new LineItem(101, "book", 10, 500));
		items.add(new LineItem(102, "pen", 102, 5500));
		items.add(new LineItem(103, "chair", 100, 5400));
		items.add(new LineItem(104, "notebook", 150, 700));
		for (Object item : items) {
			LineItem lineItem = (LineItem) item;
			System.out.println(lineItem.getName());
		}

	}

}
