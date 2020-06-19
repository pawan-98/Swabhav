package com.techlabs.service;

public enum DataService {
	INSTANCE;
	
	public void doSomeThing() {
		System.out.println("Work done by "+this.hashCode());
	}

}
