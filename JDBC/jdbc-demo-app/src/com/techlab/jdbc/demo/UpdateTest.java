package com.techlab.jdbc.demo;
 
import java.sql.*;
public class UpdateTest {
	public static void main(String args[]) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("connection successful");
			stmt = conn.createStatement();

			System.out.println("Before update");
			res = stmt.executeQuery("select * from intern");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}

			int rows = stmt.executeUpdate("update intern set id=2 where name ='pawan'");
			System.out.println("after update");
			res = stmt.executeQuery("select * from intern");
			while (res.next()) {
				System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
			}
			res.close();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (res != null) {
				res.close();
			}
		}
	}
}
