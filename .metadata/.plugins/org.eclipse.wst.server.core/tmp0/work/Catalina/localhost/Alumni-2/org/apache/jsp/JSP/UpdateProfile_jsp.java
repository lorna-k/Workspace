/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-09-22 12:50:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.DBUtils;
import java.io.*;
import dao.*;
import java.sql.*;

public final class UpdateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <!DOCTYPE html>\r\n");
      out.write("    <html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Update Profile</title>\r\n");
      out.write("        <!-- css -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/nav_style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/site_styles.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/updateProfile.css\">\r\n");
      out.write("        <!-- The fonts-->\r\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- JQuery -->\r\n");
      out.write("        <script src=\"../jQuery/navigation-script.js\"></script>\r\n");
      out.write("        <!-- bootstrap -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"nav-container\" style=\"position:fixed; top:0; left:0; right:0; z-index:1\">\r\n");
      out.write("            <nav class=\"clearfix\">\r\n");
      out.write("                <a href=\"../index.html\" class=\"nav-title\"><img class=\"nav-logo\" src=\"../uct-logo.png\"></a>\r\n");
      out.write("                <span class=\"header-title\" style=\"color:white;\">UCT Alumni Network</span>\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a></li>\r\n");
      out.write("                    <li><a href=\"CV.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Profile</a></li>\r\n");
      out.write("                    <li><a href=\"Forum.jsp\"><span class=\"glyphicon glyphicon-comment\" aria-hidden=\"true\"></span> Forum</a></li>\r\n");
      out.write("                    <li><a href=\"\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Notifications</a></li>\r\n");
      out.write("                    <li><a href=\"People.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> People</a></li>            \r\n");
      out.write("                    <li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span> Logout</a></li> \r\n");
      out.write("                </ul>\r\n");
      out.write("                <a href=\"#\" id=\"pull\">Menu</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"site-wrapper\">\r\n");
      out.write("          <div class=\"site-center\">\r\n");
      out.write("            <div class=\"fixed-wrapper\">\r\n");
      out.write("              <div class=\"fixed-content\">\r\n");
      out.write("                  \r\n");
      out.write("                <form  action=\"../UpdateProfile\" method=\"post\" class=\"update-form\">\r\n");
      out.write("                    \r\n");
      out.write("                <div class=\"profile-photo\">\r\n");
      out.write("                    <img class=\"cv-photo\" src=\"../default-profile.png\">\r\n");
      out.write("                </div>\r\n");
      out.write("                    First Name<br>\r\n");
      out.write("                    <input name=\"fname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>\r\n");
      out.write("                    Last  Name<br>\r\n");
      out.write("                    <input name=\"lname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>\r\n");
      out.write("\r\n");
      out.write("                    Occupation<br>\r\n");
      out.write("                    <input name=\"occupation\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${occupation}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>\r\n");
      out.write("\r\n");
      out.write("                    <h5 style=\"text-decoration:underline;\">Work Details</h5>\r\n");
      out.write("                        Company or Institution<br>\r\n");
      out.write("                        <input name=\"currentCompany\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentCompany}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br> <!-- company/institution -->\r\n");
      out.write("                        Address Line 1<br>\r\n");
      out.write("                        <input name=\"address1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br> <!-- adressline1 -->\r\n");
      out.write("                        Address Line 2<br>\r\n");
      out.write("                        <input name=\"address2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>                      <!-- addressLine2 -->\r\n");
      out.write("                        City<br>\r\n");
      out.write("                        <input name=\"city\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${city}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>\r\n");
      out.write("                        Postal Code<br>\r\n");
      out.write("                        <input name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${postalCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>\r\n");
      out.write("                        Phone<br>\r\n");
      out.write("                        <input name=\"postalCode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"input-box\"><br>\r\n");
      out.write("                        Email<br>\r\n");
      out.write("                        <input type=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"email\" class=\"input-box\"><br>\r\n");
      out.write("\r\n");
      out.write("                        <button style=\"border: 2px solid #D84D0A; font-size:10px; border-radius:3px; margin-top:5px;\" type=\"submit\">Update Profile</button>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"content-offset\">\r\n");
      out.write("          <div class=\"content-frame\"> \r\n");
      out.write("            <div id=\"header\" class=\"row\">\r\n");
      out.write("              <div class=\"header-padding\">\r\n");
      out.write("                <div class=\"header-content\"> <h1>Curriculum Vitae</h1></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\" class=\"row expand\">\r\n");
      out.write("          <div class=\"inner-padding\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"section1\" class=\"container-fluid\">\r\n");
      out.write("              <h3 class=\"cv-section\">Education</h3>\r\n");
      out.write("              <p><strong>University of Cape Town</strong> \r\n");
      out.write("                <span class=\"year\">(2016)</span><br> <!-- institution , year -->\r\n");
      out.write("                    BSc Computer Science, Business Computing <!-- degree major 1 major 2 -->\r\n");
      out.write("              <p><strong>Ugie High School</strong> <span class=\"year\">(2011)</span> </p>       <!-- high School year -->\r\n");
      out.write("                                                    \r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"section2\" class=\"container-fluid\">\r\n");
      out.write("            <h3 class=\"cv-section\">Experience</h3>                     \r\n");
      out.write("            <p><strong>Software Intern</strong> <span class=\"year\">(2013)</span><br>  <!-- job1 -->\r\n");
      out.write("                Liquid Thought Solutions</p>                <!-- company1 -->\r\n");
      out.write("            <p><strong>User Experience Testing</strong> <span class=\"year\">(2014)</span> <br> <!-- job2 -->\r\n");
      out.write("                Digiata Cape Town</p>                               <!-- company2 -->\r\n");
      out.write("                                                                <!-- job3 -->\r\n");
      out.write("                                                                <!-- company3 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"section3\" class=\"container-fluid\">\r\n");
      out.write("         <h3 class=\"cv-section\">Skills</h3>\r\n");
      out.write("         <span class=\"skills-btn\">Java</span>           <!-- skill1 -->\r\n");
      out.write("         <span class=\"skills-btn\">html</span>           <!-- skill2 -->\r\n");
      out.write("         <span class=\"skills-btn\">CSS</span>            <!-- skill3 -->\r\n");
      out.write("         <span class=\"skills-btn\">Python</span>         <!-- skill4 -->\r\n");
      out.write("         <span class=\"skills-btn\">Angular JS</span>     <!-- skill5 -->\r\n");
      out.write("     </div> \r\n");
      out.write("     <div id=\"section4\" class=\"container-fluid\">\r\n");
      out.write("        <h3 class=\"cv-section\">References</h3>\r\n");
      out.write("        <p>Sonia Berman\r\n");
      out.write("        <address>\r\n");
      out.write("            <a name=\"email\" href=\"mailto:#\">sonia@cs.uct.ac.za</a>\r\n");
      out.write("        </address><br>\r\n");
      out.write("        <p>Max Price\r\n");
      out.write("        <address>\r\n");
      out.write("            <a name=\"email\" href=\"mailto:#\">maxprice@cs.uct.ac.za</a>\r\n");
      out.write("        </address>\r\n");
      out.write("     </div> \r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
