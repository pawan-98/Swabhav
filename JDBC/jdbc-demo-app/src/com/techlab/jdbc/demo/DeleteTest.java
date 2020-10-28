package com.techlab.jdbc.demo;

import java.sql.*;

public class DeleteTest {
	public static void main(String args[]) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("connection successful");
			stmt = conn.createStatement();

			System.out.println("Before delete");
			res = stmt.executeQuery("select * from intern");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}

			int rows = stmt.executeUpdate("delete from intern where name ='karan'");
			System.out.println("after delete");
			res = stmt.executeQuery("select * from intern");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}
			res.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (res != null) {
				res.close();
			}
		}
	}

}
