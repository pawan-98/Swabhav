package com.techlab.model.test;

import com.techlab.model.Developer;
import com.techlab.model.Employee;
import com.techlab.model.Manager;

public class EmployeeTest {
	public static void main(String args[]) {
		Manager m1 =new Manager("Pawan", 101, 100, "male");
		printSalarySlip(m1);
		
		Developer m2 =new Developer("Pawan", 101, 100, "male");
		printSalarySlip(m2);
		
		Manager m3 =new Manager("Pawan", 101, 100, "male");
		printSalarySlip(m3);
		
	}
	
	public static void printSalarySlip(Employee e) {
		System.out.println("Name:- "+e.getName());	
		System.out.println("Id :-"+ e.getId());
		System.out.println("Gender:- "+e.getGender());
		System.out.println("Salary:- "+ e.calculateNetSalary());
			
	}
}
