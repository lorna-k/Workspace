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

import db.DBUtils;

/**
 * Servlet implementation class View_Profile
 */
@WebServlet("/View_Profile")
public class View_Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View_Profile() {
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
		    LinkedList<String> names;
		    String name=null;
			try 
			{
				resulSet = DBUtils.getPreparedSatement("select * from CVs ").executeQuery();
				
				
				names =new LinkedList<String>();
				while(resulSet.next())
				{
				    if(!(names.contains(resulSet.getString(2))))
				    {
					   names.add(resulSet.getString(2));
					 
				    }
				}
				
			    for(String element: names)
			    {
			    	//System.out.println("ELEMENET:"+" "+element);
			    	if(!(request.getParameter(element)==null  ))
			    	{
			    		//System.out.println(element+" "+request.getParameter(element));
			    		name=element;
			    	}
			    }
			   
				   
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		
		
			try 
			{
				ResultSet resulSet2 = DBUtils.getPreparedSatement("select * from CVs WHERE First_Name = '"+name+"'").executeQuery();
				resulSet2.next();
				request.getSession().setAttribute("view_id",resulSet2.getString(1));
			} catch (ClassNotFoundException | SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			request.getSession().setAttribute("view_name",name);
			response.sendRedirect("./JSP/View_Profile.jsp");
	}

}
