package com.cozentus.JDBC;
// DDL -> ALTER
// Altering/Adding new column into the existing table
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase11 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/StudentDB";
		String username = "root";
		String password = "password";
		String query = "Alter Table Student Add Column Active varchar(10)";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();){ 
			stmt.executeUpdate(query);
			System.out.println("New Column added/altered Successfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}