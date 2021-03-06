/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.ImageAccess;
import static dao.ImageAccess.displayPhoto;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Lorna Nqodi
 */
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB
public class ImageUpload extends HttpServlet {


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    		String userId = request.getSession().getAttribute("currentUserID")+"";
    		InputStream inputStream = null; // input stream of the upload file
            String message = null; 
            // obtains the upload file part in this multipart request
            Part filePart = request.getPart("photo");
            if (filePart != null) 
            {
                // prints out some information for debugging
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());

                // obtains input stream of the upload file
                inputStream = filePart.getInputStream();
            }
            else
            {
                System.out.println("Could not find file");
            }
                
            try 
            {
                ImageAccess.uploadPhoto(userId, inputStream);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            finally
            {
                response.sendRedirect("./JSP/UpdateProfile.jsp");
            }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getSession().getAttribute("view_id")+"";
        
        byte[] imgData = displayPhoto(id);
        response.setContentType("image/jpg");
 
          OutputStream o = response.getOutputStream();
 
          o.write(imgData);
           
          o.flush();
          o.close();
         
          System.out.println(o.toString());
          System.out.println(imgData.toString());
          
          if(imgData.length==0)
          {
        	  request.getSession().setAttribute("image_status","1");
        	  System.out.println("no image");
        	  
          }
          if(imgData.length!=0)
          {
        	  request.getSession().setAttribute("image_status","0");
        	  System.out.println("found image");
          }
          
        
    
    }

}
