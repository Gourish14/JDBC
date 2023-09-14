package com.cozentus.JDBC;
// DML -> SELECT

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//Selecting and displaying all data from the Database

public class DataBase1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/EMP_DB";
		String username = "root";
		String password = "password";
		String query = "Select * from Employee";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)){  //For displaying or selecting, use executeQuery and rs.next().
				while(rs.next()) {
				int empID = rs.getInt("EMP_ID");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String gender = rs.getString("Gender");
				float salary = rs.getFloat("Salary");
				String active = rs.getString("Active");
				System.out.println("Employee ID : "+empID);
				System.out.println("First Name : "+firstName);
				System.out.println("Last Name : "+lastName);
				System.out.println("Gender : "+gender); 
				System.out.println("Salary : "+salary);
				System.out.println("Active : "+active);
				System.out.println();
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}