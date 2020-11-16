package com.techlab.test;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.database.StudentCrud;
import com.techlab.entity.Student;


public class StudentTest {
	public static void main(String args[]) {
		Configuration config = new Configuration();
		SessionFactory factory = config.configure("hibernate.cfg.xml").buildSessionFactory();

//		Student s1 = new Student();
//		s1.setId(21);
//		s1.setName("abc");
//		s1.setCgpa(4.6f);
//
//		Student s2 = new Student();
//		s2.setId(22);
//		s2.setName("xyz");
//		s2.setCgpa(5.6f);
//
//		Student s3 = new Student();
//		s3.setId(23);
//		s3.setName("def");
//		s3.setCgpa(5.6f);
//		System.out.println(s1+" "+s1.getId());
//		System.out.println(s2+" "+s2.getId());
//		System.out.println(s3+" "+s3.getId());
//
//		Session session = factory.openSession();
//		Transaction transaction = null;
//		try {
//			transaction = session.beginTransaction();
//			System.out.println("tran");
//			session.save(s1);
//			System.out.println("s1 done");
//			session.save(s2);
//			System.out.println("s2 done");
//			session.save(s3);
//			System.out.println("Read all:");
//			transaction.commit();
//		} catch (HibernateException ex) {
//			// TODO: handle exception
//			System.out.println(ex.getMessage());
//			transaction.rollback();
//		} finally {
//			session.close();
//		}
		
//		
		StudentCrud studentCrud= new StudentCrud();
//		studentCrud.createStudent("pawan", 9.6f);
		//studentCrud.updateStudent("22", "test", 7.6f);
		//studentCrud.deleteStudent("21");
		displayStudents(studentCrud.readStudents());
		
		
		System.out.println("end");

	}

	private static void displayStudents(List<Student> students) {
		// TODO Auto-generated method stub
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}
