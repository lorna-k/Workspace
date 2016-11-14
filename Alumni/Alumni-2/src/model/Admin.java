package model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

import dao.DataAccess;
import db.DBUtils;

public class Admin 
{
	private String userName;
	private String password;
	
	public Admin(String userName,String password)
	{
		this.userName=userName;
		this.password=password;
		
		
	}
	
	//This method returns all the posts in a form of a resultset.
		public ResultSet viewPosts()
		{
			
			Connection connection;
			ResultSet resultset=null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
				Statement statement = connection.createStatement() ;
		        resultset =  statement.executeQuery("select * from Posts ORDER BY PostId desc") ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        
	        return resultset;
		}
		
		//This method returns all the notifications in a form of a resultset.
		public ResultSet viewNotifications()
		{
			Connection connection;
			ResultSet resultset=null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
				Statement statement = connection.createStatement() ;
		        resultset =  statement.executeQuery("select * from Notifications ORDER BY today desc") ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        
	        return resultset;
		}
		
		
		//Creates user post given the caption
		public void createPost(String caption)
		{
			try 
			{

				//Adding the Post to the reject post database
			    
				PreparedStatement ps=DBUtils.getPreparedSatement("INSERT INTO Posts(PostId,Name,Surname,Caption) VALUES(?,?,?,?)");
		        ps.setString(1, LocalDateTime.now().toString());
		        ps.setString(2,"Admin");
		        ps.setString(3, "");
		        ps.setString(4,caption);
		        //ps.setString(5, ProfilePic);
		        //ps.setInt (5, 0);
		        //ps.setString(7,Location);

		        ps.executeUpdate();
		        
				
			} 
			catch (ClassNotFoundException | SQLException e) 
	        {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Creates an Advert given the inpput of the file and the caption
		public void createAdvert(InputStream inputStream,String caption)
		{
			
			try 
			{

				//Adding the Post to the reject post database
			    
				PreparedStatement ps=DBUtils.getPreparedSatement("INSERT INTO Posts(PostId,Name,Surname,Caption,image) VALUES(?,?,?,?,?)");
		        ps.setString(1, LocalDateTime.now().toString());
		        ps.setString(2,"Admin");
		        ps.setString(3,"");
		        ps.setString(4,caption);
		        ps.setBlob(5,inputStream);
		        //ps.setString(5, ProfilePic);
		        //ps.setInt (5, 0);
		        //ps.setString(7,Location);

		        ps.executeUpdate();
		        
				
			} 
			catch (ClassNotFoundException | SQLException e) 
	        {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Likes post given the postID
		public void likePost(String postID)
		{
			try 
			 {
			    DBUtils.getPreparedSatement("UPDATE Posts SET likes=likes+1 WHERE PostId ='"+postID +"'").executeUpdate();
		    
			 } 
			 catch (ClassNotFoundException | SQLException e) 
			 {
				e.printStackTrace();
			 }
		}
		
		//Commnet on the post given postID and the comment message
		public void comment(String postID,String comment)
		{
			 try 
			 {
				PreparedStatement ps=DBUtils.getPreparedSatement("insert into Comments values(?,?,?,?)");
				
				ps.setString(1, postID);
				ps.setString(2, "Admin");
				ps.setString(3, "" );
				ps.setString(4, comment);
				
				ps.executeUpdate();
			 } 
			 catch (ClassNotFoundException | SQLException e) 
			 {
				e.printStackTrace();
			 }
		}
		
		
		//Searches and returns a user in a form of a resultSet
		
		public ResultSet search(String userID)
		{
			Connection connection;
			ResultSet resultset=null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
				Statement statement = connection.createStatement() ;
	            
		        resultset = statement.executeQuery("SELECT * from CVs WHERE userID = '"+userID+"'");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	         
	        		
	        return resultset;
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
	
	public void removeUser(String userID)
	{
		DataAccess.deleteUser(userID);
	}
	
	
	
 
}
