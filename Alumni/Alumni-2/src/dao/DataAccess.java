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
    
    public boolean loginUser(String id,String password) throws ClassNotFoundException, SQLException 
    {
    	ResultSet logUsers=DBUtils.getPreparedSatement("select * from Users WHERE ID ='"+id+"'").executeQuery();
	    
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
	    		return false;
	    	}
	    }
	    else
	    {
	    	System.out.println("User "+id+" does not exists in the system please register!");
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
    	System.out.println(data+" "+"was rejected");
    	
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
	        System.out.println("Removed From Pendind Users and Added to Rejected Users db!");
	        
			
		}
    	catch (ClassNotFoundException | SQLException e) 
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
    
    
    
    public static String encode(byte[] data)
    {
        char[] tbl = {
            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f',
            'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
            'w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/' };

        StringBuilder buffer = new StringBuilder();
        int pad = 0;
        for (int i = 0; i < data.length; i += 3) {

            int b = ((data[i] & 0xFF) << 16) & 0xFFFFFF;
            if (i + 1 < data.length) {
                b |= (data[i+1] & 0xFF) << 8;
            } else {
                pad++;
            }
            if (i + 2 < data.length) {
                b |= (data[i+2] & 0xFF);
            } else {
                pad++;
            }

            for (int j = 0; j < 4 - pad; j++) {
                int c = (b & 0xFC0000) >> 18;
                buffer.append(tbl[c]);
                b <<= 6;
            }
        }
        for (int j = 0; j < pad; j++) {
            buffer.append("=");
        }

        return buffer.toString();
    }
    
    
    
}
