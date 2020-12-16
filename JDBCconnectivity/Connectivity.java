package com.xworkz.JDBCconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {

	public static void main(String[] args) {
String sqlQuery= "Select * from hotels";
		
		try(Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/20transowd08",
					"root","Root");
			Statement stmt=conn.createStatement();
			ResultSet results = stmt.executeQuery(sqlQuery);)
			{
				System.out.println(conn);
				
				while(results.next()) {
					int id=results.getInt("idHotels");
					String Name= results.getString("Name");
					int noofRooms = results.getInt(3);
					
					System.out.println("id: "+id);
					System.out.println("name: "+Name);
					System.out.println("noOfRooms: "+noofRooms);
					
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
		// TODO Auto-generated method stub

	}


