package servlet;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	 * This servlet is responsible for getting a post from the Pending_Users.jsp/System_Users.jsp/rejected_Users.jsp page and processing the inputs so that it may be transfered to the database and ready to be retrieved and displayed in the notifications page
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *This servlet is responsible for getting a post from the Pending_Users.jsp/System_Users.jsp/rejected_Users.jsp page and processing the inputs so that it may be transfered to the database and ready to be retrieved and displayed in the notifications page
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	String sendPost = request.getParameter("post");
        String notification = request.getParameter("notification"); //getting notification message
        
        
        if(!notification.equalsIgnoreCase("") )
    	{
			try 
			{

                        Calendar now = Calendar.getInstance();
                        
                       
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
                            
                       
                       Date date = new Date();
                       String strDateFormat = "h:mm a";
                       SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);//converting current time 
     
                       
                       String thedate =  now.get(Calendar.DATE)+" "+thismonth+"   "+sdf.format(date);//manufacturing the date string to be inserted to database
                       
                        PreparedStatement ps=DBUtils.getPreparedSatement("INSERT INTO Notifications(ID,today,Message) VALUES(?,?,?)");
		        ps.setString(1, "Admin");

		        ps.setString(2,thedate);
		        ps.setString(3,request.getParameter("notification"));
		       

		        ps.executeUpdate();
		        
				
			} 
			catch (ClassNotFoundException | SQLException e) 
                        {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 response.sendRedirect("./JSP/PendingUsers.jsp");
			
        
	}else{response.sendRedirect("./JSP/PendingUsers.jsp");}

}
}
