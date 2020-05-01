package com.techlab.crud;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String args[]) {
		//create
		LinkedList<String> linkedList = new LinkedList<String>(); 
		linkedList.add("A"); 
        linkedList.add("B");
        linkedList.add("C"); 
        linkedList.add("D");
        //delete
        linkedList.remove("B"); 
        
        //update
        linkedList.set(0, "Updated Element");
		//read
        for(int i=0; i < linkedList.size(); i++)
        {
           System.out.println("Element at index "+i+": "+linkedList.get(i));
         } 
		
        //search
        for (String index : linkedList) {
			if (index.contains("C"))
				System.out.println(index+" found at index "+linkedList.indexOf("C"));
		}
	
	}
	
}
