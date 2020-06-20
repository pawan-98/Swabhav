package com.techlabs.client;

import com.techlabs.product.AutoType;
import com.techlabs.product.AutomobileFactory;
import com.techlabs.product.IAuto;

public class Test {
	public static void main(String args[]) {
		AutomobileFactory automobileFactory = new AutomobileFactory();
		IAuto auto = automobileFactory.make(AutoType.TESTLA);
		auto.start();
		auto.stop();
	}

}
