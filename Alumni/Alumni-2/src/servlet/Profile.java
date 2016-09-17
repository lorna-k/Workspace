/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lorna Nqodi
 */
public class Profile extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
            throws ServletException, IOException {
        //Retrieve parameters from EditProfile.JSP
        String id = request.getParameter("ID");
        String fname = request.getParameter("First_Name");
        String lname = request.getParameter("Last_Name");
        String occupation = request.getParameter("Occupation");
        String address1 = request.getParameter("Address_Line1");
        String address2 = request.getParameter("Address_Line2");
        String city = request.getParameter("City");
        String postalCode = request.getParameter("Postal_Code");
        String phone = request.getParameter("Phone");
        String email = request.getParameter("Email");
        String degree = request.getParameter("Highest_Degree");
        String inst1 = request.getParameter("Institution1");
        String major1_1 = request.getParameter("Major1_1");
        String major1_2 = request.getParameter("Major1_2");
        String year1 = request.getParameter("Year1");
        String degree2 = request.getParameter("Highest_Degree");
        String inst2 = request.getParameter("Institution2");
        String major2_1 = request.getParameter("Major2_1");
        String major2_2 = request.getParameter("Major2_2");
        String year2 = request.getParameter("Year2");
        String school = request.getParameter("School");
        String year3 = request.getParameter("Year3");
        String skill1 = request.getParameter("Skill1");
        String skill2 = request.getParameter("Skill2");
        
        //Set values in  class object
        
        
        //CallMethod to Update Database
        
        
    }

}
