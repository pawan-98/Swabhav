package com.techlab.colectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		ArrayList list = new ArrayList();
		list.add("B");
		list.add("G");
		list.add("H");
		list.add("A");

		treeSet = applyCollectionSort(list);
		System.out.println(treeSet);

	}

	public static TreeSet applyCollectionSort(ArrayList list) {
		TreeSet treeSet = new TreeSet();
		Collections.sort(list);
		for (Object element : list) {
			treeSet.add(element);
		}

		return treeSet;

	}
}
