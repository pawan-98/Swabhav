package com.techlabs.factory;

public class AudiFactory implements IAutoFactory {
	public static AudiFactory instanceOfAudiFactory;
	private static IAutomobile instanceOfAuto;
	private AudiFactory() {
	}
	public static AudiFactory getInstance() {
		if (instanceOfAudiFactory==null) {
			instanceOfAudiFactory= new AudiFactory();
			return instanceOfAudiFactory;
		}
		return instanceOfAudiFactory;
	}
	@Override
	public IAutomobile make() {
		if(instanceOfAuto==null) {
			instanceOfAuto= new Audi();
			return instanceOfAuto;
		}
		return instanceOfAuto;
	}

}
