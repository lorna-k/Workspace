package servlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;


import db.DBUtils;
import com.oreilly.servlet.MultipartRequest;//,com.microsoft.jdbc.sqlserver.SQLServerDriver;
/**
 * Servlet implementation class Post
 */
@WebServlet("/Post")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Post() {
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

		
		    //Upload Post
            String sendPost = request.getParameter("post");
            String caption = request.getParameter("caption");
            String sendcomment = request.getParameter("sendComment");
            String comment = request.getParameter(sendcomment); 
            
            System.out.print(sendcomment+" "+comment);
        	ResultSet rs=null;
        	String ProfilePic=null;
        	String Location=null;
         	
        	if(caption!="" && sendPost!=null)
        	{
				try 
				{
	
					rs = DBUtils.getPreparedSatement("select * from CVs WHERE ID ='"+request.getSession().getAttribute("currentUserID")+"'").executeQuery();
					rs.next();
					ProfilePic=rs.getString(6);
					Location=rs.getString(10);
					
					
					//Adding the Post to the reject post database
	    		    
					PreparedStatement ps=DBUtils.getPreparedSatement("insert into Posts values(?,?,?,?,?,?,?)");
			        ps.setString(1, LocalDateTime.now()+"");
			        ps.setString(2,request.getSession().getAttribute("currentUserName")+"");
			        ps.setString(3, request.getSession().getAttribute("currentUserSurname")+"");
			        ps.setString(4,request.getParameter("caption"));
			        ps.setString(5, ProfilePic);
			        ps.setInt (6, 0);
			        ps.setString(7,Location);
	
			        ps.executeUpdate();
			        
					
				} 
				catch (ClassNotFoundException | SQLException e) 
	            {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	             
	
				System.out.println("");
	            System.out.println("PostId: "+LocalDateTime.now());
	            System.out.println("Name: "+ request.getSession().getAttribute("currentUserName"));
	            System.out.println("Surname: "+ request.getSession().getAttribute("currentUserSurname"));
	            System.out.println("Caption: "+request.getParameter("caption"));
	            System.out.println("ProfilePic: "+ ProfilePic );
	            System.out.println("Likes: "+0);
	            System.out.println("Location: "+Location);
	            	
	            response.sendRedirect("./JSP/Feed.jsp");
        	}
        	
        	
        	if( sendcomment!=null )
        	{
        		 if(comment!="")
        		 {
        
        			 try 
        			 {
						PreparedStatement ps=DBUtils.getPreparedSatement("insert into Comments values(?,?,?,?)");
						
						ps.setString(1, sendcomment);
						ps.setString(2, request.getSession().getAttribute("currentUserName")+"");
						ps.setString(3, request.getSession().getAttribute("currentUserSurname")+"" );
						ps.setString(4, comment);
						
						ps.executeUpdate();
					 } 
        			 catch (ClassNotFoundException | SQLException e) 
        			 {
						e.printStackTrace();
					 }
        			 
	        		 response.sendRedirect("./JSP/Feed.jsp");
        		 }
        		 else
        			 response.sendRedirect("./JSP/Feed.jsp");
        	}
        	


	}
	
	
	

}
