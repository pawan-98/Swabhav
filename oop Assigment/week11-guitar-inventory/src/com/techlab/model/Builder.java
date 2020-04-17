package com.techlab.model;

public enum Builder {
FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;
	
	public String toString() {
		String s = "";
		switch(this) {
		case FENDER	: s = "Fender";
		break;
		case MARTIN	: s = "Martin";
		break;
		case GIBSON	: s = "Gibson";
		break;
		case COLLINGS : s = "Collings";
		break;
		case OLSON	: s = "Olson";
		break;
		case RYAN	: s = "Ryan";
		break;
		case PRS	: s = "Prs";
		break;
		case ANY	: s = "Any";
		break;
		}
		return s;
	}	
}
