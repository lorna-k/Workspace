package servlet;


import static dao.ImageAccess.displayImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.ImageAccess;
import db.DBUtils;
//import com.oreilly.servlet.MultipartRequest;//,com.microsoft.jdbc.sqlserver.SQLServerDriver;
/**
 * Servlet implementation class Post
 */
@WebServlet("/Post")
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
   
    public Post() {
        super();
        // TODO Auto-generated constructor stub
    }
      */
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
		
        String id = request.getSession().getAttribute("imageID")+"";
        
        
        byte[] imgData = displayImage(id);
        response.setContentType("image/jpg");
 
          OutputStream o = response.getOutputStream();
 
          o.write(imgData);
           
          o.flush();
          o.close();
          System.out.println("");
          
    
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		    ResultSet resulSet;
		    LinkedList<String> arrID;
		    String commentID=null;
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
			    		//System.out.println(element+" "+request.getParameter(element));
			    		commentID=element;
			    	}
			    }
			   
				   
			} 
			catch (ClassNotFoundException | SQLException e) 
			{
				e.printStackTrace();
			}
		   
		   
	
		
		    //Upload Post
            String sendPost = request.getParameter("post");
            String photo = request.getParameter("photo");
            Part filePart = request.getPart("photo");
            String caption = request.getParameter("caption");
            String sendcomment = commentID; 
            String comment = request.getParameter(sendcomment);
               
        	InputStream inputStream = null; // input stream of the upload file
        	
        	
        	if( filePart.getSize()!=0 )
        	{
        		inputStream = filePart.getInputStream();
        		
        		try 
				{
	
					//Adding the Post to the reject post database
	    		    
					PreparedStatement ps=DBUtils.getPreparedSatement("INSERT INTO Posts(PostId,Name,Surname,Caption,image) VALUES(?,?,?,?,?)");
			        ps.setString(1, LocalDateTime.now().toString());
			        ps.setString(2,request.getSession().getAttribute("currentUserName").toString());
			        ps.setString(3, request.getSession().getAttribute("currentUserSurname").toString());
			        ps.setString(4,request.getParameter("caption"));
			        ps.setBlob(5,inputStream);
			        //ps.setString(5, ProfilePic);
			        //ps.setInt (5, 0);
			        //ps.setString(7,Location);
	
			        ps.executeUpdate();
			        
					
				} 
				catch (ClassNotFoundException | SQLException e) 
	            {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
        		filePart=null;
        		response.sendRedirect("./JSP/Forum.jsp");
        	}
        	
        	
        	else if(caption!=null && sendPost!=null)
        	{
        		if(caption.length()>0)
        		{
        			
        		
					try 
					{
		
						//Adding the Post to the reject post database
		    		    
						PreparedStatement ps=DBUtils.getPreparedSatement("INSERT INTO Posts(PostId,Name,Surname,Caption) VALUES(?,?,?,?)");
				        ps.setString(1, LocalDateTime.now().toString());
				        ps.setString(2,request.getSession().getAttribute("currentUserName").toString());
				        ps.setString(3, request.getSession().getAttribute("currentUserSurname").toString());
				        ps.setString(4,request.getParameter("caption"));
				        //ps.setString(5, ProfilePic);
				        //ps.setInt (5, 0);
				        //ps.setString(7,Location);
		
				        ps.executeUpdate();
				        
						
					} 
					catch (ClassNotFoundException | SQLException e) 
		            {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					response.sendRedirect("./JSP/Forum.jsp");
        		}
	
				//System.out.println("");
				if(!(caption.length()>0))
				{
					response.sendRedirect("./JSP/Forum.jsp");
				}
        	}
        	
        	
        	else if( sendcomment!=null )
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
        			 
	        		 response.sendRedirect("./JSP/Forum.jsp");
        		 }
        		 else
        		 {
        			 response.sendRedirect("./JSP/Forum.jsp");
        		 }
        	}
        	
        	

	}
	
	
	

}
