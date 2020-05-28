package com.techlab.model;

public class Analyst extends Employee {
	public Analyst (String name,int id,double basicSalary,String gender) {
		super(name, id, basicSalary,gender,"Analyst");
		
	}
public double calculateNetSalary() {
		
		double finalCtc =  (super.basicSalary*30)/100 + 12*super.basicSalary;
		return finalCtc;
		
	}
}
