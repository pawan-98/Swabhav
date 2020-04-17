package com.techlab.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.add(5, 5);
		assertEquals(10, output);
	}

}
