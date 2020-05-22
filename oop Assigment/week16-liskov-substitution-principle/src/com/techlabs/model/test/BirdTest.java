package com.techlabs.model.test;

import com.techlabs.model.FlightBird;
import com.techlabs.model.NonFlightBird;

public class BirdTest {
	public static void main(String args[]) {
		FlightBird crow = new FlightBird();
		crow.eat();
		crow.fly();
		NonFlightBird ostrich = new NonFlightBird();
		ostrich.eat();
		ostrich.walk();
	}

}
