package com.techlabs.product;

 class Bmw implements IAuto {

	@Override
	public void start() {
		System.out.println("BMW started");
	}

	@Override
	public void stop() {
		System.out.println("BMW stopped");
	}

}
