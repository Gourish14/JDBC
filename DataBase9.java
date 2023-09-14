package com.cozentus.JDBC;
// DDL -> CREATE
// Creating a table of named Student.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase9 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/StudentDB";
		String username = "root";
		String password = "password";
		String query = "Create Table Student(Roll int, Name varchar(20), Standard int, Percentage int)";
		try(Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();){ 
			stmt.executeUpdate(query);
			System.out.println("Table Created Successfully !!");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}