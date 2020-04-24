package com.techlab.model.test;

import com.techlab.model.BarkRecognizer;
import com.techlab.model.DogDoor;
import com.techlab.model.Remote;

public class DoorSimulatorTest {
	public static void main(String args[]) {

		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		BarkRecognizer recognizer = new BarkRecognizer(door);
		
//		System.out.println("The Dog want to go out");
//		remote.pressButton();
		
		System.out.println("Fido starts barking");
		recognizer.recognizer("Woof!");
		
		System.out.println("The Dog went outside");
		try {

			Thread.currentThread().sleep(10000);

		} catch (InterruptedException e) {
		}
		System.out.println("But he is stuck outside");
		System.out.println("Fido starts barking");
//		System.out.println("So gina grabs the remote control");
//		remote.pressButton();
		recognizer.recognizer("Woof!");
		System.out.println("The dog entered the home");
	}

}
