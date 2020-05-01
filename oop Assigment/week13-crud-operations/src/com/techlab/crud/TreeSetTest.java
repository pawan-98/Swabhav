package com.techlab.crud;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String args[]) {
		//create
		TreeSet<String> ts1 = new TreeSet<String>(); 
		  
        ts1.add("A"); 
        ts1.add("B"); 
        ts1.add("C");
        ts1.add("D");
        //remove
        ts1.remove("D");
        
        //read
        System.out.println(ts1); 
	
        //search
        for (String index : ts1) {
    		if (index.contains("A"))
    			System.out.println(index+" is there in the hash set ");
    	}
	}

}
