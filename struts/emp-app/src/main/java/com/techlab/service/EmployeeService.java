package com.techlab.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Employee;

public class EmployeeService {
	private List<Employee> employee;
	
	public List<Employee> getEmployees() {
		employee= new ArrayList<Employee>();
		Connection conn = null;
		 Statement stmt = null;
		 ResultSet res = null;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swabhav?user=root&password=root");
			stmt = conn.createStatement();
			res = stmt.executeQuery("Select * from employee");
			
			while (res.next()) {
				System.out.println(res.getString(2));
				employee.add(new Employee(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
		
	}

}
