package model;

import java.sql.SQLException;

import dao.DataAccess;

public class Admin 
{
	private String userName;
	private String password;
	
	public Admin(String userName,String password)
	{
		this.userName=userName;
		this.password=password;
		
		
	}
	
	
	public void rejectJoiningRequest(String userID)
	{
		DataAccess.rejectedUser(userID);
	}
	
	public void acceptJoiningRequest(User user)
	{
		try {
			DataAccess.addUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
