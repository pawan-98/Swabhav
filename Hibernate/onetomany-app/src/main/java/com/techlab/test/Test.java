package com.techlab.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Department;
import com.techlab.entity.Employee;

public class Test {
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		SessionFactory sessionFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Department dept1= new Department();
		dept1.setId(1);
		dept1.setName("IT");
		Department dept2= new Department();
		dept2.setId(2);
		dept2.setName("HR");
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("abc");
		e1.setDept(dept1);
		
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("xyz");
		e2.setDept(dept1);
		
		Employee e3= new Employee();
		e3.setId(3);
		e3.setName("def");
		e3.setDept(dept2);
		
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("pqr");
		e4.setDept(dept2);
		
		
		Set<Employee> employees= new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		
		Set<Employee> employees2 = new HashSet<Employee>();
		employees2.add(e3);
		employees2.add(e4);
		
		dept1.setEmployees(employees);
		dept2.setEmployees(employees2);
		
		Session session= sessionFactory.openSession();
		Transaction transaction =null;
		
		System.out.println("Read all:-");
		try {

			transaction = session.beginTransaction();
			//readAll(session);
//			  session.delete(dept1);
//			session.save(dept1);
//			session.save(dept2);
			session.save(e1);
//			session.save(e2);
//			session.save(e3);
//			session.save(e4);
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

	private static void readAll(Session session) {
		// TODO Auto-generated method stub
		Criteria cr = session.createCriteria(Department.class);
		List<Department> depts = cr.list();
		System.out.println(depts);
		for (Department department : depts) {
			System.out.println(department);
		}
		
	}
}
