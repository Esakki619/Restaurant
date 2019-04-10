package model;

public class User {
	private String UserID;
	private String UserName;
	private String Password;
	private String EmailId;
	
	

	public User(String userName, String password, String emailId) {
		super();
		UserName = userName;
		Password = password;
		EmailId = emailId;
	}

	public User(String userID, String userName, String password, String emailId) {
		super();
		UserID = userID;
		UserName = userName;
		Password = password;
		EmailId = emailId;
	}

	public User(String userName) {
		super();
		UserName = userName;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	

}