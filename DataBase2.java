package com.cozentus.JDBC;
//DML -> INSERT

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Inserting data in eclipse and checking in MySQL that record has been inserted or not.
public class DataBase2 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/EMP_DB";
		String username = "root";
		String password = "password";
		String query = "Insert into Employee values(6, 'Rishika', 'Singh', 'Female', 750000, 'True')";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();) {
			stmt.executeUpdate(query);
			System.out.println("New Record Addded Succcessfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
