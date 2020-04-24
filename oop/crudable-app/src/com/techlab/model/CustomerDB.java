package com.techlab.model;

public class CustomerDB implements ICrudable {
	@Override
	public void create() {
	System.out.println("Creating Customer" );	
	}

	@Override
	public void read() {
		System.out.println("Reading Customer" );	
	}

	@Override
	public void update() {
		System.out.println("Updating Customer" );
	}

	@Override
	public void delete() {
		System.out.println("Deleted Customer" );
	}


}
