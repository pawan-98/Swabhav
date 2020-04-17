package com.techlab.model;

public class Manager extends Employee {
	public Manager(String name,int id,double basicSalary,String gender){
		super(name, id, basicSalary,gender);
		
	}
	public double calculateNetSalary() {
		
		double finalCtc = (super.basicSalary*50)/100 + (super.basicSalary*40)/100 + (super.basicSalary*30)/100 + 12*super.basicSalary;
		return finalCtc;
		
	}
}
