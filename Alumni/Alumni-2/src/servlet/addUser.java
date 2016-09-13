package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DataAccess;
import model.User;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addUser() {
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
		
	String id = request.getParameter("ID");
        String fname = request.getParameter("first_name");
        String lname = request.getParameter("last_name");
        String password = request.getParameter("passwrd");
        String accountType = request.getParameter("accountType");
        String email = request.getParameter("email");
   	 
        User user=new User(id,fname,lname,email,password,accountType);
        DataAccess da=new DataAccess();
        try {
			da.addNewUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        response.sendRedirect("./JSP/PendingUsers.jsp");
        
	}

}
