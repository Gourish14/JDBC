package com.cozentus.JDBC;
// DDL -> RENAME
// Renaming the table name.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase13 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/StudentDB";
		String username = "root";
		String password = "password";
		String query = "RENAME TABLE Student TO StudentDataBase";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();){ 
			stmt.executeUpdate(query);
			System.out.println("Table Renamed Successfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}