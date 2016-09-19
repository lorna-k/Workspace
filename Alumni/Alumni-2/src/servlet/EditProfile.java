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
public class EditProfile extends HttpServlet {

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
        String highest_degree = request.getParameter("Highest_Degree");
        String inst1 = request.getParameter("Institution1");
        String major1_1 = request.getParameter("Major1_1");
        String major1_2 = request.getParameter("Major1_2");
        String highest_degree_year = request.getParameter("Highest_Degree_Year");
        String degree2 = request.getParameter("Degree2");
        String inst2 = request.getParameter("Institution2");
        String major2_1 = request.getParameter("Major2_1");
        String major2_2 = request.getParameter("Major2_2");
        String degree2Year = request.getParameter("Degree2_Year");
        String school = request.getParameter("School");
        String schoolYear = request.getParameter("School_Year");
        String job1 = request.getParameter("Job1");
        String job1Company = request.getParameter("Job1_Company");
        String job1Year = request.getParameter("Job1Year");
        String job2 = request.getParameter("Job2");
        String job2Company = request.getParameter("Job2_Company");
        String job2Year = request.getParameter("Job2Year");
        String skill1 = request.getParameter("Skill1");
        String skill2 = request.getParameter("Skill2");
        String skill3 = request.getParameter("Skill3");
        String skill4 = request.getParameter("Skill4");
        String skill5 = request.getParameter("Skill5");
        String refName1 = request.getParameter("Reference_Name1");
        String refEmail1 = request.getParameter("Reference_Name1");
        String refName2 = request.getParameter("Reference_Name2");
        String refEmail2 = request.getParameter("Reference_Name2");
        String currentCompany = request.getParameter("Company");
        
        //Set values in class object
        Profile p = new Profile();
        
        p.setId(id);
        p.setFname(fname);
        p.setLname(lname);
        p.setOccupation(occupation);
        p.setAddress1(address1);
        p.setAddress2(address2);
        p.setCity(city);
        p.setPostalCode(postalCode);
        p.setPhone(phone);
        p.setEmail(email);
        p.setHighest_degree(highest_degree);
        p.setInst1(inst1);
        p.setMajor1_1(major1_1);
        p.setMajor1_2(major1_2);
        p.setHighest_degree_year(highest_degree_year);
        p.setDegree2(degree2);
        p.setInst2(inst2);
        p.setMajor2_1(major2_1);
        p.setMajor2_2(major2_2);
        p.setDegree2Year(degree2Year);
        p.setSchool(school);
        p.setSchool_year(schoolYear);
        p.setJob1(job1);
        p.setJob1Company(job1Company);
        p.setJob1Year(job1Year);
        p.setJob2(job2);
        p.setJob2Company(job2Company);
        p.setJob2Year(job2Year);
        p.setSkill1(skill1);
        p.setSkill2(skill2);
        p.setSkill3(skill3);
        p.setSkill4(skill4);
        p.setSkill5(skill5);
        p.setRefName1(refName1);
        p.setRefEmail1(refEmail1);
        p.setRefName2(refName2);
        p.setRefEmail2(refEmail2);
        p.setCurrentCompany(currentCompany);
        
        String uid = request.getAttribute("CurrentUserID")+ "";
        
        //CallMethod to Update Database
        String sql = "UPDATE CVs set(id, fname, lname, occupation, address1, address2, city, postalCode, phone, email, highest_degree, inst1, major1_1,"
                + " major1_2, highest_degree_year, degree2,inst2, major2_1, major2_2, degree2Year, school, schoolYear, job1, job1Company, job1Year, job2, job2Company, "
                + "job2Year, skill1, skill2, skill3, skill4, skill5, refName1, refEmail1, refName2, refEmail2, currentCompany) = (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) where ID='"+uid+"'";
        
         System.out.println("1");
         
        int i = 0;
        try {
            i = DataAccess.updateUserProfile(p, sql);
            System.out.println("2");
        } catch (SQLException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
//        if(i!=0)
//        {
            request.setAttribute("msg", "User updated successfully");
            response.sendRedirect("./JSP/Forum.jsp");
//            getServletContext().getRequestDispatcher("./JSP/Forum.jsp").forward(request, response);
            System.out.println("3");
//        }
//        else
//        {
//            request.setAttribute("msg", "User not updated");
//            getServletContext().getRequestDispatcher("./JSP/Forum.jsp").forward(request, response);
//            System.out.println("4");
//        }
          
    }
}
