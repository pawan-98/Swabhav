package com.techlab.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//create
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		 hashMap.put(12, "Tanishq");
	      hashMap.put(2, "Chirag");
	      hashMap.put(2, "Omkar");
	      hashMap.put(49, "Karan");
	      hashMap.put(3, "Arjun");
	      
	      
	      //delete
	      hashMap.remove(3);
	      //update
	      hashMap.put(12,"Pawan");
	      
	      //read
	      Set set = hashMap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mapEntry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mapEntry.getKey() + " & Value is: ");
	         System.out.println(mapEntry.getValue());
	      }
		//search
	      int searchKeyValue = 2;
	      Set setForSearch = hashMap.entrySet();
	      Iterator iteratorForSearch = setForSearch.iterator();
	      while(iteratorForSearch.hasNext()) {
	         Map.Entry mapEntry = (Map.Entry)iteratorForSearch.next();

	         if((int)mapEntry.getKey()==searchKeyValue) {
	        	 System.out.println("key whose value is " +searchKeyValue+" exist");
	         }
	      }
	}

}
