/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import db.DBUtils;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement; 
import model.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author Student
 */
public class DataAccess 
{
    public void addNewUser(User user) throws ClassNotFoundException,SQLException
    {
    	if(user.getUserID()!="" || user.getFirstName()!="" || user.getEmail()!="" || user.getPassWord()!="" || user.getAccountType()!="")
    	{
	        PreparedStatement ps=DBUtils.getPreparedSatement("insert into Pending_Users values(?,?,?,?,?,?)");
	        ps.setString(1, user.getUserID());
	        ps.setString(2, user.getFirstName());
	        ps.setString(3, user.getLastName());
	        ps.setString(4, user.getEmail());
	        ps.setString(5, user.getPassWord());
	        ps.setString(6, user.getAccountType());
	        
	        ps.executeUpdate();
    	}
    }
    
    public boolean loginUser(String id,String password,HttpServletRequest request) throws ClassNotFoundException, SQLException 
    {
    	ResultSet logUsers = DBUtils.getPreparedSatement("select * from Users WHERE ID ='"+id+"'").executeQuery();
	    
	    if((logUsers.next()))
	    {
	    	if(logUsers.getString(5).equals(password))
	    	{
	    		//System.out.println("Welcome "+logUsers.getString(2));
	    		return true;
	    	}
	    	else
	    	{
	    		System.out.println("Incorrect Password: "+password+" , "+logUsers.getString(2)+" make sure you typing the correct password.");
	    		request.getSession().setAttribute("error_message","Incorrect Password");
	    		return false;
	    	}
	    }
	    else
	    {
	    	System.out.println("User "+id+" does not exists in the system please register!");
	    	request.getSession().setAttribute("error_message","User "+id+" does not exists in the system!");
	    }
	    
	    return  false;
    }
    
    public void addUser(User user) throws ClassNotFoundException,SQLException
    {
    	if(user.getUserID()!="" || user.getFirstName()!="" || user.getEmail()!="" || user.getPassWord()!="" || user.getAccountType()!="")
    	{
	        PreparedStatement ps=DBUtils.getPreparedSatement("insert into Users values(?,?,?,?,?,?)");
	        ps.setString(1, user.getUserID());
	        ps.setString(2, user.getFirstName());
	        ps.setString(3, user.getLastName());
	        ps.setString(4, user.getEmail());
	        ps.setString(5, user.getPassWord());
	        ps.setString(6, user.getAccountType());
	        
	        ps.executeUpdate();
    	}
    }
    
    public void rejectedUser(String data)
    {
    	
    	try 
    	{
			ResultSet rs=DBUtils.getPreparedSatement("select * from Pending_Users WHERE ID ='"+data+"'").executeQuery();
			
		    rs.next();
		    
			//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			
		    ResultSet rejectedusers=DBUtils.getPreparedSatement("select * from Rejected_Users WHERE ID ='"+data+"'").executeQuery();
		    
		    if(!(rejectedusers.next()))
		    {
		
			//Adding the user to the reject user database
		    
				PreparedStatement ps=DBUtils.getPreparedSatement("insert into Rejected_Users values(?,?,?,?,?,?)");
		        ps.setString(1, rs.getString(1));
		        ps.setString(2, rs.getString(2));
		        ps.setString(3, rs.getString(3));
		        ps.setString(4, rs.getString(4));
		        ps.setString(5, rs.getString(5));
		        ps.setString(6, rs.getString(6));
		        
		        ps.executeUpdate();
    	    }
		    
	        //Deleting the user from the pending users databse
	        //ResultSet deleteUser=DBUtils.getPreparedSatement("Delete from Pending_Users WHERE ID ='"+data+"'");
	        
	        Statement stmt = DBUtils.getConnection().createStatement();
	        String SQL = "Delete from Pending_Users WHERE ID ='"+data+"'";
	        stmt.executeUpdate(SQL);
                System.out.println(data+" "+"was rejected");
	        System.out.println("Removed From Pending Users and Added to Rejected Users db!");
	        
			
		}
    	catch (ClassNotFoundException | SQLException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
    
    public void deleteUser(String data)
    {
    	System.out.println(data+" "+"was deleted");
    	
    		    
	        //Deleting the user from the users databse
	        //ResultSet deleteUser=DBUtils.getPreparedSatement("Delete from Users WHERE ID ='"+data+"'");
	        
	        Statement stmt=null;
        try {
            stmt = DBUtils.getConnection().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
	        String SQL = "Delete from Users WHERE ID ='"+data+"'";
        try {
            stmt.executeUpdate(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
	        System.out.println("Removed From Users ");
	        
			
	
		
    }

    public void acceptedUser(String data)
    {
    	System.out.println(data+" "+"was Accepted");
    	
    	try 
    	{
			ResultSet rs=DBUtils.getPreparedSatement("select * from Pending_Users WHERE ID ='"+data+"'").executeQuery();
			
		    rs.next();
		    
			//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
			
		    ResultSet users=DBUtils.getPreparedSatement("select * from Users WHERE ID ='"+data+"'").executeQuery();
		    
		    if(!(users.next()))
		    {
		
			//Adding the user to the reject user database
		    
				PreparedStatement ps=DBUtils.getPreparedSatement("insert into Users values(?,?,?,?,?,?)");
		        ps.setString(1, rs.getString(1));
		        ps.setString(2, rs.getString(2));
		        ps.setString(3, rs.getString(3));
		        ps.setString(4, rs.getString(4));
		        ps.setString(5, rs.getString(5));
		        ps.setString(6, rs.getString(6));
		        
		        ps.executeUpdate();
    	    }
		    
	        //Deleting the user from the pending users databse
	        //ResultSet deleteUser=DBUtils.getPreparedSatement("Delete from Pending_Users WHERE ID ='"+data+"'");
	        
	        Statement stmt = DBUtils.getConnection().createStatement();
	        String SQL = "Delete from Pending_Users WHERE ID ='"+data+"'";
	        stmt.executeUpdate(SQL);
	        System.out.println("Removed From Pendind Users and Added to Users db!");
	        
			
		}
    	catch (ClassNotFoundException | SQLException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    

    
    public static List<User> getAll()
    {
    	ResultSet rs=null;
        List<User> usersList=new LinkedList<User>();
        try {
			rs=DBUtils.getPreparedSatement("select * from Users").executeQuery();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			while(rs.next())
			{
			    User ps=null;
				try 
				{
					ps = new User(rs.getString(1),(rs.getString(2)),(rs.getString(3)),(rs.getString(4)),(rs.getString(5)),(rs.getString(6)));
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    usersList.add(ps);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return usersList;
    }
   
}
