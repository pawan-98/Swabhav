package com.techlab.model;

public class OrderDB implements ICrudable {

	@Override
	public void create() {
	System.out.println("Creating Order" );	
	}

	@Override
	public void read() {
		System.out.println("Reading Order" );	
	}

	@Override
	public void update() {
		System.out.println("Updating Oreder" );
	}

	@Override
	public void delete() {
		System.out.println("Deleted Deleting" );
	}


}
