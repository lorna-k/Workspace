package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBUtils;

/**
 * Servlet implementation class Like_Post
 */
@WebServlet("/Like_Post")
public class Like_Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Like_Post() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResultSet resulSet;
	    LinkedList<String> arrID;
	    String likeID=null;
		try 
		{
			resulSet = DBUtils.getPreparedSatement("select * from Posts ").executeQuery();
			
			
			arrID =new LinkedList<String>();
			while(resulSet.next())
			{
			    if(!(arrID.contains(resulSet.getString(1))))
			    {
				   arrID.add(resulSet.getString(1));
				 
			    }
			}
			
			
		    for(String element: arrID)
		    {
		    	if(!(request.getParameter(element)==null))
		    	{
		    		System.out.println(element+" "+request.getParameter(element));
		    		likeID=element;
		    		
		    				    		
			    		 try 
	        			 {
		    			    DBUtils.getPreparedSatement("UPDATE Posts SET likes=likes+1 WHERE PostId ='"+likeID +"'").executeUpdate();
		    		    
						 } 
	        			 catch (ClassNotFoundException | SQLException e) 
	        			 {
							e.printStackTrace();
						 }
	        			 
		        		 response.sendRedirect("./JSP/Forum.jsp");
		        		 
		        		 
		    	}
		    }
		   
			   
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	   
	}

}
