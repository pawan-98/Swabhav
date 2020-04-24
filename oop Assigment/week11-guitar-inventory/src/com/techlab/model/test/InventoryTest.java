package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

class InventoryTest {
	
	
	
	@Test
	void test_checkIfMatchedGuitarsAreReturnedCorrectly() {
		Inventory inventory = new Inventory();
		inventory.addGuitar("106", 7000, Builder.ANY, "Trigger", Type.ELECTRIC, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		
		GuitarSpec guitarsToBeFound = 
				new GuitarSpec(Builder.ANY, "Trigger", Type.ELECTRIC, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		List<Guitar> matchingGuitars = inventory.search(guitarsToBeFound);
		//System.out.println(matchingGuitars.get(0));
		//System.out.println(guitarsToBeFound);
		assertEquals(guitarsToBeFound.getModel(), matchingGuitars.get(0).getSpec().getModel());;
		//assertEquals(guitarsToBeFound, matchingGuitars.get(0));
		
	}
	@Test
	void test_checkIfSearchedGuitarIsReturnedCorrectly() {
		Guitar guitar ;
		Inventory inventory = new Inventory();
		inventory.addGuitar("106", 7000, Builder.ANY, "Trigger", Type.ELECTRIC, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		guitar = inventory.getGuitar("106");
		
		assertEquals("106",guitar.getSerialNumber());
	
	
	}
	}


