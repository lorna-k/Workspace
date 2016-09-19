package servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;
import db.DBUtils;
import model.User;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static String message="";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		String id = request.getParameter("ID");

	
        String fname = request.getParameter("first_name");
        String lname = request.getParameter("last_name");
        String password = request.getParameter("passwrd");
        String accountType = request.getParameter("accountType");
        String email = request.getParameter("email");
   	 	
        System.out.println(fname);
        User user=new User(id,fname,lname,email,password,accountType);
        DataAccess da=new DataAccess();
        try 
        {
        	boolean uNCheck =checkUsername(id);
        	boolean exist =checkExistance(id);
            boolean emailCheck =checkEmail(email);
            boolean passwordCheck =checkPassword(password);
            boolean userType=checkUserType(accountType);
            boolean userName=userName(fname);
            boolean userSurname=userSurname(lname);
            
        
            
        	if(uNCheck && emailCheck && passwordCheck && exist && userType && userName && userSurname )
        	{
        		da.addNewUser(user);
        		request.getSession().setAttribute("error_mssg","null");
        		response.sendRedirect("./signedup.html");
        	}
        	else
        	{
        		//System.out.println(message);
        		request.getSession().setAttribute("error_mssg",message);
        		
        		//System.out.println(message);
                response.sendRedirect("./JSP/addUser.jsp");
                message="";
        	}
        	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
  
        
	}
	
	public boolean userName(String fname)
	{
		if(fname.length()>0)
		{
			return true;
		}
		else
		{
			message+= "#Enter first name "+"\n";
			return false;
		}
	}
	
	public boolean userSurname(String lname)
	{
		if(lname.length()>0)
		{
			return true;
		}
		else
		{
			message+= "#Enter last name "+"\n";
			return false;
		}
	}
	
	public boolean checkUserType(String accountType)
	{
		if(accountType!=null)
		{
			return true;
		}
		else
		{
			message+= "#Choose user type "+"\n";
			return false;
		}
	}
	
	public  boolean checkUsername(String username)
	{
		String uN = username;
		//String message = "";
		if(uN.length()==9 && isNumeric(uN.substring(6)) || isNumeric(uN) && uN.length()==9  )
		{
			
			return true;
		}
		else
		{
			message+= "#Username format incorrect (.example XXXYYY001) "+"\n";
			return false;
		}
		
	}
	
	public boolean checkExistance(String ID)
	{
		ResultSet resulSet_SystemUsers;
		ResultSet resulSet_PendingUsers;
	    LinkedList<String> arrID;
		try 
		{
			resulSet_SystemUsers = DBUtils.getPreparedSatement("select * from Users ").executeQuery();
			resulSet_PendingUsers= DBUtils.getPreparedSatement("select * from Pending_Users ").executeQuery();
			
			
			arrID =new LinkedList<String>();
			while(resulSet_SystemUsers.next())
			{
			    if(!(arrID.contains(resulSet_SystemUsers.getString(1))))
			    {
				   arrID.add(resulSet_SystemUsers.getString(1));
				 
			    }
			}
			
			while(resulSet_PendingUsers.next())
			{
			    if(!(arrID.contains(resulSet_PendingUsers.getString(1))))
			    {
				   arrID.add(resulSet_PendingUsers.getString(1));
				 
			    }
			}
			
		 /*  for(String element: arrID)
		    {
			   System.out.println(element);
		   
		    }*/
		  
			if(arrID.contains(ID.toLowerCase()) || arrID.contains(ID.toUpperCase()) )
			{
				message+= "#User "+ID+" Already Exists"+"\n";
				System.out.println("User "+ID+" Already Exists");
				return false;
			}
			
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean isNumeric(String s) {
	    return java.util.regex.Pattern.matches("\\d+", s);
	}
	
	public boolean checkEmail(String email)
	{
		String em = email;
		CharSequence cs1 = "@";
		if(em.contains(cs1) )
		{
			
			return true;
		}
		else
		{
			message+= "#Email format incorrect, should contain @"+"\n";
			return false;
		}
		
	}

	public boolean checkPassword(String password){
		String ps = password;
		//String message = "";
		boolean gotUpper = false;
		boolean gotDigit = false;
		for (int i = 0; i < ps.length(); i++){
		    char c = ps.charAt(i);
		    if(Character.isUpperCase(c))
		    {
		    	gotUpper = true;
		    }	
		    else{
		    	if(i == ps.length() - 1 && gotUpper == false)
		    		message+="#Password should contain at least 1 upper case "+"\n";
		    }
		    	
		   
		}
		for (int i = 0; i < ps.length(); i++){
		    char c = ps.charAt(i);    
		    if(Character.isDigit(c))
		    	gotDigit = true;
		    else
		    	if(i == ps.length() - 1 && gotDigit == false)
		    		message+="#Password should contain at least 1 digit "+"\n";
		    //Process char
		}
		if(gotUpper && gotDigit)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		 
		
		
	}


}
