package com.techlab.model;

public class Boy implements IMannerable,IEmotions {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("cry from boy");
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("laugh from boy");
	}

	@Override
	public void wish() {
		// TODO Auto-generated method stub
		System.out.println("Wish from boy");
	}

	@Override
	public void depart() {
		// TODO Auto-generated method stub
		System.out.println("Depart from boy");
		
	}

}
