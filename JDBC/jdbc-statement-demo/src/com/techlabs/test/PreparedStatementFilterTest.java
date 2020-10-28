package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class PreparedStatementFilterTest {
	public static void main(String args[]) throws SQLException {
		ResultSet res =null;
		PreparedStatement stmt = null;
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Give id:-");
		String id = sc.nextLine();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
		System.out.println("connection successful");
		stmt = (PreparedStatement) conn.prepareStatement("Select * from person where id=?");
		stmt.setString(1, id);

		res=stmt.executeQuery();
		while (res.next()) {
			System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3)+ " " + res.getString(4)+"\n");
			
		}
	}
}
