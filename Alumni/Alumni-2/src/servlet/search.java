package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBUtils;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		
		String term= request.getParameter("searcher");
		request.getSession().setAttribute("searcher", term);
		String val= request.getParameter("search");
		request.getSession().setAttribute("search", val);
		
		//System.out.println(term);
		/*ResultSet rs=null;
		if(term!="")
    	{
			try 
			{

				//rs = DBUtils.getPreparedSatement("select * from CVs WHERE ID ='"+request.getSession().getAttribute("currentUserID")+"'").executeQuery();
				//rs.next();
				//ProfilePic=rs.getString(6);
				//Location=rs.getString(10);
				
				
				//Adding the Post to the reject post database
				String element="CapeTown";
				
				//PreparedStatement ps=DBUtils.getPreparedSatement("SELECT * FROM CVs WHERE "+term+" ='"+element+"'");
				PreparedStatement ps=DBUtils.getPreparedSatement("SELECT * FROM CVs WHERE "+term+" ='Cape Town'");
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
			
             

			System.out.println("");
            System.out.println("PostId: "+LocalDateTime.now());
            System.out.println("Name: "+ request.getSession().getAttribute("currentUserName"));
            System.out.println("Surname: "+ request.getSession().getAttribute("currentUserSurname"));
            System.out.println("Caption: "+request.getParameter("caption"));
            System.out.println("ProfilePic: "+ ProfilePic );
            System.out.println("Likes: "+0);
            System.out.println("Location: "+Location);
    	}*/
		
		 response.sendRedirect("./JSP/People.jsp");
		 /*request.getSession().setAttribute("searcher",null);
		 request.getSession().setAttribute("search", null);*/
	}

}
