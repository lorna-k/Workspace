package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import dao.DataAccess;
import db.DBUtils;

/**
 * Servlet implementation class ProcessRequest
 */
@WebServlet("/ProcessRequest")
@MultipartConfig(maxFileSize = 16177215) // upload file's size up to 16MB
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		DataAccess dataAccess=new DataAccess();
		String accepted=request.getParameter("accept");
		String rejected=request.getParameter("reject");
		
		//# Possible request 1
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
		
		//# Possible request 2
		//Login user
		if(request.getParameter("id")!=null && request.getParameter("password")!=null )
		{
			
			try {
				if(dataAccess.loginUser(request.getParameter("id"), request.getParameter("password")))
				{
						System.out.println("Redirecting to Feed page...");
						
						ResultSet rs=DBUtils.getPreparedSatement("select * from Users WHERE ID ='"+request.getParameter("id")+"'").executeQuery();
						rs.next();
						
						//Getting the neccessary details of the logged user
						request.getSession().setAttribute("currentUserID",rs.getString(1));
						request.getSession().setAttribute("currentUserName",rs.getString(2));
						request.getSession().setAttribute("currentUserSurname",rs.getString(3));
						request.getSession().setAttribute("currentUserEmail",rs.getString(4));
						request.getSession().setAttribute("currentUserPassword",rs.getString(5));
						request.getSession().setAttribute("currentUserType",rs.getString(6));
						
						//response.sendRedirect("./JSP/Feed.jsp");
						response.sendRedirect("feed.html");
						
				}
				else
					response.sendRedirect("./login.html");
				
			} catch (ClassNotFoundException | SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
			
		}
	}
		
		
		

}
