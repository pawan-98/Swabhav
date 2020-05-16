package com.techlab.model;

public class Talent {
	private int id;
	private String name;
	private double cgpa;
	private String partner;
	private String techStack;
	
	public Talent(int id,String name,double cgpa,String partner,String techStack) {
		this.id= id;
		this.name = name;
		this.cgpa = cgpa;
		this.partner= partner;
		this.techStack = techStack;
	
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public String getPartner() {
		return partner;
	}
	
	public String getTechStack() {
		return techStack;
	}
	
	
	

}
