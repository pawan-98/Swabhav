package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class TransactionTest {
	private static ResultSet res=null;
	private static Statement stmt = null;
	private static Connection conn = null;
	public static void main(String args[]) throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:4040/swabhav?user=root&password=root");
		stmt = conn.createStatement();
		System.out.println("connection successful");

		performTransaction(2,500);
		performTransaction(3,500);
		
		res.close();
		
	}

	private static void performTransaction(int id, int money) throws SQLException {
		try {
			System.out.println("Transaction on id"+id+"\n");
			System.out.println("Before");
			select("customer_transaction");
			select("merchant_transaction");
			conn.setAutoCommit(false);
			int row1 = stmt.executeUpdate("update customer_transaction set balance= balance-"+money+" where id ="+id);
			int row2 = stmt.executeUpdate("update merchant_transaction set balance= balance+"+money+" where id =1"+id);
			conn.commit();
			System.out.println("After");
			select("customer_transaction");
			select("merchant_transaction");
		} catch (SQLException e) {
			conn.rollback();
			System.out.println("After");
			select("customer_transaction");
			select("merchant_transaction");
			e.printStackTrace();
		}
	}

	private static void select(String tableName) throws SQLException {
		try {
			res = stmt.executeQuery("select * from "+tableName);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		while (res.next()) {
			System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getString(3));
		}
		
	}

}
