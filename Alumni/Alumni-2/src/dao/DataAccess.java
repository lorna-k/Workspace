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
import model.CV;
import model.Profile;
/**
 *
 * @author Student
 */
public class DataAccess 
{
    public static void updateProfile(Profile p, String sql) throws ClassNotFoundException {
        try {
            
            PreparedStatement stmt = DBUtils.getPreparedSatement(sql);
            
            
            ResultSet resulSet = DBUtils.getPreparedSatement("select * from CVs ").executeQuery();
            LinkedList<String> arrID =new LinkedList<String>();
    		while(resulSet.next())
    		{
    		    if(!(arrID.contains(resulSet.getString(1))))
    		    {
    			   arrID.add(resulSet.getString(1));
    			 
    		    }
    		}
    		
    		String userID=p.getId();
    		if(arrID.contains(userID.toLowerCase()) || arrID.contains(userID.toUpperCase()))
    		{
    			
    			ResultSet resulSet_CV = DBUtils.getPreparedSatement("select * from CVs WHERE ID = '"+p.getId() +"'").executeQuery();
    			
    			PreparedStatement ps=DBUtils.getPreparedSatement("DELETE from CVs WHERE ID = '"+p.getId() +"'");
    			
    			ps.executeUpdate();
   
            
	            if(p.getId() !="" || p.getFname() !="" || p.getLname() !="" || p.getOccupation() !=""  || p.getCurrentCompany() !="" ||
	                    p.getAddress1()!="" || p.getAddress2() !="" || p.getCity() !=""  || p.getPostalCode() !="" || p.getPhone() !="" || p.getEmail() !="" )
	            {
	                
	                stmt.setString(1, p.getId());
	                stmt.setString(2, p.getFname());
	                stmt.setString(3, p.getLname());
	                stmt.setString(4, p.getOccupation());
	                stmt.setString(5, p.getCurrentCompany());
	                stmt.setString(6, p.getAddress1());
	                stmt.setString(7, p.getAddress2());
	                stmt.setString(8, p.getCity());
	                stmt.setString(9, p.getPostalCode());
	                stmt.setString(10, p.getPhone());
	                stmt.setString(11, p.getEmail());
	                
	                stmt.setString(12,resulSet_CV.getString(12));
	                stmt.setString(13,resulSet_CV.getString(13));
	                stmt.setString(14,resulSet_CV.getString(14));
	                stmt.setString(15,resulSet_CV.getString(15));
	                stmt.setString(16,resulSet_CV.getString(16));
	                stmt.setString(17,resulSet_CV.getString(17));
	                stmt.setString(18,resulSet_CV.getString(18));
	                stmt.setString(19,resulSet_CV.getString(19));
	                stmt.setString(20,resulSet_CV.getString(20));
	                stmt.setString(21,resulSet_CV.getString(21));
	                stmt.setString(22,resulSet_CV.getString(22));
	                
	                stmt.setString(23,resulSet_CV.getString(23));
	                stmt.setString(24,resulSet_CV.getString(24));
	                stmt.setString(25,resulSet_CV.getString(25));
	                stmt.setString(26,resulSet_CV.getString(26));
	                stmt.setString(27,resulSet_CV.getString(27));
	                stmt.setString(28,resulSet_CV.getString(28));
	                stmt.setString(29,resulSet_CV.getString(29));
	                stmt.setString(30,resulSet_CV.getString(30));
	                stmt.setString(31,resulSet_CV.getString(31));
	                stmt.setString(32,resulSet_CV.getString(32));
	                
	                stmt.setString(33,resulSet_CV.getString(33));
	              
	                stmt.executeUpdate();
	                
	                System.out.println("data-access");
	            }
            
            
    		}
    		
    		
    		else if(p.getId() !="" || p.getFname() !="" || p.getLname() !="" || p.getOccupation() !=""  || p.getCurrentCompany() !="" ||
                    p.getAddress1()!="" || p.getAddress2() !="" || p.getCity() !=""  || p.getPostalCode() !="" || p.getPhone() !="" || p.getEmail() !="" )
            {
                
                stmt.setString(1, p.getId());
                stmt.setString(2, p.getFname());
                stmt.setString(3, p.getLname());
                stmt.setString(4, p.getOccupation());
                stmt.setString(5, p.getCurrentCompany());
                stmt.setString(6, p.getAddress1());
                stmt.setString(7, p.getAddress2());
                stmt.setString(8, p.getCity());
                stmt.setString(9, p.getPostalCode());
                stmt.setString(10, p.getPhone());
                stmt.setString(11, p.getEmail());
                
                stmt.setString(12,"");
                stmt.setString(13,"");
                stmt.setString(14,"");
                stmt.setString(15,"");
                stmt.setString(16,"");
                stmt.setString(17,"");
                stmt.setString(18,"");
                stmt.setString(19,"");
                stmt.setString(20,"");
                stmt.setString(21,"");
                stmt.setString(22,"");
                
                stmt.setString(23,"");
                stmt.setString(24,"");
                stmt.setString(25,"");
                stmt.setString(26,"");
                stmt.setString(27,"");
                stmt.setString(28,"");
                stmt.setString(29,"");
                stmt.setString(30,"");
                stmt.setString(31,"");
                stmt.setString(32,"");
                
                stmt.setString(33,"");
                
                
                stmt.executeUpdate();
                System.out.println("data-access");
            }
    		
    		
        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        System.out.println("Profile Added");
    }

    public static void updateCV(CV cv,String sql) {
        try 
        {
           
        	
        	PreparedStatement stmt = DBUtils.getPreparedSatement(sql);
            
            
            ResultSet resulSet = DBUtils.getPreparedSatement("select * from CVs ").executeQuery();
            LinkedList<String> arrID =new LinkedList<String>();
    		while(resulSet.next())
    		{
    		    if(!(arrID.contains(resulSet.getString(1))))
    		    {
    			   arrID.add(resulSet.getString(1));
    			 
    		    }
    		}
    		
    		String userID=cv.getId();
    		if(arrID.contains(userID.toLowerCase()) || arrID.contains(userID.toUpperCase()))
    		{
    			
    			ResultSet resulSet_CV = DBUtils.getPreparedSatement("select * from CVs WHERE ID = '"+cv.getId() +"'").executeQuery();
    			resulSet_CV.next();
    			PreparedStatement ps=DBUtils.getPreparedSatement("DELETE from CVs WHERE ID = '"+cv.getId() +"'");
    			
    			ps.executeUpdate();
   
            
	            if(cv.getId() !="" || cv.getHighestDegree()!="" || cv.getInst1()!="" || cv.getMajor1()!=""  || cv.getMajor2() !="" ||
	                    cv.getGradYear()!="" || cv.getSchool() !="" || cv.getSchoolYear() !=""  || cv.getJob1()!="" ||cv.getJob1Company()!="" || cv.getJob1Year()!="" || cv.getJob2()!="" ||cv.getJob2Company()!="" || cv.getJob2Year()!="" || cv.getSkill1()!="" || cv.getSkill2()!="" || cv.getSkill3()!="" || cv.getSkill4()!="" || cv.getSkill5()!="" || cv.getRefName1()!="" || cv.getRefEmail1()!="" || cv.getRefName2()!="" || cv.getRefEmail2()!="")
	            {
	                
	            	System.out.println(resulSet_CV.getString(1)+" "+resulSet_CV.getString(2)+" "+resulSet_CV.getString(3)+" "+resulSet_CV.getString(4)+" "+resulSet_CV.getString(5)+" "+resulSet_CV.getString(6)+" "+resulSet_CV.getString(7)+" "+resulSet_CV.getString(8)+" "+resulSet_CV.getString(9)+" "+resulSet_CV.getString(10)+" "+resulSet_CV.getString(11));
	                stmt.setString(1, resulSet_CV.getString(1));
	                stmt.setString(2, resulSet_CV.getString(2));
	                stmt.setString(3, resulSet_CV.getString(3));
	                stmt.setString(4, resulSet_CV.getString(4));
	                stmt.setString(5, resulSet_CV.getString(5));
	                stmt.setString(6, resulSet_CV.getString(6));
	                stmt.setString(7, resulSet_CV.getString(7));
	                stmt.setString(8, resulSet_CV.getString(8));
	                stmt.setString(9, resulSet_CV.getString(9));
	                stmt.setString(10, resulSet_CV.getString(10));
	                stmt.setString(11, resulSet_CV.getString(11));
	                
	                stmt.setString(12,cv.getHighestDegree());
	                stmt.setString(13,cv.getInst1());
	                stmt.setString(14,cv.getMajor1());
	                stmt.setString(15,cv.getMajor2() );
	                stmt.setString(16,cv.getGradYear());
	                stmt.setString(17,cv.getSchool());
	                stmt.setString(18,cv.getSchoolYear() );
	                stmt.setString(19,cv.getJob1());
	                stmt.setString(20,cv.getJob1Company());
	                stmt.setString(21,cv.getJob1Year());
	                stmt.setString(22,cv.getJob2());
	                
	                stmt.setString(23,cv.getJob2Company());
	                stmt.setString(24,cv.getJob2Year());
	                stmt.setString(25,cv.getSkill1());
	                stmt.setString(26,cv.getSkill2());
	                stmt.setString(27,cv.getSkill3());
	                stmt.setString(28,cv.getSkill4());
	                stmt.setString(29,cv.getSkill5());
	                stmt.setString(30,cv.getRefName1());
	                stmt.setString(31,cv.getRefEmail1());
	                stmt.setString(32,cv.getRefName2());
	                
	                stmt.setString(33,cv.getRefEmail2());
	              
	                stmt.executeUpdate();
	                
	                System.out.println("data-access");
	            }
            
            
    		}
    		
    		
    		else  if(cv.getId() !="" || cv.getHighestDegree()!="" || cv.getInst1()!="" || cv.getMajor1()!=""  || cv.getMajor2() !="" ||
                    cv.getGradYear()!="" || cv.getSchool() !="" || cv.getSchoolYear() !=""  || cv.getJob1()!="" ||cv.getJob1Company()!="" || cv.getJob1Year()!="" || cv.getJob2()!="" ||cv.getJob2Company()!="" || cv.getJob2Year()!="" || cv.getSkill1()!="" || cv.getSkill2()!="" || cv.getSkill3()!="" || cv.getSkill4()!="" || cv.getSkill5()!="" || cv.getRefName1()!="" || cv.getRefEmail1()!="" || cv.getRefName2()!="" || cv.getRefEmail2()!="")
            {
                
                stmt.setString(1,"");
                stmt.setString(2,"");
                stmt.setString(3, "");
                stmt.setString(4, "");
                stmt.setString(5, "");
                stmt.setString(6, "");
                stmt.setString(7, "");
                stmt.setString(8,"");
                stmt.setString(9, "");
                stmt.setString(10, "");
                stmt.setString(11,"");
                
                stmt.setString(12,cv.getHighestDegree());
                stmt.setString(13,cv.getInst1());
                stmt.setString(14,cv.getMajor1());
                stmt.setString(15,cv.getMajor2() );
                stmt.setString(16,cv.getGradYear());
                stmt.setString(17,cv.getSchool());
                stmt.setString(18,cv.getSchoolYear() );
                stmt.setString(19,cv.getJob1());
                stmt.setString(20,cv.getJob1Company());
                stmt.setString(21,cv.getJob1Year());
                stmt.setString(22,cv.getJob2());
                
                stmt.setString(23,cv.getJob2Company());
                stmt.setString(24,cv.getJob2Year());
                stmt.setString(25,cv.getSkill1());
                stmt.setString(26,cv.getSkill2());
                stmt.setString(27,cv.getSkill3());
                stmt.setString(28,cv.getSkill4());
                stmt.setString(29,cv.getSkill5());
                stmt.setString(30,cv.getRefName1());
                stmt.setString(31,cv.getRefEmail1());
                stmt.setString(32,cv.getRefName2());
                
                stmt.setString(33,cv.getRefEmail2());
                
                
                stmt.executeUpdate();
                System.out.println("data-access");
            }
        	
        	
        	
        	
        	
            
        } 
        catch (ClassNotFoundException ex) 
        {
            ex.printStackTrace();
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
    
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
	    		//System.out.println("Incorrect Password: "+password+" , "+logUsers.getString(2)+" make sure you typing the correct password.");
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
