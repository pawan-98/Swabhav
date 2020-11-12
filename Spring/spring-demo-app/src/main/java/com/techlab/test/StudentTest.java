package com.techlab.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlab.service.StudentService;

public class StudentTest {
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext obj = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService svc = obj.getBean("studentsvcc",StudentService.class);
		System.out.println(svc.getStudents().size());
		System.out.println(svc.hashCode());
		
		StudentService svc1 = obj.getBean("studentsvcc",StudentService.class);
		System.out.println(svc.getStudents().size());
		System.out.println(svc.hashCode());
	}
}
