package com.cozentus.JDBC;
// DDL -> TRUNCATE
// Removing all the records from the table.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase12 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/StudentDB";
		String username = "root";
		String password = "password";
		String query = "TRUNCATE TABLE Student";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();){ 
			stmt.executeUpdate(query);
			System.out.println("Table Truncated/All Records Removed Successfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}