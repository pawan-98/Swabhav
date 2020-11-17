package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class PartnerCompany {
	private int id;
	private String name;
	private int totalEmp;
	private List<Freshers> freshers;
	public PartnerCompany(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.totalEmp =0;
		freshers = new ArrayList<Freshers>();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalEmp() {
		return totalEmp;
	}
	
	public List<Freshers> getFreshers() {
		return freshers;
	}
	public void addFresher(Freshers fresher) {
		freshers.add(fresher);
		this.totalEmp=this.totalEmp+1;
	}
	
}
