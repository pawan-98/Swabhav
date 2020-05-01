package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Branch;
import com.techlab.model.Professor;
import com.techlab.model.Student;

class StudentTesting {
	static Student student ;
	@BeforeAll
	public static void runThisEveryTime() throws ParseException {
		 student =  new Student(101, "Mumbai", "02/02/1998", Branch.COMPUTER);
	}
	
	
	@Test
	void test_checkIfSalaryFunctionIsWorkingProperly() throws ParseException {
		
		assertEquals(Branch.COMPUTER, student.getBranch());

	}
	@Test
	void test_checkIfGeIdMethodIsWorkingProperly() throws ParseException {
		assertEquals(101, student.getId());

	}
	@Test
	void test_checkIfGeAddressIsWorkingProperly() throws ParseException {
		
		assertEquals("Mumbai", student.getAddress());

	}
	
	@Test
	void test_checkIfGeTypeIsWorkingProperly() throws ParseException {
				
		assertEquals("Student", student.getPersonType());

	}	
	
	

}
