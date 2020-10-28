package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Contact {

	private static ResultSet res = null;
	private static Statement stmt = null;
	private static Connection conn = null;

	public Contact() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		stmt = conn.createStatement();
	}

	public String display() throws SQLException {
		String output = "";
		try {
			res = stmt.executeQuery("select * from contact");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while (res.next()) {
			output = output + res.getString(1) + " " + res.getString(2) + " " + res.getString(3) + " "
					+ res.getString(4) + "\n";
		}
		return output;
	}

	public void add(String firstName, String lastName, String number, String email) {
		try {
			int rows = stmt.executeUpdate("insert into contact values('" + firstName + "','" + lastName + "','" + number
					+ "','" + email + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(String number) {
		try {
			int rows = stmt.executeUpdate("delete from contact where number ='"+number+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
