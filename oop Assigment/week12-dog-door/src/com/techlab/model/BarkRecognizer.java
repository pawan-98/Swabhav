package com.techlab.model;

public class BarkRecognizer {

	private DogDoor door;
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	public void recognizer(String bark) {
		
		System.out.println("Bark Recognizer hear a "+bark+"'");
		door.open();
	}
}
