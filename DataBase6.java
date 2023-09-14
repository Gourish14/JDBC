package com.cozentus.JDBC;
//DML -> UPDATE

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Updating data record in the database and checking in IDE console that record has been updated or not.

public class DataBase6 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/EMP_DB";
		String username = "root";
		String password = "password";
		String query = "Update Employee set FirstName = 'Rishi', LastName = 'Sunak', Gender = 'Male', Active = 'True' where EMP_ID = 6";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();) {
			stmt.executeUpdate(query);
			System.out.println("New Record Updated Successfully !!");
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