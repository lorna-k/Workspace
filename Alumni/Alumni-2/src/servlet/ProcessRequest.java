package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;

/**
 * Servlet implementation class ProcessRequest
 */
@WebServlet("/ProcessRequest")
public class ProcessRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessRequest() {
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
		//doGet(request, response);
		
		DataAccess dataAccess=new DataAccess();
		String accepted=request.getParameter("accept");
		String rejected=request.getParameter("reject");
		
		//Admin Processing users requests from the Pending user table
		if (request.getParameter("accept") != null)
		{
			dataAccess.acceptedUser(accepted);
			response.sendRedirect("./JSP/PendingUsers.jsp");
		}
		
		else if (request.getParameter("reject") != null)
		{
			dataAccess.rejectedUser(rejected);
			response.sendRedirect("./JSP/PendingUsers.jsp");
		}
		
		//Login user
		if(request.getParameter("id")!=null && request.getParameter("password")!=null )
		{
			
			try {
				if(dataAccess.loginUser(request.getParameter("id"), request.getParameter("password")))
				{
						System.out.println("Redirecting...");
						request.getSession().setAttribute("currentUser",request.getParameter("id"));
						response.sendRedirect("./JSP/Feed.jsp");
						
				}
				else
					response.sendRedirect("./login.html");
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
			
		}

		
	}

}
