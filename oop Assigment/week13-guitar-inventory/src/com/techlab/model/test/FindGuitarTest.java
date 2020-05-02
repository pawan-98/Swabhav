package com.techlab.model.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import java.util.List;

import com.techlab.model.Builder;
import com.techlab.model.Instrument;
import com.techlab.model.InstrumentSpec;
import com.techlab.model.InstrumentType;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class FindGuitarTest {
	public static void main(String[] args) {
	    Inventory inventory = new Inventory();
	    initializeInventory(inventory);

	    Map properties = new HashMap();
	    properties.put("builder", Builder.GIBSON);
	    properties.put("backWood", Wood.INDIAN_ROSEWOOD);
	    InstrumentSpec whatBryanLikes = new InstrumentSpec(properties);

	    List matchingInstruments = inventory.search(whatBryanLikes);
	    if (!matchingInstruments.isEmpty()) {
	      System.out.println("Bryan, you might like these instruments:");
	      for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
	        Instrument instrument = (Instrument)i.next();
	        InstrumentSpec spec = instrument.getSpec();
	        System.out.println("We have a " + spec.getProperty("instrumentType") +
	          " with the following properties:");
	        for (Iterator j = spec.getProperties().keySet().iterator(); 
	             j.hasNext(); ) {
	          String propertyName = (String)j.next();
	          if (propertyName.equals("instrumentType")) {
	            continue;
	            }
	          System.out.println("    " + propertyName + ": " +
	            spec.getProperty(propertyName));
	        }  
	        System.out.println("  You can have this " + 
	          spec.getProperty("instrumentType") + " for $" + 
	          instrument.getPrice() + "\n---");
	      }
	    } else {
	      System.out.println("Sorry we have nothing for you.");
	    }
	  }

	  private static void initializeInventory(Inventory inventory) {
	    Map properties = new HashMap();
	    properties.put("instrumentType", InstrumentType.BANJO);
	    properties.put("builder", Builder.COLLINGS);
	    properties.put("model", "DP101");
	    properties.put("type", Type.ACOUSTICS);
	    properties.put("numStrings", 6);
	    properties.put("topWood", Wood.INDIAN_ROSEWOOD);
	    properties.put("backWood", Wood.ALDER);
	    inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.MARTIN);
	    properties.put("model", "D-18");
	    properties.put("topWood", Wood.ALDER);
	    properties.put("backWood", Wood.CEDAR);
	    inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));

	    properties.put("builder", Builder.FENDER);
	    properties.put("model", "Stratocastor");
	    properties.put("type", Type.ACOUSTICS);
	    properties.put("topWood", Wood.ALDER);
	    properties.put("backWood", Wood.ALDER);
	    inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
	    inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
	 
	    properties.put("builder", Builder.GIBSON);
	    properties.put("model", "Les Paul");
	    properties.put("topWood", Wood.COCBOLO);
	    properties.put("backWood", Wood.INDIAN_ROSEWOOD);
	    inventory.addInstrument("70108276", 2295.95, 
	      new InstrumentSpec(properties));

	    properties.put("model", "SG '61 Reissue");
	    properties.put("topWood", Wood.COCBOLO);
	    properties.put("backWood", Wood.BRAZALIAN_ROSEWOOD);
	    inventory.addInstrument("82765501", 1890.95, 
	      new InstrumentSpec(properties));
	    properties.put("instrumentType", InstrumentType.MANDOLIN);
	    properties.put("type", Type.ELECTRIC);
	    properties.put("model", "F-5G");
	    properties.put("backWood", Wood.CEDAR);
	    properties.put("topWood", Wood.CEDAR);
	    properties.remove("numStrings");
	    inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));
	    properties.put("instrumentType", InstrumentType.BANJO);
	    properties.put("model", "RB-3 Wreath");
	    properties.remove("topWood");
	    properties.put("numStrings", 5);
	    inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	    
	  }
}
