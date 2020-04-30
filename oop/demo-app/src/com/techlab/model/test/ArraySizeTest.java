package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.model.EvenNumbers;
import com.techlab.model.OddNumbers;

class ArraySizeTest {

	@Test
	void test_getEvenNos_WithInput100_Return_50OddNos() {
		EvenNumbers evenNumbersObject = new EvenNumbers();
		int outputEvenArraySize = evenNumbersObject.getEvenNumber(100).size();
		
		assertEquals(50,outputEvenArraySize );
	}
	@Test
	void test_getOddNos_WithInput100_Return_50OddNos() {
		
		OddNumbers oddNumbersObject = new OddNumbers();
		int outputOddArraySize = oddNumbersObject.getOddNumber(100).size();
		
		assertEquals(50,outputOddArraySize );
	}
}
