package com.techlab.database;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Student;

public class StudentCrud {
	Configuration config;
	SessionFactory factory;

	public StudentCrud() {
		config = new Configuration();
		factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
	}

	public void createStudent(String name, float cgpa) {
		UUID uuid = UUID.randomUUID();
		Student student = new Student();
		student.setCgpa(cgpa);
		student.setId(uuid.toString());
		student.setName(name);
		Session session = factory.openSession();
		Transaction transaction = null;
		System.out.println(student);
		try {
			transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
		} catch (HibernateException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
			transaction.rollback();
		} finally {
			session.close();
		}

	}

	public void deleteStudent(String id) {

		Session session = factory.openSession();
		Transaction transaction = null;

		try {

			transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, id);
			session.delete(student);
			transaction.commit();

		} catch (HibernateException ex) {
			System.out.println(ex.getMessage());
			transaction.rollback();
		} finally {
			session.close();
		}

	}

	public List<Student> readStudents() {
		List<Student> students = new ArrayList<Student>();
		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			students = session.createQuery("from Student").list();
			transaction.commit();
		} catch (HibernateException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		} finally {
			session.close();
		}
		return students;
	}

	public void updateStudent(String id, String name, float cgpa) {
		Session session = factory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			Student student = (Student) session.get(Student.class, id);
			student.setCgpa(cgpa);
			student.setName(name);
			session.update(student);
			transaction.commit();
		} catch (HibernateException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}

	}
}
