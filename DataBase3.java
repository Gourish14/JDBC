package com.cozentus.JDBC;
//DML -> UPDATE

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Updating data record in the database and checking in MySQL that record has been updated or not.
public class DataBase3 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/EMP_DB";
		String username = "root";
		String password = "password";
		String query = "Update Employee set FirstName = 'Rishi', LastName = 'Sunak', Gender = 'Male', Active = 'True' where EMP_ID = 6";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();) {
			stmt.executeUpdate(query);
			System.out.println("New Record Updated Successfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}