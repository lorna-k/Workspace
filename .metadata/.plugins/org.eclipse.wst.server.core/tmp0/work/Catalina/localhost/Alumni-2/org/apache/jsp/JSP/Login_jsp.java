/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-09-15 15:33:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t<title>Login</title>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<!-- css -->\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"../css/site_styles.css\" />\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"../css/animate.css\" />\r\n");
      out.write("\t<link  rel=\"stylesheet\" href=\"../css/nav_style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/normalize.css\">\r\n");
      out.write("\t<!-- bootstrap -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css\" integrity=\"sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<!-- Fonts -->\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- JQuery -->\r\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\r\n");
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
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div nav-container>\r\n");
      out.write("\t\t<nav style=\"padding-top:10px\">\r\n");
      out.write("\t\t\t<a href=\"../index.html\" class=\"nav-title\"><img class=\"nav-logo\" src=\"../uct-logo.png\"></a>\r\n");
      out.write("\t\t\t<span class=\"header-title\" style=\"color:white;\">UCT Alumni Network</span>\r\n");
      out.write("\t\t\t<a href=\"../index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\" style=\"color:white;\"></span></a>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"wrapper \" style=\"position:relative; top: 10px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"col-md-8\" style=\"margin-left:200px; margin-top:15vh\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");

				
				String error_message= request.getSession().getAttribute("error_message")+"";
			    if(!(error_message.equals("null")))
			    {
			    
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"alert alert-danger\">\r\n");
      out.write("\t\t\t\t  <strong>Danger!</strong> ");
      out.print( error_message );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t    ");

			     }
			    
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h1>Login</h1>\r\n");
      out.write("\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t<form action=\"../Login\" method=\"post\" class=\"form-group\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"email\">Email address:</label>\r\n");
      out.write("\t\t\t\t\t\t<input  placeholder=\"Student/Staff Number\" type=\"text\" class=\"form-control\" name=\"id\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label >Password:</label>\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"Enter Password\" class=\"form-control\" name=\"password\" type=\"password\" style=\"margin-left:0px\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t<label><input type=\"checkbox\"> Remember me</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- <a href=\"#/channels\"> --><button type=\"submit\" class=\"btn btn-primary form-group\">Sign in</button><!-- </a> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<p class=\"message\">Not registered? <a href=\"addUser.html\">Create an account</a></p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
