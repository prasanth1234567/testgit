package com.app2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryandCatch {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;	
		Statement statement=null;
	try{
         connection = DriverManager.getConnection("","","");
         statement = connection.prepareStatement("insert into emp values(?,?,?)");
		
	}catch(SQLException s){
		System.out.println("catch block executed");
		s.printStackTrace();
	}
	}

}
