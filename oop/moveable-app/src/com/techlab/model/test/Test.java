package com.techlab.model.test;

import com.techlab.model.Bike;
import com.techlab.model.Car;
import com.techlab.model.IMovable;
import com.techlab.model.Truck;

public class Test {
	public static void main(String args[]) {
		IMovable[] movables = new IMovable[3];
		movables[0] = new Bike();
		movables[1] = new Car();
		movables[2] = new Truck();
		startRace(movables);
	}

	public static void startRace(IMovable[] movables) {
		for (IMovable movable : movables) {
			movable.move();
		}
	}
}
