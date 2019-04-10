package dao;

import java.util.List;

import model.User;
public interface restaurantdao {
	public void addRestaurant(User user);
	public void newRegister(User user);
	public String validateLogin(String username);
	public User getUserById(int UserID);
	public List<User> getAllUser();
	public void updateUser(User user);
	public void deleteUser(int UserID);
	
}
