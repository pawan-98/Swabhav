package com.techlabs.test;

import com.techlabs.model.Comapany;
import com.techlabs.model.Freshers;
import com.techlabs.model.PartnerCompany;

public class Test {
	public static void main(String args[]) {
		Freshers pawan = new Freshers(1, "pawan", 8.5f,"CMPN","Vesit");
		Freshers amit = new Freshers(2, "amit", 7.5f,"ETRX","Vesit");
		Freshers ajay = new Freshers(3,"ajay",9.5f,"INFT","DJ Sanghvi");
		PartnerCompany swabhav = new PartnerCompany(1, "Swabhav");
		swabhav.addFresher(pawan);
		swabhav.addFresher(amit);
		swabhav.addFresher(ajay);
		Comapany aurionPro = new Comapany(1, "Aurionpro");
		aurionPro.addPartnerCompany(swabhav);
		getPartnerComanies(aurionPro);
		
	}

	private static void getPartnerComanies(Comapany aurionPro) {
		// TODO Auto-generated method stub
		System.out.println("partner companies of:- "+aurionPro.getName());
		for (PartnerCompany partnerCompany : aurionPro.getPartnerCompany()) {
			System.out.println(" Name:- "+partnerCompany.getName());
			getFreshers(partnerCompany);
		}
		
	}

	private static void getFreshers(PartnerCompany swabhav) {
		// TODO Auto-generated method stub
		System.out.println("total freshers:- "+swabhav.getTotalEmp());
		for (Freshers freshers : swabhav.getFreshers()) {
			System.out.println("\n Name:- "+freshers.getName());
			System.out.println(" CGPA:- "+freshers.getCgpa());
			System.out.println(" Stream:- "+freshers.getStream());
			System.out.println(" College:- "+freshers.getCollege());
		}
		
	}

}
