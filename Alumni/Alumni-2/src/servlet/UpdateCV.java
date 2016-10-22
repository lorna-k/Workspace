/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DataAccess;
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
        
        String uid = request.getSession().getAttribute("currentUserID")+"";
        String sqlQuery = "SELECT * from CVs WHERE ID = '"+uid+"'";
        try {
            ResultSet rs = DBUtils.getPreparedSatement(sqlQuery).executeQuery();
            if(rs.next()){
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
            }
                      
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
    	String id = request.getSession().getAttribute("currentUserID")+"";
        String highestDegree = request.getParameter("highestDegree");
        String major1 = request.getParameter("major1");
        String inst1 = request.getParameter("inst1");
        String major2 = request.getParameter("major2");
        String gradYear = request.getParameter("gradYear");
        String school = request.getParameter("school");
        String schoolYear = request.getParameter("schoolYear");
        String job1 = request.getParameter("job1");
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
