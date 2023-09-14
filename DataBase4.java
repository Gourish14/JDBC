package com.cozentus.JDBC;
//DML -> DELETE

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Deleting data from the record and checking in MySQL that record has been deleted or not.
//Don't use Delete query, Directly update the active to false and then select whose active is true.
//It is done in class DataBase8.
public class DataBase4 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/EMP_DB";
		String username = "root";
		String password = "password";
		String query = "DELETE from Employee where EMP_ID = 6";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();) {
			stmt.executeUpdate(query);
			System.out.println("Existing Record Deleted Successfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}