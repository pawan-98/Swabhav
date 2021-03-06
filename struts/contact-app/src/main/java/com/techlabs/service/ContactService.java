package com.techlabs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.techlabs.model.Contact;

public class ContactService {
	private List<Contact> contacts = new ArrayList<Contact>();
	//private static ContactService instance = new ContactService();
	private Contact contact;
	public  ContactService() {
		// TODO Auto-generated constructor stub
		System.out.println("ContactSecvice ");
	}
	
	public void addStudent(String firstName,String middleName,String lastName,String phone,String email) {
		// TODO Auto-generated method stub
				Connection conn = null;
				 Statement stmt = null;
				 ResultSet res = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
					stmt = conn.createStatement();
					int rows = stmt.executeUpdate("insert into contacts_jsp(first_name,middle_name,last_name,phone,email_id) Values('"+firstName+"',+'"+middleName+"','"+lastName+"','"+phone+"','"+email+"')");
								conn.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
	}
	public List<Contact> getContacts() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
		List<Contact> contact = new ArrayList<Contact>();
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from contacts_jsp");
			
			while (res.next()) {
				
				contact.add(new Contact(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return contact;

		
	}
	public Contact getContactUsingId(String id) {
		// TODO Auto-generated method stub
		 Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from contacts_jsp where id='"+id+"'");
			
			while (res.next()) {
				return new Contact(res.getInt(1), res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
			}

			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void updateContact(String id,String firstName,String middleName,String lastName,String phone,String email) {
		// TODO Auto-generated method stub
				Connection conn = null;
				 Statement stmt = null;
				 ResultSet res = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
					stmt = conn.createStatement();
					int rows = stmt.executeUpdate("update contacts_jsp set first_name='"+firstName+"',middle_name='"+middleName+"',last_name='"+lastName+"',phone='"+phone+"',email_id='"+email+"' where id="+id+"; ");	
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public void deleteContact(String id) {
		// TODO Auto-generated method stub
				Connection conn = null;
				 Statement stmt = null;
				 ResultSet res = null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
					stmt = conn.createStatement();
					int rows = stmt.executeUpdate("delete from contacts_jsp where id ='"+id+"'");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	
	/*
	 * public static ContactService getInstance(){ return instance; }
	 */}
