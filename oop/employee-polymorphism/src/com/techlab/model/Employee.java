package com.techlab.model;

public abstract class Employee {

	private String name;
	private int id;
	protected double basicSalary; 
	private String gender;
	private String role;
	
	public Employee(String name,int id,double basicSalary,String gender,String role){
		this.name = name;
		this.gender =gender;
		this.basicSalary=basicSalary;
		this.id =id;
		this.role = role;
		
	}
	public String getRole() {
		return this.role;
	}
	public abstract double calculateNetSalary();
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public double getbasicString() {
		return this.basicSalary;
	}
	public String getGender() {
		return this.gender;
	}
}
