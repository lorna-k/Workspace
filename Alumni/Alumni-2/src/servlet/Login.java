/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Login")
import dao.DataAccess;
import db.DBUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorna Nqodi
 */
public class Login extends HttpServlet {

    DataAccess dataAccess = new DataAccess();

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        //retrieve values from html page
        String loginId = request.getParameter("id");
        String loginPassword = request.getParameter("password");
//        System.out.println(loginId + " " +loginPassword);
         
        //Check whether user has entered all fields
        if(loginId.equals("") || loginPassword.equals(""))
        {
           // request.setAttribute("errorMsg", "All fields must be entered");
            request.getSession().setAttribute("error_message","All fields must be entered");
           // getServletContext().getRequestDispatcher("./JSP/AdminPage.jsp").forward(request, response);
            response.sendRedirect("./JSP/Login.jsp");
        }
        
        //Check whether user is system administrator
        else if (loginId.equals("admin") && loginPassword.equals("admin")) 
        {
            //HttpSession session = request.getSession();
            //session.setAttribute("Username", loginId);
            request.getSession().setAttribute("Admin","true");
            System.out.println("Admin has logged in");
            request.getSession().setAttribute("error_message","null");
            request.getSession().setAttribute("currentUserName","Admin");
            response.sendRedirect("./JSP/PendingUsers.jsp");  //redirect to admin page
        }
        //System user login
        else 
        {   //removed the if statement for it was redundant
			try {
				if(dataAccess.loginUser(request.getParameter("id"), request.getParameter("password"),request))
				{
						System.out.println("Redirecting to Feed page...");
						
						ResultSet rs=DBUtils.getPreparedSatement("select * from Users WHERE ID ='"+request.getParameter("id")+"'").executeQuery();
						rs.next();
						
						//Getting the neccessary details of the logged user
						request.getSession().setAttribute("currentUserID",rs.getString(1));
						request.getSession().setAttribute("currentUserName",rs.getString(2));
						request.getSession().setAttribute("currentUserSurname",rs.getString(3));
						request.getSession().setAttribute("currentUserEmail",rs.getString(4));
						request.getSession().setAttribute("currentUserPassword",rs.getString(5));
						request.getSession().setAttribute("currentUserType",rs.getString(6));
						
						request.getSession().setAttribute("error_message","null");
						response.sendRedirect("./JSP/Forum.jsp");
						//response.sendRedirect("feed.html");
						
				}
				else
				{
					//request.getSession().setAttribute("error_message",rs.getString(1));
					response.sendRedirect("./JSP/Login.jsp");
				}
				
			} catch (ClassNotFoundException | SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
        }
    }
}
