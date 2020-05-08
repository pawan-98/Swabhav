package com.techlab.colectionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet hashSet = new HashSet();
		ArrayList list = new ArrayList();
		list.add("B");
		list.add("G");
		list.add("H");
		list.add("A");
		hashSet = applyCollectionSort(list);
		System.out.println(hashSet);
	}
	
	public static HashSet applyCollectionSort(ArrayList list) {
		HashSet hashSet = new LinkedHashSet();
		Collections.sort(list);
		for (Object element : list) {
			hashSet.add(element);
		}

		return hashSet;

	}

}
