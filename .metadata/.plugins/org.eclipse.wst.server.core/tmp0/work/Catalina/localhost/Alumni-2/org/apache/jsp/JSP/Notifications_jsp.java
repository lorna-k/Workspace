/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-10-24 12:11:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import dao.DataAccess;
import servlet.Post;
import java.io.*;

public final class Notifications_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write('\r');
      out.write('\n');

        if (request.getSession().getAttribute("currentUserName") == null){
        response.sendRedirect("Login.jsp");
    }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Notifications</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<!-- css -->\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"../css/site_styles.css\" />\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"../css/animate.css\" />\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"../css/nav_style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/normalize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/forum.css\">\r\n");
      out.write("\t<!-- bootstrap -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- Fonts -->\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- JQuery -->\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
      out.write("        <!--nav--> \r\n");
      out.write("        <script>\r\n");
      out.write("        $(function() {\r\n");
      out.write("            var pull        = $('#pull');\r\n");
      out.write("            menu        = $('nav ul');\r\n");
      out.write("            menuHeight  = menu.height();\r\n");
      out.write("\r\n");
      out.write("            $(pull).on('click', function(e) {\r\n");
      out.write("                e.preventDefault();\r\n");
      out.write("                menu.slideToggle();\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            $(window).resize(function(){\r\n");
      out.write("                var w = $(window).width();\r\n");
      out.write("                if(w > 320 && menu.is(':hidden')) {\r\n");
      out.write("                    menu.removeAttr('style');\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
      out.write("     \r\n");
      out.write("        <!--Face book-->\r\n");
      out.write("        <script>\r\n");
      out.write("            (function(d, s, id) {\r\n");
      out.write("\t\t  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("\t\t  if (d.getElementById(id)) return;\r\n");
      out.write("\t\t  js = d.createElement(s); js.id = id;\r\n");
      out.write("\t\t  js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.7&appId=313231902363487\";\r\n");
      out.write("\t\t  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function resettoggle() {\r\n");
      out.write("var e = document.getElementById('list-comments');\r\n");
      out.write("e.style.display = 'none';\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function toggle_visibility() {\r\n");
      out.write("\t\r\n");
      out.write("var e = document.getElementById('list-comments');\r\n");
      out.write("if(e.style.display == 'block'){\r\n");
      out.write("\te.style.display = 'none';\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("else\r\n");
      out.write("e.style.display = 'block';\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("        \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\r\n");
      out.write("        <div class=\"nav-container\" style=\"position:fixed; top:0; left:0; right:0; z-index:1\">\r\n");
      out.write("            <nav class=\"clearfix\">\r\n");
      out.write("                <a href=\"../index.html\" class=\"nav-title\"><img class=\"nav-logo\" src=\"../uct-logo.png\"></a>\r\n");
      out.write("                <span class=\"header-title\" style=\"color:white;\">UCT Alumni Network</span>\r\n");
      out.write("                <ul class=\"clearfix\">\r\n");
      out.write("                    <li><!-- <a href=\"Forum.jsp\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a> --></li>\r\n");
      out.write("                                <li><a href=\"Forum.jsp\" onclick=\"resettoggle('comments_')\"><span class=\"glyphicon glyphicon-comment\" aria-hidden=\"true\"></span> Forum</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"CV.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Profile</a></li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li><a href=\"Notifications.jsp\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Notifications</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"People.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> People</a></li>\t\r\n");
      out.write("\t\t\t\t<li><a href=\"https://drive.google.com/open?id=0B5hfZMerj_ABSks3RXI4RTJvOTg\"><span class=\"glyphicon glyphicon-question-sign\" aria-hidden=\"true\"></span> Help</a></li>\r\n");
      out.write("\t\t\t\t<form id=\"logout_form\" method=\"post\" action=\"../logout\">\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:{}\" onclick=\"document.getElementById('logout_form').submit(); return false;\"><span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span> Logout</a></li> \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                </ul>\r\n");
      out.write("                <a href=\"#\" id=\"pull\">Menu</a>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"page\">\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("            <h1>Notifications</h1>\r\n");
      out.write("                <div class=\"content-wrapper\">\r\n");
      out.write("                \r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("                            <div class=\"feeds\">\r\n");
      out.write("                                <!-- Opening connection to data in database -->\r\n");
      out.write("                            ");

                                Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
                                
                                Statement statement = connection.createStatement() ;
                                ResultSet resultset =  statement.executeQuery("select * from Notifications ORDER BY today desc") ;
                                
                                  
                                while(resultset.next())
                                {
                                
      out.write("\r\n");
      out.write("                                <div class=\"posts\">\r\n");
      out.write("                                    <div class=\"editor\" style=\"border: 1px solid #ccc;border-radius: 4px;background-color: #455868;color: whitesmoke;\">\r\n");
      out.write("                                        <div class=\"editor-header\">\r\n");
      out.write("                                        <!-- Display name of user who posted-->\r\n");
      out.write("                                        \r\n");
      out.write("                                        <form id=\"ViewProfile_form\" method=\"post\" action=\"../View_Profile\">\r\n");
      out.write("                                        \t<label style=\"background:none!important;border:none;color: whitesmoke;margin-left:5px\"> ");
      out.print(resultset.getString(1));
      out.write("</label> \r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <!-- <span>Posted ");
      out.print(resultset.getString(1));
      out.write("</span> -->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"post-body message_frame\">\r\n");
      out.write("                                            <p>");
      out.print(resultset.getString(3));
      out.write("</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                         <div class=\"post-body date_today\">\r\n");
      out.write("                                            <p>");
      out.print(resultset.getString(2));
      out.write("</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- Closing connection to database -->\r\n");
      out.write("                                   ");

                                    }
                                    
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                       <!--  </form>  -->                       \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- script for twitter feed -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write(" </body>\r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");
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
