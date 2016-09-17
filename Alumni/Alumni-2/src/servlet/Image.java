/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.DBUtils;


/**
 *
 * @author Lorna Nqodi
 */
public class Image extends HttpServlet {
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
//        String username = request.getParameter("id")
//        ResultSet rs=DBUtils.getPreparedSatement("select photo from Images WHERE ID ='"+data+"'").executeQuery();
            
        PreparedStatement stmt = null;
        ResultSet rs = null;
        OutputStream img;
        try{
            //stmt = DBUtils.getPreparedSatement"select photo from Images where id = ");PreparedStatement stmt = conn.prepareStatement("select photo from users where id=?");
            rs = stmt.executeQuery();
            if(rs.next()){
               byte barray = rs.getByte(2);
               response.setContentType("image/jpg");
//               response.getOutputStream().write(rs.getBytes("photo"));
               img = response.getOutputStream();
               img.write(barray);
               img.flush();
               img.close();
            }
            
        }
        catch (Exception e ) 
    	{
            e.printStackTrace();
	}
    }

}
