package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementFilterTest {
	public static void main(String args[]) throws SQLException {
		ResultSet res =null;
		Statement stmt = null;
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give id:-");
		String id = sc.nextLine();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
		stmt = conn.createStatement();
		System.out.println("connection successful");
		res=stmt.executeQuery("Select * from person where id="+ id);
		while (res.next()) {
			System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3)+ " " + res.getString(4)+"\n");
			
		}
	}
}
