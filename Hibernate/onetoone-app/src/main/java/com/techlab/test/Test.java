package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.Entity.Address;
import com.techlab.Entity.Human;

public class Test {
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
//		
//		Human pawan = new Human();
//		pawan.setId(1);
//		pawan.setName("Pawan");
//		
//		Address address = new Address();
//		address.setId(1);
//		address.setLocation("Chembur");
//		
//		pawan.setAddress(address);
//		address.setHuman(pawan);
//		
		Session session= factory.openSession();
		Transaction transaction =null;
		
		System.out.println("Read all:-");
		try {
			List<Address> addressList = new ArrayList<Address>();
			List<Human> humansList = new ArrayList<Human>();
			
			transaction = session.beginTransaction();
//			session.save(pawan);
//			session.save(address);
//			
			addressList = session.createQuery("from Address").list();
			humansList= session.createQuery("from Human").list();
			printData(addressList);
			printData(humansList);
			
			transaction.commit();
			System.out.println("commit");
		} catch (HibernateException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
		
	}
	public static void  printData(List<?> list) {
		for (Object object : list) {
			System.out.println(object.toString());
		}
	}

	}
