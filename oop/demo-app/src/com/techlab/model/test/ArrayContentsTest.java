package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.model.EvenNumbers;
import com.techlab.model.OddNumbers;

class ArrayContentsTest {

	@Test
	void test_checkContentsOfOddArray_inputSize5() {

	ArrayList<Integer> expectedOddArray = new ArrayList<Integer>();
	expectedOddArray.add(1);
	expectedOddArray.add(3);
	expectedOddArray.add(5);
	OddNumbers oddNumbersObject = new OddNumbers();
	ArrayList<Integer> outputOddArray = oddNumbersObject.getOddNumber(5);
	assertEquals(expectedOddArray,outputOddArray);
	}
	@Test
	void test_checkContentsOfEvenArray_inputSize5() {

	ArrayList<Integer> expectedEvenArray = new ArrayList<Integer>();
	expectedEvenArray.add(2);
	expectedEvenArray.add(4);
	EvenNumbers evenNumbersObject = new EvenNumbers();
	ArrayList<Integer> outputOddArray = evenNumbersObject.getEvenNumber(5);
	assertEquals(expectedEvenArray,outputOddArray);
	}
	

}
