package com.techlab.model;
public enum Wood {
	INDIAN_ROSEWOOD, BRAZALIAN_ROSEWOOD,COCBOLO,CEDAR,ALDER,SITKABOLO;
	
	public String toString() {
		
		switch(this) {
		case INDIAN_ROSEWOOD : 
			return "India Rosewood";
		case BRAZALIAN_ROSEWOOD : 
			return "Brazalian Rosewood";
		
		case COCBOLO : 
			return "COCBOLO";
		case CEDAR :
			return"Cedar";
		
		case ALDER : 
			return "Alder";
		
		case SITKABOLO : 
			return "Sitkabolo";
		
		}
		return null;
		
	}
}