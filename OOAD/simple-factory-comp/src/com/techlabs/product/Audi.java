package com.techlabs.product;

 class Audi implements IAuto {

	@Override
	public void start() {
		System.out.println("Audi started");		
	}

	@Override
	public void stop() {
		System.out.println("Audi stoped");		
	}

}
