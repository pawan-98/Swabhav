package com.techlab.model;

import java.util.ArrayList;

public class Partner {
	private int id;
	private String name;
	private double companyTurnOver;
	private int empStrength;
	private ArrayList<Talent> talentList = new ArrayList<Talent>();
	
	public Partner(int id,String name,double companyTurnOver,int empStrength) {
		
		this.id=id;
		this.name=name;
		this.companyTurnOver =companyTurnOver;
		this .empStrength=empStrength;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getCompanyTurnOver() {
		return this.companyTurnOver;
	}
	public int getEmpStrength() {
		return this.empStrength;
	}
	public void addTalent(Talent talent) {
		talentList.add(talent);
	}
	public Iterable<Talent> getTalents(){
		return  talentList;
	}
	
}
