package com.techlab.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

public class Organisation {

	private UUID id;
	private String name;
	private Date registrationDate;
	private ArrayList<Partner> partnersList = new ArrayList<Partner>();
	private ArrayList<Talent> talentList = new ArrayList<Talent>();

	public Organisation(UUID id, String name, Date registrationDate) {
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
	}

	public void add(Partner partner) {
		partnersList.add(partner);
	}

	public int getPartnerCount() {
		return partnersList.size();
	}

	public Iterable<Partner> getPartners() {
		return partnersList;
	}

	public void addTalent(Talent talent) {
		talentList.add(talent);
		if(talent.getPartner()!=null) {
		Iterable<Partner> it = getPartners();
		for (Partner currentPartner : it) {
			if (talent.getPartner().equals(currentPartner.getName())) {

				currentPartner.addTalent(talent);
			}
		}
	}

	}

	public Iterable<Talent> getTalents() {
		
		return talentList;
	}
}
