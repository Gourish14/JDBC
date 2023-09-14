package com.cozentus.JDBC;
//DML -> DELETE

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Deleting data from the record and checking in IDE console that record has been deleted or not.
//Don't use Delete query, Directly update the active to false and then select whose active is true.
//It is done in class DataBase8. 

public class DataBase7 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/EMP_DB";
		String username = "root";
		String password = "password";
		String query = "DELETE from Employee where EMP_ID = 6";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();) {
			stmt.executeUpdate(query);
			System.out.println("Existing Record Deleted Successfully !!");
			String query1 = "Select * From Employee";
			ResultSet rs = stmt.executeQuery(query1);
			while(rs.next()) {
				System.out.println("Employee ID : "+rs.getInt("EMP_ID"));
				System.out.println("First Name : "+rs.getString("FirstName"));
				System.out.println("Last Name : "+rs.getString("LastName"));
				System.out.println("Gender : "+rs.getString("Gender"));
				System.out.println("Salary : "+rs.getFloat("Salary"));
				System.out.println("Active : "+rs.getString("Active"));
				System.out.println();
			}
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}