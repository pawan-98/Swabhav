package com.techlab.model.test;

import com.techlab.model.UserDefinedUnCheckedException;

public class UserDefinedUnCheckedExceptionTest {
	public static void main(String args[]) {
		try {
			throw new UserDefinedUnCheckedException("Something went wrong");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
