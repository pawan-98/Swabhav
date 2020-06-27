package com.techlabs.factory;


public class TeslaFactory implements IAutoFactory {
	public static TeslaFactory instanceOfTeslaFactory;
	private static IAutomobile instanceOfAuto;
	private TeslaFactory() {
	}
	public static TeslaFactory getInstance() {
		if (instanceOfTeslaFactory==null) {
			instanceOfTeslaFactory= new TeslaFactory();
			return instanceOfTeslaFactory;
		}
		return instanceOfTeslaFactory;
	}
	@Override
	public IAutomobile make() {
		if(instanceOfAuto==null) {
			instanceOfAuto= new Tesla();
			return instanceOfAuto;
		}
		return instanceOfAuto;
	}

}
