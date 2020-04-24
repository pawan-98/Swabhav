package com.techlab.model;

public class AddressDB implements ICrudable {

	@Override
	public void create() {
	System.out.println("Creating Address" );	
	}

	@Override
	public void read() {
		System.out.println("Reading Address" );	
	}

	@Override
	public void update() {
		System.out.println("Updating Address" );
	}

	@Override
	public void delete() {
		System.out.println("Deleted Address" );
	}

}
