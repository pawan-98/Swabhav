package com.techlab.model.test;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;

import com.techlab.model.Branch;
import com.techlab.model.Professor;
import com.techlab.model.Student;

public class Test {

	public static void main(String args[]) throws ParseException {
		
		Student student = new Student(101, "Mumbai", "02/02/1998", Branch.COMPUTER); 
		Professor professor = new Professor(102, "Banglore", "03/03/1998", 4000);
		printStudentInfo(student);
		printProffessorInfo(professor);
	}
	public static void printStudentInfo(Student person) {
		System.out.println("Id= "+person.getId()+" Address= "+person.getAddress()+" Date of birth= "+person.getAddress()+" Branch= "+person.getBranch()+" Person Type= "+person.getPersonType());
		
	}
	public static void printProffessorInfo(Professor person) {
		System.out.println("Id= "+person.getId()+" Address= "+person.getAddress()+" Date of birth= "+person.getAddress()+" YearlySalary= "+person.getNetSalary()+" Person Type= "+person.getPersonType());
		
	}
}
