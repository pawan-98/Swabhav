package com.techlab.model.test;

import com.techlab.model.UserDefinedCheckedException;

public class UserDefinedCheckedExceptionTest {
	public static void main(String args[]) {
		try {
			throw new UserDefinedCheckedException("Something went wrong");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
