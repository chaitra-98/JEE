package com.xworkz.JDBCconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {
	public static void main(String[] args) {
		String sqlQuery= "update hotels set Name = 'taj' where idHotels=2" ;
				
				try(Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/20transowd08",
							"root","Root");
					Statement stmt=conn.createStatement();){
					
						int results = stmt.executeUpdate(sqlQuery);
						System.out.println(results);
						
						
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				// TODO Auto-generated method stub


}
