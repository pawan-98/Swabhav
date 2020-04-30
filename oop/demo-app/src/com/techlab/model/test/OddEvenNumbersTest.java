package com.techlab.model.test;

import java.util.ArrayList;

import com.techlab.model.EvenNumbers;
import com.techlab.model.OddNumbers;

public class OddEvenNumbersTest {
	public static void main(String args[]) {
		OddNumbers findOddObject = new OddNumbers();
		EvenNumbers findEvenNumber=new EvenNumbers();
		System.out.println("Even numbers:-");
		diplayOddEvenNumbers(findEvenNumber.getEvenNumber(100));
		System.out.println("Odd numbers:-");
		diplayOddEvenNumbers(findOddObject.getOddNumber(100));
	}

	public static void diplayOddEvenNumbers(ArrayList<Integer> arrayOfnumbers) {
		for(int i=0; i < arrayOfnumbers.size(); i++){
            System.out.println( arrayOfnumbers.get(i) );
        }
	}

}
