package com.techlab.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudTest {
	private static ResultSet res=null;
	private static Statement stmt = null;
	private static Connection conn = null;
	public static void main (String[] args) throws SQLException {
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
		System.out.println("connection successful");
		stmt = conn.createStatement();

		select();
		insert("rahul","python");
		System.out.println("after insert");
		select();
		update("rahul","saurabh");	
		System.out.println("after update");
		select();
		delete("saurabh");
		System.out.println("after delete");
		select();
		res.close();
	}

	private static void delete(String name) {
		// TODO Auto-generated method stub
		try {
			int rows = stmt.executeUpdate("delete from intern where name ='"+name+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void select() throws SQLException {
		// TODO Auto-generated method stub
		try {
			res = stmt.executeQuery("select * from intern");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (res.next()) {
			System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
		}
		
	}

	private static void update(String name,String newName) {
		// TODO Auto-generated method stub
		try {
			int rows = stmt.executeUpdate("update intern set name='"+newName+"' where name ='"+name+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void insert(String inputName,String lang) {
		try {
			int rows = stmt.executeUpdate("insert into intern(name,lang) values('"+inputName+"','"+lang+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
