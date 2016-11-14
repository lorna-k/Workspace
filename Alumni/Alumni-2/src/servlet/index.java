package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
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
		//doGet(request, response);
		
		String login = request.getParameter("login");
        String adduser = request.getParameter("adduser");
        
        
        if(login!=null)
        {
        	 request.getSession().setAttribute("error_message","null");
        	 request.getSession().setAttribute("error_mssg","null");
        	System.out.println("login");
        	response.sendRedirect("./JSP/Login.jsp");
        }
        else if(adduser!=null)
        {
        	request.getSession().setAttribute("error_message","null");
        	request.getSession().setAttribute("error_mssg","null");
        	System.out.println("adduser");
        	response.sendRedirect("./JSP/addUser.jsp");
        }
        else
        {
        	System.out.println("else");
        	response.sendRedirect("./index.html");
        }
	}

}