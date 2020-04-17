package com.techlab.model;

public enum Type {
	ACOUSTICS , ELECTRIC;
	
	public String toString() {

		switch(this) {
		case ACOUSTICS: 
			return "Acoustics";
		
		
		case ELECTRIC : 
			return "Electric";
		
		}
		return null;
	}
}