/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CV;
import model.Profile;

/**
 *
 * @author Lorna Nqodi
 */
public class UpdateCV extends HttpServlet {


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
        String highestDegree = request.getParameter("highestDegree");
        String major1 = request.getParameter("major1");
        String inst1 = request.getParameter("inst1");
        String major2 = request.getParameter("major2");
        String gradYear = request.getParameter("gradYear");
        String school = request.getParameter("school");
        String schoolYear = request.getParameter("schoolYear");
        String job1 = request.getParameter("Job1");
        String job1Company = request.getParameter("job1Company");
        String job1Year = request.getParameter("job1Year");
        String job2 = request.getParameter("job2");
        String job2Company = request.getParameter("job2Company");
        String job2Year = request.getParameter("job2Year");
        String skill1 = request.getParameter("skill1");
        String skill2 = request.getParameter("skill2");
        String skill3 = request.getParameter("skill3");
        String skill4 = request.getParameter("skill4");
        String skill5 = request.getParameter("skill5");
        String refName1 = request.getParameter("refName1");
        String refEmail1 = request.getParameter("refEmail1");
        String refName2 = request.getParameter("refName2");
        String refEmail2 = request.getParameter("refEmail2");
        
        CV cv = new CV();
        cv.setId(id);
        cv.setHighestDegree(highestDegree);
        cv.setMajor1(major1);
        cv.setMajor2(major2);
        cv.setInst1(inst1);
        cv.setGradYear(gradYear);
        cv.setSchool(school);
        cv.setSchoolYear(schoolYear);
        cv.setJob1(job1);
        cv.setJob1Company(job1Company);
        cv.setJob1Year(job1Year);
        cv.setJob2(job2);
        cv.setJob2Company(job2Company);
        cv.setJob2Year(job2Year);
        cv.setSkill1(skill1);
        cv.setSkill2(skill2);
        cv.setSkill3(skill3);
        cv.setSkill4(skill4);
        cv.setSkill5(skill5);
        cv.setRefName1(refName1);
        cv.setRefEmail1(refEmail1);
        cv.setRefName2(refName2);
        cv.setRefEmail2(refEmail2);  
        
        String sql = "INSERT into CVs values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        DataAccess.updateCV(cv,sql);
        response.sendRedirect("./JSP/CV.jsp");
        
        
        
    }


}
