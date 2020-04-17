package com.techlab.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private LinkedList<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}
	
	public void addGuitar(String serialNumber , double price , Builder builder ,String model , Type type , Wood backwood ,Wood topwood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backwood, topwood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i = guitars.iterator() ; i.hasNext() ;  ) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List search(GuitarSpec searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<Guitar>();
		for(Iterator i = guitars.iterator() ; i.hasNext() ;  ) {
			Guitar guitar = (Guitar)i.next();
			GuitarSpec guitarspec = guitar.getSpec();
			
			if(searchSpec.getBuilder() != guitarspec.getBuilder()) {
				continue;
			}
			String model = searchSpec.getModel().toLowerCase();
			if((model != null) && (!model.equals(" ")) && (!model.equals(guitarspec.getModel().toLowerCase()))) {
				continue;
			}
			if(searchSpec.getType() != guitarspec.getType()) {
				continue;
			}
			if(searchSpec.getTopwood() != guitarspec.getTopwood()) {
				continue;
			}
			if(searchSpec.getBackwood() != guitarspec.getBackwood()) {
				continue;
			}
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}