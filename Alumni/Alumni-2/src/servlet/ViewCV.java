/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import db.DBUtils;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lorna Nqodi
 */
public class ViewCV extends HttpServlet {


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
        try {
            String uid = request.getSession().getAttribute("currentUserID")+"";
            String sql = "SELECT * from CVs WHERE ID = '"+uid+"'";

            ResultSet rs = DBUtils.getPreparedSatement(sql).executeQuery();
            if(rs.next()){
                request.getSession().setAttribute("fname", rs.getString(2));
                request.getSession().setAttribute("lname", rs.getString(3));
                request.getSession().setAttribute("occupation", rs.getString(4));
                request.getSession().setAttribute("currentCompany", rs.getString(5));
                request.getSession().setAttribute("address1", rs.getString(6));
                request.getSession().setAttribute("address2", rs.getString(7));
                request.getSession().setAttribute("city", rs.getString(8));
                request.getSession().setAttribute("postalCode", rs.getString(9));
                request.getSession().setAttribute("phone", rs.getString(10));
                request.getSession().setAttribute("email", rs.getString(11));

                request.getSession().setAttribute("highestDegree", rs.getString(12));
                request.getSession().setAttribute("inst1", rs.getString(13));
                request.getSession().setAttribute("major1", rs.getString(14));
                request.getSession().setAttribute("major2", rs.getString(15));
                request.getSession().setAttribute("gradYear", rs.getString(16));
                request.getSession().setAttribute("school", rs.getString(17));
                request.getSession().setAttribute("schoolYear", rs.getString(18));
                request.getSession().setAttribute("job1", rs.getString(19));
                request.getSession().setAttribute("job1Company", rs.getString(20));
                request.getSession().setAttribute("job1Year", rs.getString(21));
                request.getSession().setAttribute("job2", rs.getString(22));
                request.getSession().setAttribute("job2Company", rs.getString(23));
                request.getSession().setAttribute("job2Year", rs.getString(24)); 
                request.getSession().setAttribute("skill1", rs.getString(25));
                request.getSession().setAttribute("skill2", rs.getString(26));
                request.getSession().setAttribute("skill3", rs.getString(27));
                request.getSession().setAttribute("skill4", rs.getString(28));
                request.getSession().setAttribute("skill5", rs.getString(29));
                request.getSession().setAttribute("refName1", rs.getString(30));
                request.getSession().setAttribute("refEmail1", rs.getString(31));
                request.getSession().setAttribute("refName2", rs.getString(32));
                request.getSession().setAttribute("refEmail2", rs.getString(33));
            }   }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
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
        
    }

}
