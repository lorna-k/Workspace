package servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
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
import org.apache.tomcat.util.http.fileupload.FileItemIterator;
import org.apache.tomcat.util.http.fileupload.FileItemStream;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import db.DBUtils;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//Upload Post
        //String caption = request.getParameter("caption");         
         // input stream of the upload file
         
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
 
  
        if(isMultipart)
        {
        	ServletFileUpload fileUpload = new ServletFileUpload();
        	
        	// Create a factory for disk-based file items
        	DiskFileItemFactory factory = new DiskFileItemFactory();
        	
        	// Configure a repository (to ensure a secure temp location is used)
        	ServletContext servletContext = this.getServletConfig().getServletContext();
        	File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
        	factory.setRepository(repository);

        	// Create a new file upload handler
        	ServletFileUpload upload = new ServletFileUpload(factory);
        	
			// Parse the request
			List<FileItem> items=null;// = upload.parseRequest(request);
    
            
//			try 
//			{
				// Process the uploaded items
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) {
				    FileItem item = iter.next();

				    if (item.isFormField()) {
				        //processFormField(item);
				    } else {
				        //processUploadedFile(item);
				    }
				}
	            
//	        } 
//			catch (FileUploadException e) 
//			{
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
			
            // prints out some information for debugging
            //System.out.println(filePart.getName());
            //System.out.println(filePart.getSize());
            //System.out.println(filePart.getContentType());
        	
//        	//Pull relevant data from user cv
//        	ResultSet rs;
//        	String ProfilePic=null;
//        	String Location=null;
//        	
//			try 
//			{
//				rs = DBUtils.getPreparedSatement("select * from CVs WHERE ID ='"+request.getSession().getAttribute("currentUserID")+"'").executeQuery();
//				rs.next();
//				ProfilePic=rs.getString(6);
//				Location=rs.getString(10);
//			} 
//			catch (ClassNotFoundException | SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//             
//            // obtains input stream of the upload file
//			if(filePart != null)
//			{
//				inputStream = filePart.getInputStream();
//			}
//			
//			System.out.println("");
//            System.out.println("PostId: "+LocalDateTime.now());
//            System.out.println("Name: "+ request.getSession().getAttribute("currentUserName"));
//            System.out.println("Surname: "+ request.getSession().getAttribute("currentUserSurname"));
//            System.out.println("Post: "+caption);
//            System.out.println("ProfilePic: "+ ProfilePic );
//            
//            if(filePart != null)
//			{
//            	System.out.println("File: "+ filePart.getName());
//            	//rs.setBlob(3, inputStream);
//			}
//            	
//            System.out.println("Likes: "+0);
//            System.out.println("Location: "+Location);
//            
            response.sendRedirect("./JSP/Feed.jsp");
        	
        }
		
        else
        {
        	response.sendRedirect("./JSP/Feed.jsp");
        	System.out.println("");
        	System.out.println("Nithong..");
        	System.out.println(request.getParameter("caption"));
        }

				
			
		
		
	}

}
