package com.techlab.model.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.GuitarSpec;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class FindGuitarTest {
	public static void main(String args[]) {
		Inventory inventory = new Inventory();
		addGuitarsInInventory(inventory);
		
		GuitarSpec guitarsToBeFound = 
				new GuitarSpec(Builder.ANY, "Trigger", Type.ELECTRIC, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		
		List<Guitar> matchingGuitars = inventory.search(guitarsToBeFound);
		
		if(!matchingGuitars.isEmpty()) {
			System.out.println("You may like this Guitars");
			for(Iterator i = matchingGuitars.iterator() ; i.hasNext() ; ) {
				Guitar guitar = (Guitar)i.next();
				GuitarSpec spec = guitar.getSpec();
				
				System.out.println("We have "+spec.getBuilder()+" "+spec.getModel()+" "+
				spec.getType()+" guitar :\n    "+
				spec.getBackwood()+" back and sides, \n    "+
				spec.getTopwood()+" top.\n  You can have it for "+guitar.price());
			}
		}else {
			System.out.println("No such guitar found");
		}
		
	}

	private static void addGuitarsInInventory(Inventory inventory) {
		inventory.addGuitar("101", 5000, Builder.ANY, "The Duck", Type.ACOUSTICS, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		inventory.addGuitar("102", 7000, Builder.FENDER, "0001", Type.ACOUSTICS, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		inventory.addGuitar("103", 8000, Builder.COLLINGS, "Muddywood", Type.ACOUSTICS, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		inventory.addGuitar("104", 9000, Builder.FENDER, "FrankenStrat", Type.ELECTRIC, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		inventory.addGuitar("105", 8000, Builder.COLLINGS, "Old Black", Type.ACOUSTICS, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
		inventory.addGuitar("106", 7000, Builder.ANY, "Trigger", Type.ELECTRIC, Wood.BRAZALIAN_ROSEWOOD, Wood.BRAZALIAN_ROSEWOOD);
	}

}
