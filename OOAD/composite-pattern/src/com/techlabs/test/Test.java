package com.techlabs.test;

import com.techlabs.model.File;
import com.techlabs.model.Folder;

public class Test {
	public static void main(String args[]) {
		Folder root = new Folder("Movies");
		root.addDiskItem(new File("abc", 700, ".avi"));
		Folder action = new Folder("action");
		root.addDiskItem(action);
		root.addDiskItem(new File("pqr", 700, ".avi"));
		action.addDiskItem(new File("lmn",60,".avi"));
		action.addDiskItem(new File("pqr",60,".avi"));
		System.out.println(root.show(0));
	}

}
