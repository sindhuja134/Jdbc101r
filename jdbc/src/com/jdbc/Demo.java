package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		
		final String URL="jdbc:mysql://localhost:3306/mydata101r";
		String username="root";
		String password="Bujj1@sql_2004";
		
		String query="insert into student values(104,'sindhu',22,58)";
		
		// String query="update student set marks=68 where id=101";
		
		//String query="delete from student where id=101";
		
		try {
       
		// stage-1:
		
		Connection connection=DriverManager.getConnection(URL,username,password);
		
		// stage-2
		
		Statement st=connection.createStatement();
		
		// stage-3
		
		 int rows= st.executeUpdate(query);
		 System.out.println(rows+"  inserted...");
		 
		 // stage 5
		 
		 connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
