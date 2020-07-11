package com.techlabs.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder implements IDiskItem {
	private String name;
	private List<IDiskItem> diskItems;

	public Folder(String name) {
		this.name = name;
		diskItems = new ArrayList<IDiskItem>();
	}

	public void addDiskItem(IDiskItem diskItem) {
		diskItems.add(diskItem);
	}

	@Override
	public String show(int count) {
		count++;
		Iterator<IDiskItem> i = diskItems.iterator();
		String finalString = "|->" + name + "\n";

		while (i.hasNext()) {
			IDiskItem item = i.next();
			finalString = finalString + countAndReturnSpaces(count)+item.show(count);
			

			if (i.hasNext()) {
				finalString = finalString + "\n";
			}
		}
		return finalString;
	}
	private String countAndReturnSpaces(int count) {
		String stringWithSpaces="\t";
		for (int j = 0; j < count; j++) {
			stringWithSpaces=stringWithSpaces+"\t";
		}
		return stringWithSpaces;
		
	}

}
