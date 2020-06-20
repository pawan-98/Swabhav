package com.techlabs.product;

import com.techlabs.product.AutoType;
import com.techlabs.product.IAuto;

public class AutomobileFactory {

	private static IAuto instanceOfAuto;

	private AutomobileFactory() {

	}

	public IAuto make(AutoType type) {
			if(instanceOfAuto==null) {
				if(type.equals(AutoType.BMW)) {	
					instanceOfAuto =new Bmw(); 
					return instanceOfAuto;
				}
				else if (type.equals(AutoType.TESTLA)) {
					instanceOfAuto= new Tesla();
					return instanceOfAuto;
				}
				instanceOfAuto = new Audi();
				return instanceOfAuto;
			}
			return instanceOfAuto;
	}
}
