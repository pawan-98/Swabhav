package com.techlab.jdbc.demo;
import java.sql.*;
public class InsetionTest {
	public static void main(String args[]) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet res = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			System.out.println("connection successful");
			stmt = conn.createStatement();
			int rows = stmt.executeUpdate("insert into student(name,cgpa) values('Harvey Specter',9.2)");
			res = stmt.executeQuery("select * from student");
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getFloat(3));
			}
			
		} catch (SQLException e) {
			System.out.println("unccessful");
			e.printStackTrace();
		}
		finally {
			if (res != null) {
				res.close();
			}
		}
	}
}
