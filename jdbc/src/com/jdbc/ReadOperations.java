package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperations {

	public static void main(String[] args) {
		final String URL="jdbc:mysql://localhost:3306/mydata101r";
		String username="root";
		String password="Bujj1@sql_2004";
		
		String query="select * from student";
		
		try {
			
			// stage -1
			Connection connection=DriverManager.getConnection(URL,username,password);
			
			// stage -2
			Statement st=connection.createStatement();
			
			// stage -3
			
			ResultSet rs=st.executeQuery(query);
			
			// stage -4
			
//			rs.next();
//			int id=rs.getInt(1);
//			System.out.println(id);
			
			System.out.println("Id\tName\tAge\tMarks");
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				int marks=rs.getInt(4);				
				System.out.println(id + "\t" + name + "\t" + age + "\t" + marks );
			}
			
			// stage -5
			connection.close();
			rs.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
