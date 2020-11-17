package com.techlabs.model;

import java.util.ArrayList;
import java.util.List;

public class Comapany {
	private int id;
	private String name;
	private List<PartnerCompany> partnerCompanies;
	
	
	public Comapany(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		partnerCompanies = new ArrayList<PartnerCompany>();
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
	public List<PartnerCompany> getPartnerCompany() {
		return partnerCompanies;
	}
	public void addPartnerCompany(PartnerCompany partnerCompany) {
		partnerCompanies.add(partnerCompany);
	}
	
	
}
