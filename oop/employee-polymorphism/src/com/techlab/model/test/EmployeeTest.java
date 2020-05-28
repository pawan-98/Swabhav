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
	
	public static void printSalarySlip(Employee employee) {
		System.out.println("Name:- "+employee.getName());	
		System.out.println("Id :-"+ employee.getId());
		System.out.println("Gender:- "+employee.getGender());
		System.out.println("Salary:- "+ employee.calculateNetSalary());
		System.out.println("Role:-"+ employee.getRole() );
			
	}
}
