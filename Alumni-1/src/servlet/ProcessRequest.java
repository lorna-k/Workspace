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
                String deleted=request.getParameter("delete");
		
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
		else if (request.getParameter("delete") != null)
		{
			dataAccess.deleteUser(deleted);
			response.sendRedirect("./JSP/SystemUsers.jsp");
		}
	}
		
		
		

}
