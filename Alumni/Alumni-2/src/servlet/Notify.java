package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBUtils;

/**
 * Servlet implementation class Notify
 */
@WebServlet("/Notify")
public class Notify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Notify() {
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
		String sendPost = request.getParameter("post");
        String notification = request.getParameter("notification");
        
        if(notification!="" && sendPost!=null)
    	{
			try 
			{

				//rs = DBUtils.getPreparedSatement("select * from CVs WHERE ID ='"+request.getSession().getAttribute("currentUserID")+"'").executeQuery();
				//rs.next();
				//ProfilePic=rs.getString(6);
				//Location=rs.getString(10);
				
				
				//Adding the Post to the reject post database
    		    
				PreparedStatement ps=DBUtils.getPreparedSatement("INSERT INTO Notifications(ID,today,Message) VALUES(?,?,?)");
		        ps.setString(1, "Admin");
                        
                        Calendar now = Calendar.getInstance();
                        
                       System.out.println("Current Year is : " + now.get(Calendar.YEAR));
                       // month start from 0 to 11
                       int month = now.get(Calendar.MONTH) + 1;
                       String thismonth= "";
                            switch (month) {
                                case 1:
                                    thismonth="Jan";
                                    break;
                                case 2:
                                    thismonth="Feb";
                                    break;
                                case 3:
                                    thismonth="Mar";
                                    break;
                                case 4:
                                    thismonth="Apr";
                                    break;
                                case 5:
                                    thismonth="May";
                                    break;
                                case 6:
                                    thismonth="Jun";
                                    break;
                                case 7:
                                    thismonth="Jul";
                                    break;
                                case 8:
                                    thismonth="Aug";
                                    break;
                                case 9:
                                    thismonth="Sept";
                                    break;
                                case 10:
                                    thismonth="Oct";
                                    break;
                                case 11:
                                    thismonth="Nov";
                                    break;
                                case 12:
                                    thismonth="Dec";
                                    break;
                                default:
                                    break;
                            }
                       System.out.println("Current Month is : " + thismonth);
                       System.out.println("Current Date is : " + now.get(Calendar.DATE));
                       String thedate =  now.get(Calendar.DATE)+" "+thismonth;
		        ps.setString(2,LocalDateTime.now().toString());
		        ps.setString(4,request.getParameter("notification"));
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
			 response.sendRedirect("./JSP/PendingUsers.jsp");
			
        
	}

}
}
