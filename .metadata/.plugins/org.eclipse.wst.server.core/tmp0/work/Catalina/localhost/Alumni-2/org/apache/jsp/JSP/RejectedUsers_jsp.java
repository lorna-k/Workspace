/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-09-25 14:39:46 UTC
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

public final class RejectedUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<title>Administrator</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<!-- css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/normalize.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/nav_style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/site_styles.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/admin_styles.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/feed_style.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- font -->\r\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- JQuery -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tvar pull \t\t= $('#pull');\r\n");
      out.write("\t\tmenu \t\t= $('nav ul');\r\n");
      out.write("\t\tmenuHeight\t= menu.height();\r\n");
      out.write("\r\n");
      out.write("\t\t$(pull).on('click', function(e) {\r\n");
      out.write("\t\t\te.preventDefault();\r\n");
      out.write("\t\t\tmenu.slideToggle();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(window).resize(function(){\r\n");
      out.write("\t\t\tvar w = $(window).width();\r\n");
      out.write("\t\t\tif(w > 320 && menu.is(':hidden')) {\r\n");
      out.write("\t\t\t\tmenu.removeAttr('style');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t });\r\n");
      out.write("\t </script>\r\n");
      out.write("\t<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write(" <body>\r\n");
      out.write("\t   <div class=\"nav-container\" style=\"position:fixed; top:0; left:0; right:0; z-index:1\">\r\n");
      out.write("\t\t\t<nav class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<a style=\"padding-top:10px\" href=\"../index.html\" class=\"nav-title\"><img class=\"nav-logo\" src=\"../uct-logo.png\"></a>\r\n");
      out.write("\t\t\t\t<span class=\"header-title\" style=\"color:white;\">UCT Alumni Network</span>\r\n");
      out.write("\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Forum.jsp\"><span class=\"glyphicon glyphicon-comment\" aria-hidden=\"true\"></span> Forum</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Notifications</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"People.jsp\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> People</a></li>\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span> Logout</a></li>\t\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"pull\">Menu</a>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("         <div class=\"left-navbar\">\r\n");
      out.write("\t\t<a href=\"../index.html\">Home</a>\r\n");
      out.write("                <a href=\"PendingUsers.jsp\">Pending Users</a>\r\n");
      out.write("                <a href=\"SystemUsers.jsp\">System Users</a>\r\n");
      out.write("\t\t<a href=\"RejectedUsers.jsp\">Rejected Users</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"right-content\">\r\n");
      out.write("        <H1 align=\"center\" style=\"margin-top:20vh;font-family:Aria\">Rejected Users</H1>\r\n");
      out.write("\r\n");
      out.write("        ");
 
            Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
            statement.executeQuery("select * from Rejected_Users") ; 
        
      out.write("\r\n");
      out.write("        <div align=\"center\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ProcessRequest\" method=\"post\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t        <TABLE class=\" table table-bordered\" style=\"width:77%\">\r\n");
      out.write("\t\t            <TR>\r\n");
      out.write("\t\t                <TH>ID</TH>\r\n");
      out.write("\t\t                <TH>Name</TH>\r\n");
      out.write("\t\t                <TH>Surname</TH>\r\n");
      out.write("\t\t                <TH>Email</TH>\r\n");
      out.write("\t\t                <TH>Password (hidden)</TH>\r\n");
      out.write("\t\t                <TH>Account Type</TH>\r\n");
      out.write("\t\t            <!--<TH>Accept</TH>\r\n");
      out.write("\t\t                <TH>Reject</TH>-->\r\n");
      out.write("\t\t            </TR>\r\n");
      out.write("\t\t            ");
 while(resultset.next())
		            { 
		            	String id=resultset.getString(1);
		            	DataAccess da=new DataAccess();
		            
      out.write("\r\n");
      out.write("\t\t            <TR>\r\n");
      out.write("\t\t                <TD> ");
      out.print( resultset.getString(1) );
      out.write("</TD>\r\n");
      out.write("\t\t                <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\r\n");
      out.write("\t\t                <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\r\n");
      out.write("\t\t                <TD> ");
      out.print( resultset.getString(4) );
      out.write("</TD>\r\n");
      out.write("\t\t                <TD align=\"center\"> ****************</TD>\r\n");
      out.write("\t\t                <TD> ");
      out.print( resultset.getString(6) );
      out.write("</TD>\r\n");
      out.write("\t\t            <!--<TD><input type=\"submit\" name=\"accept\" value=\"");
      out.print(id);
      out.write("\" style=\"width:100%\" /></TD>\r\n");
      out.write("\t\t                <TD><input type=\"submit\" name=\"reject\" value=\"");
      out.print(id);
      out.write("\" style=\"width:100%\" /></TD>-->\r\n");
      out.write("\t\t            </TR>\r\n");
      out.write("\t\t            ");
 } 
      out.write("\r\n");
      out.write("\t\t        </TABLE>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t        </form>\r\n");
      out.write("\t        \r\n");
      out.write("\t        \r\n");
      out.write("<!--\t        <ul style=\"list-style: none;\">\r\n");
      out.write("\t        \t<li><strong style=\"font-size:20px\">View Tables</strong></li>\r\n");
      out.write("\t        \t<li><a href=\"SystemUsers.jsp\">System Users</a></li>\r\n");
      out.write("\t        \t<li><a href=\"PendingUsers.jsp\">Pending Users</a></li>\r\n");
      out.write("\t        </ul>\r\n");
      out.write("\t        -->\r\n");
      out.write("\t        \r\n");
      out.write("\t      \r\n");
      out.write("\t        \r\n");
      out.write("        </div>\r\n");
      out.write("         \r\n");
      out.write("        </div>  \r\n");
      out.write("             \r\n");
      out.write("    </BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
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
