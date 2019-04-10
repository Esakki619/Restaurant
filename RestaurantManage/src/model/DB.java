package model;
import java.sql.DriverManager;

import java.sql.Connection;


public class DB {
	private DB() 
	{
		
	}
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Driver d=new Driver();
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantnew", "root","");
			System.out.println("CONNECTION ESTABLISHED");
			
		}
		catch(Exception e) {
			System.out.println("Error add restaurant method"+e);
		}
		return con;
	}

}
