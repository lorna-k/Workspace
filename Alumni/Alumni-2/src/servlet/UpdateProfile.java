/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Profile;

/**
 *
 * @author Lorna Nqodi
 */
public class UpdateProfile extends HttpServlet {

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

        String id = request.getSession().getAttribute("currentUserID")+"";
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String occupation = request.getParameter("occupation");
        String currentCompany = request.getParameter("currentCompany");
        String address1 = request.getParameter("address1");
        String address2 = request.getParameter("address2");
        String city = request.getParameter("city");
        String postalCode = request.getParameter("postalCode");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        
        Profile p = new Profile();
        p.setId(id);
        p.setFname(fname);
        p.setLname(lname);
        p.setOccupation(occupation);
        p.setCurrentCompany(currentCompany);
        p.setAddress1(address1);
        p.setAddress2(address2);
        p.setCity(city);
        p.setPostalCode(postalCode);
        p.setPhone(phone);
        p.setEmail(email);
        
        String sql = "INSERT into CVs values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
       
        //String sql = "INSERT into Profiles (id,fname,lname,occupation,currentCompny,address1,address2,city,postalCode,phone,email)  values(?,?,?,?,?,?,?,?,?,?,?) ON DUPLICATE KEY UPDATE  ID=values(id), fname=values(fname), lname=values(lname), occupation=values(occupation), currentCompany=values(currentCompany), address1=values(address1), address2=values(address2), city=values(city), postalCode=values(postalCode), phone=values(phone), email=values(email)";
        try {
            DataAccess.updateProfile(p, sql);
            System.out.println("u-profile");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        response.sendRedirect("./JSP/CV.jsp");
       
    }

}
