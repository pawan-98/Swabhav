package com.techlab.model;

public class Developer extends Employee
{
	public Developer(String name,int id,double basicSalary,String gender) {
		super(name, id, basicSalary,gender);
	}
public double calculateNetSalary() {
		
		double finalCtc =  (super.basicSalary*40)/100 + (super.basicSalary*30)/100 + 12*super.basicSalary;
		return finalCtc;
		
	}

}
