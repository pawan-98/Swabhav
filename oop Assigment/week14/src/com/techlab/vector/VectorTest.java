
package com.techlab.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector vec = new Vector();  
        //Adding elements to a vector  
        vec.add("Tiger");  
        vec.add("Lion");  
        vec.add("Dog");  
        vec.add("Elephant");  
        System.out.println("Elements are: "+vec);
        
        //printing elements using iterator
        Iterator value = vec.iterator(); 
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
	
	
	}

}
