package com.techlabs.factory;

public class BmwFactory implements IAutoFactory {

	public static BmwFactory instanceOfBmwFactory;
	private static IAutomobile instanceOfAuto;
	private BmwFactory() {
	}
	public static BmwFactory getInstance() {
		if (instanceOfBmwFactory==null) {
			instanceOfBmwFactory= new BmwFactory();
			return instanceOfBmwFactory;
		}
		return instanceOfBmwFactory;
	}
	@Override
	public IAutomobile make() {
		if(instanceOfAuto==null) {
			instanceOfAuto= new Bmw();
			return instanceOfAuto;
		}
		return instanceOfAuto;
	}

}
