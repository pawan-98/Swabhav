package com.techlab.model.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.techlab.model.Branch;
import com.techlab.model.Professor;

class ProfessorTesting {
	static Professor professor;
	@BeforeAll
	public static void runThisEveryTime() throws ParseException {
		 professor=  new Professor(102, "Banglore", "03/03/1998", 4000);
	}
	
	

	@Test
	void test_checkIfSalaryFunctionIsWorkingProperly() throws ParseException {
		
		assertEquals(4000, professor.getSalary());

	}
	@Test
	void test_checkIfGeIdMethodIsWorkingProperly() throws ParseException {
		
		assertEquals(102, professor.getId());

	}
	@Test
	void test_checkIfGeAddressIsWorkingProperly() throws ParseException {
		
		assertEquals("Banglore", professor.getAddress());

	}
	@Test
	void test_checkIfGeTypeIsWorkingProperly() throws ParseException {
		
		assertEquals("Professor", professor.getPersonType());

	}	
	
}
