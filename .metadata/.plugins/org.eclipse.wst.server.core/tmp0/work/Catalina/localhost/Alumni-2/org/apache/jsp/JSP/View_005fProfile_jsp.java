/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-09-27 23:06:37 UTC
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

public final class View_005fProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("      <title>Profile</title>\r\n");
      out.write("      <!-- css -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"../css/normalize.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"../css/nav_style.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"../css/site_styles.css\">\r\n");
      out.write("      <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cv.css\">\r\n");
      out.write("      <!-- The fonts-->\r\n");
      out.write("      <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("      <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100\" rel=\"stylesheet\">\r\n");
      out.write("      <!-- JQuery -->\r\n");
      out.write("      <script src=\"../jQuery/navigation-script.js\"></script>\r\n");
      out.write("      <!-- bootstrap -->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("      <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("      <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("      <div class=\"nav-container\" style=\"position:fixed; top:0; left:0; right:0; z-index:1\">\r\n");
      out.write("        <nav class=\"clearfix\">\r\n");
      out.write("          <a href=\"../index.html\" class=\"nav-title\"><img class=\"nav-logo\" src=\"../uct-logo.png\"></a>\r\n");
      out.write("          <span class=\"header-title\" style=\"color:white;\">UCT Alumni Network</span>\r\n");
      out.write("          <ul class=\"clearfix\">\r\n");
      out.write("            <li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a></li>\r\n");
      out.write("            <li><a href=\"CV.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Profile</a></li>\r\n");
      out.write("            <li><a href=\"Forum.jsp\"><span class=\"glyphicon glyphicon-comment\" aria-hidden=\"true\"></span> Forum</a></li>\r\n");
      out.write("            <li><a href=\"\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Notifications</a></li>\r\n");
      out.write("            <li><a href=\"People.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> People</a></li>            \r\n");
      out.write("            <li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span> Logout</a></li> \r\n");
      out.write("          </ul>\r\n");
      out.write("          <a href=\"#\" id=\"pull\">Menu</a>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"site-wrapper\">\r\n");
      out.write("        <div class=\"site-center\">\r\n");
      out.write("          ");
 
          Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

          Statement statement = connection.createStatement() ;
          
          String u_name = request.getSession().getAttribute("view_name")+"";
          
          ResultSet resultset = statement.executeQuery("SELECT * from CVs WHERE First_Name = '"+u_name+"'") ; 
          resultset.next();
          
      out.write("\r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("<div class=\"fixed-wrapper\">\r\n");
      out.write("  <div class=\"fixed-content\" style=\"border-left: 1px solid gray;\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"profile-photo\">\r\n");
      out.write("      <img class=\"cv-photo\" src=\"../default-profile.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <label class=\"name-label\">");
      out.print(resultset.getString(2));
      out.write(' ');
      out.write(' ');
      out.print(resultset.getString(3));
      out.write(" </label>\r\n");
      out.write("    <address>\r\n");
      out.write("      <a name=\"email\" href=\"mailto:");
      out.print(resultset.getString(11));
      out.write('"');
      out.write('>');
      out.print(resultset.getString(11));
      out.write(" </a>\r\n");
      out.write("    </address>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"personal-details\">\r\n");
      out.write("      <label >");
      out.print(resultset.getString(4));
      out.write("</label><br>           <!--occupation-->\r\n");
      out.write("    </div>\r\n");
      out.write("     \r\n");
      out.write("    <div>\r\n");
      out.write("      <address>\r\n");
      out.write("        <strong>");
      out.print(resultset.getString(5));
      out.write("</strong><br> <!-- company/institution -->\r\n");
      out.write("        ");
      out.print(resultset.getString(6));
      out.write(" <br> <!-- adressline1 -->\r\n");
      out.write("        ");
      out.print(resultset.getString(7));
      out.write(" <br> <!-- addressLine2 -->\r\n");
      out.write("        ");
      out.print(resultset.getString(8));
      out.write(" <br>\r\n");
      out.write("        ");
      out.print(resultset.getString(9));
      out.write(" <br>\r\n");
      out.write("        <abbr title=\"Phone\"></abbr> ");
      out.print(resultset.getString(10));
      out.write(" \r\n");
      out.write("      </address>\r\n");
      out.write("    </div>\r\n");
      out.write("                 \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"content-offset\">\r\n");
      out.write("  <div class=\"content-frame\"> \r\n");
      out.write("    <div id=\"header\" class=\"row\">\r\n");
      out.write("      <div class=\"header-padding\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"header-content\"> <h1>Curriculum Vitae</h1>   \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"content\" class=\"row expand\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"inner-padding\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <div id=\"section1\" class=\"container-fluid\">\r\n");
      out.write("          <h3 class=\"cv-section\">Education</h3>\r\n");
      out.write("          <!-- degree major 1 major 2 -->\r\n");
      out.write("          <p><strong>");
      out.print(resultset.getString(12) );
      out.write(' ');
      out.print(resultset.getString(14));
      out.write(' ');
      out.print(resultset.getString(15));
      out.write("</strong> <br>\r\n");
      out.write("            ");
      out.print(resultset.getString(13));
      out.write("<br>\r\n");
      out.write("            <span class=\"year\">");
      out.print(resultset.getString(16));
      out.write(" </span><br> <!--  year --> \r\n");
      out.write("            <p><strong>");
      out.print(resultset.getString(17));
      out.write("</strong> <br> <span class=\"year\">");
      out.print(resultset.getString(18));
      out.write("</span> </p>       <!-- high School year -->\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"section2\" class=\"container-fluid\">\r\n");
      out.write("            <h3 class=\"cv-section\">Experience</h3>                     \r\n");
      out.write("            <p><strong>");
      out.print(resultset.getString(19));
      out.write("</strong> <br>  <!-- job1 -->\r\n");
      out.write("              ");
      out.print(resultset.getString(20));
      out.write("  <br> <!-- company1 -->\r\n");
      out.write("              <span class=\"year\">");
      out.print(resultset.getString(21));
      out.write("</span>\r\n");
      out.write("            </p>               \r\n");
      out.write("            \r\n");
      out.write("            <p><strong>");
      out.print(resultset.getString(22));
      out.write("</strong> <br> <!-- job2 -->\r\n");
      out.write("              ");
      out.print(resultset.getString(23));
      out.write("  <br> <!-- company2 -->\r\n");
      out.write("              <span class=\"year\">");
      out.print(resultset.getString(24));
      out.write("</span> \r\n");
      out.write("            </p>                               \r\n");
      out.write("            \r\n");
      out.write("          </div>\r\n");
      out.write("          <div id=\"section3\" class=\"container-fluid\">\r\n");
      out.write("            <h3 class=\"cv-section\">Skills</h3>\r\n");
      out.write("            <span class=\"skills-btn\">");
      out.print(resultset.getString(25));
      out.write("</span>      <!-- skill1 -->\r\n");
      out.write("            <span class=\"skills-btn\">");
      out.print(resultset.getString(26));
      out.write("</span>       <!-- skill2 -->\r\n");
      out.write("            <span class=\"skills-btn\">");
      out.print(resultset.getString(27));
      out.write("</span>      <!-- skill3 -->\r\n");
      out.write("            <span class=\"skills-btn\">");
      out.print(resultset.getString(28));
      out.write("</span>     <!-- skill4 -->\r\n");
      out.write("            <span class=\"skills-btn\">");
      out.print(resultset.getString(29));
      out.write("</span>     <!-- skill5 -->\r\n");
      out.write("          </div> \r\n");
      out.write("          <div id=\"section4\" class=\"container-fluid\">\r\n");
      out.write("            <h3 class=\"cv-section\">References</h3>\r\n");
      out.write("            <p>");
      out.print(resultset.getString(30));
      out.write("\r\n");
      out.write("              <address>\r\n");
      out.write("                <a name=\"email\" href=\"mailto:#\">");
      out.print(resultset.getString(31));
      out.write("</a>\r\n");
      out.write("              </address>\r\n");
      out.write("              <p>");
      out.print(resultset.getString(32));
      out.write("\r\n");
      out.write("                <address>\r\n");
      out.write("                  <a name=\"email\" href=\"mailto:#\">");
      out.print(resultset.getString(33));
      out.write("</a>\r\n");
      out.write("                </address>\r\n");
      out.write("              </div> \r\n");
      out.write("              \r\n");
      out.write("            </div>                \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
