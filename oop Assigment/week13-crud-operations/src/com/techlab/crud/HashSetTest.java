package com.techlab.crud;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String arg[]) {
	//Create
	HashSet<String> hashSet = new HashSet<String>(); 
    hashSet.add("India"); 
    hashSet.add("Australia"); 
    hashSet.add("South Africa"); 
    hashSet.add("Germany");
    //delete
    hashSet.remove("South Africa");
    
    //update
   // h.remove("Australia");
    //h.add("Spain");
    
    //read
    System.out.println(hashSet); 
	
    //search
    for (String index : hashSet) {
		if (index.contains("India"))
			System.out.println(index+" is there in the hash set ");
	}
	
	
	}
    
    
	}

