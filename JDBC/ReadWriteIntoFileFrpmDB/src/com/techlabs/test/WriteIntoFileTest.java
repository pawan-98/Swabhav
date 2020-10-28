package com.techlabs.test;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteIntoFileTest {
	public static void main(String args[]) throws SQLException {
		ResultSet res =null;
		Statement stmt = null;
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		System.out.println("connection successful");
		stmt = conn.createStatement();
		try {
		      FileWriter myWriter = new FileWriter("person.txt");
		      try {
					res = stmt.executeQuery("select * from person");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while (res.next()) {
					myWriter.write(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3)+ " " + res.getString(4)+"\n");
					
				}
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		res.close();
	}

}
