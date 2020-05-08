package com.techlab.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		//create
		
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); 
  
        treeMap.put(10, "Pawan"); 
        treeMap.put(15, "Amit"); 
        treeMap.put(20, "Karan"); 
        treeMap.put(25, "Tanishq"); 
        treeMap.put(30, "Tanmay"); 
        //delete
	      treeMap.remove(30);
	    //update
	      treeMap.put(25,"Raj");
        
        //read
        Set set = treeMap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mapEntry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mapEntry.getKey() + " & Value is: ");
	         System.out.println(mapEntry.getValue());
	      }
	      
	  	//search
	      int searchKeyValue = 25;
	      Set setForSearch = treeMap.entrySet();
	      Iterator iteratorForSearch = setForSearch.iterator();
	      while(iteratorForSearch.hasNext()) {
	         Map.Entry mapEntry = (Map.Entry)iteratorForSearch.next();

	         if((int)mapEntry.getKey()==searchKeyValue) {
	        	 System.out.println("key whose value is " +searchKeyValue+" exist");
	         }
	      }
	      
	}

}
