package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.model.Builder;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Type;
import com.techlab.model.Wood;

class GuitarSpecTest {
GuitarSpec guitarSpec = new GuitarSpec(Builder.ANY, "The Duck", Type.ACOUSTICS, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
	@Test
	void test_toCheckIfBuildNumberisAssignedCorrectly() {
		assertEquals(Builder.ANY,guitarSpec.getBuilder());
	
	}
	@Test
	void test_toCheckIfModelisAssignedCorrectly() {
		
		assertEquals("The Duck",guitarSpec.getModel());
	
	}
	@Test
	void test_toCheckIfTypeisAssignedCorrectly() {
		
		assertEquals(Type.ACOUSTICS,guitarSpec.getType());
	
	}
	@Test
	void test_toCheckIfDrontWoodisAssignedCorrectly() {
		
		assertEquals(Wood.BRAZALIAN_ROSEWOOD,guitarSpec.getTopwood());
	
	}
	@Test
	void test_toCheckIfbACKWoodisAssignedCorrectly() {
		
		assertEquals(Wood.BRAZALIAN_ROSEWOOD,guitarSpec.getBackwood());
	
	}
}
