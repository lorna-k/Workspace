package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchPost
 */
@WebServlet("/searchPost")
public class searchPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchPost() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String term1="";
		term1=request.getParameter("searcher1");
		request.getSession().setAttribute("searcher1", term1);
		String val1="";
		val1=request.getParameter("search1");
		request.getSession().setAttribute("search1", val1);
		System.out.println(val1);
		
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
		
		response.sendRedirect("./JSP/Post_Monitor.jsp");
		 /*request.getSession().setAttribute("searcher",null);
		 request.getSession().setAttribute("search", null);*/
	}

}
