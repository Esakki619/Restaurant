package dao;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


import model.DB;
import model.User;





@SuppressWarnings("unused")
public class Restaurant_Imp implements restaurantdao{
	
	@Override
	public void newRegister(User user) {
		// TODO Auto-generated method stub
		 try {
				Connection con = DB.getConnection();
				String sql = "insert into user(UserName,UserEmail,Password) values (?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
			
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getEmailId());
				ps.setString(3, user.getPassword());
				int rowaffected = 	ps.executeUpdate();
				System.out.println(rowaffected + " rows inserted");		
				con.close();
				 }catch(Exception e){
					 System.out.println("Error Restaurant DAO signup method : " + e);
				 }
		
	}

	@Override
	public void validateLogin(String username) {
		// TODO Auto-generated method stub
		try
		{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user where UserName=?");
			ps.setString(1, username);
			ResultSet rs=ps.executeQuery();
			rs.next();
			User user=new User(rs.getString(1),rs.getString(2),rs.getString(3));
			con.close();
			return user;
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error at validateLogin by getUserByName Method : "+e );
		}
		
		return null;
		
	}

	public void addRestaurant(User user) {
			 try {
			Connection con = DB.getConnection();
			String sql = "insert into user values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserID());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassword());
			int rowaffected = 	ps.executeUpdate();
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error Restaurant DAO addRestaurant method : " + e);
			 }
			
	
	}


	
	
	@Override
	public User getUserById(int UserID) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> userlist = new ArrayList<>();
		try {
			
			Connection con = DB.getConnection();
			String sql ="select * from user ";
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery(sql);
			while(rs.next()) {
				User u = new User( rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4));
				userlist.add(u);
			}
			
		}catch(Exception e) {
			System.out.println("Error RestaurantDao getalluser() : "+ e);
		}
		return userlist;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int Userid) {
		// TODO Auto-generated method stub
		
	}

}

