package com.techlab.model.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

import javax.lang.model.element.Element;

import com.techlab.model.Organisation;
import com.techlab.model.Partner;
import com.techlab.model.Talent;

public class ProgramTest {
	public static void main(String args[]) throws ParseException {
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse("4/14/2014");
		Organisation organisation = new Organisation(UUID.randomUUID(), "Swabhav", date);
		
		Partner aurionPro = new Partner(101, "AurionPro", 400000, 1400);
		Partner google = new Partner(102, "Google", 900000, 14000);
		Partner faceBook = new Partner(103, "FaceBook", 8900000, 1566);
		
		Talent pawan = new Talent(101, "Pawan", 9.4, aurionPro.getName(), "Java");
		Talent amit = new Talent(102, "Amit", 9.9, google.getName(), "Python");
		Talent karan = new Talent(103, "Karan", 8.0, faceBook.getName(), "Node.js");
		Talent tanishq = new Talent(104, "Tanishq", 7.0, null, "Node.js");
		organisation.add(aurionPro);
		organisation.add(google);
		organisation.add(faceBook);
		
		organisation.addTalent(pawan);
		organisation.addTalent(amit);
		organisation.addTalent(karan);
		organisation.addTalent(tanishq);
		
		
		printInfo(faceBook);
		printInfo(organisation);
	}

	public static void printInfo(Organisation organisation) {
		System.out.println("Count :- " + organisation.getPartnerCount());
		Iterable<Partner> it = organisation.getPartners();
		for (Partner currentPartner : it) {
			System.out.println("Name :-" + currentPartner.getName());
			System.out.println("Id :- " + currentPartner.getId());
			System.out.println("Turn Over:- " + currentPartner.getCompanyTurnOver());
			System.out.println("Employee Strength:- " + currentPartner.getEmpStrength() + "\n");

		}
		System.out.println("List of talents:-");
		Iterable<Talent> itForTalent = organisation.getTalents();
		for (Talent currentTalent : itForTalent) {
			System.out.println("Id:- " + currentTalent.getId());
			System.out.println("Name:- " + currentTalent.getName());
			System.out.println("Cagpa:- " + currentTalent.getCgpa());
			System.out.println("Partner:- " + currentTalent.getPartner());
			System.out.println("TechStack:- " + currentTalent.getTechStack() + "\n");

		}

	}
	public static void printInfo(Partner partner) {
		System.out.println("List of talents of "+partner.getName() +":-");
		Iterable<Talent> itForTalent = partner.getTalents();
		
		for (Talent currentTalent : itForTalent) {
			System.out.println("Id:- " + currentTalent.getId());
			System.out.println("Name:- " + currentTalent.getName());
			System.out.println("Cagpa:- " + currentTalent.getCgpa());
			System.out.println("Partner:- " + currentTalent.getPartner());
			System.out.println("TechStack:- " + currentTalent.getTechStack() + "\n");

		}
		
	}

}
