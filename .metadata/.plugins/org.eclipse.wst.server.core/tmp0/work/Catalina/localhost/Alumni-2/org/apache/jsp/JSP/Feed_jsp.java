/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-09-14 08:50:00 UTC
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

public final class Feed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 Class.forName("com.mysql.jdbc.Driver"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<!--|||||||||||||||||| I am sure that we do not have to copy and poster the style tages in every page  ||||||||||||||||||-->\r\n");
      out.write("\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("\t<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/normalize.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/nav_style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/site_styles.css\">\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("   <title>Feeds</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <div nav-container style=\"position:fixed; top:0; left:0; right:0; z-index:1\">\r\n");
      out.write("\t\t<nav class=\"clearfix\">\r\n");
      out.write("\t\t\t<a href=\"../index.html\" class=\"nav-title\"><img class=\"nav-logo\" src=\"../uct-logo.png\"></a>\r\n");
      out.write("\t\t\t<span class=\"header-title\" style=\"color:white;\">UCT Alumni Network</span>\r\n");
      out.write("\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t<li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span> Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"../profile.html\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> Profile</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"Feed.jsp\"><span class=\"glyphicon glyphicon-comment\" aria-hidden=\"true\"></span> Forum</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\"><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span> Notifications</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"\"><span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span> People</a></li>\t\t\t\r\n");
      out.write("\t\t\t\t<li><a href=\"../index.html\"><span class=\"glyphicon glyphicon-off\" aria-hidden=\"true\"></span> Logout</a></li>\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<a href=\"#\" id=\"pull\">Menu</a>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t \r\n");
      out.write("\t<div class=\"content\" style=\"position:relative; top:75px\">\r\n");
      out.write("\t\t<div class=\"container \">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"posts-section col-md-7 col-md-offset-1 col-xs-6 col-xs-offset-1\"> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| -->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t <h2> welcome ");
      out.print( request.getSession().getAttribute("currentUserName") );
      out.write(" .!</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>View Tables:<a href=\"PendingUsers.jsp\">View Tabels</a></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- |||||||||||||||||||||||||||||||||||||||||||||||||| This is the post uplad section ||||||||||||||||||||||||||||||||||||||||||||||||||-->\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<form method=\"post\" action=\"../Post\" >\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" id=\"txt_area\" name=\"caption\" placeholder=\"type your post caption here\" rows=\"3\"   ></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div  id=\"upload_buttons\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\" name=\"post\" value=\"posting\" style=\"width:200px;\">Post!</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<!-- <label class=\"btn btn-primary btn-file\" style=\"width:200px;\" id=\"file_button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tUpload <input type=\"file\" name=\"photo\" id=\"uploadID\" onchange=\"changed()\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t         -->\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");

								    
								Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
								
						        Statement statement = connection.createStatement() ;
								ResultSet resultset =  statement.executeQuery("select * from Posts ORDER BY PostId desc") ;
								
								  
								while(resultset.next())
								{
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t <!-- Name heading label of the post owner -->\r\n");
      out.write("\t\t\t\t\t\t\t\t <div   id=\"pic_name\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t     <div align=\"center\"  class=\" name\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t     \t");
      out.print(resultset.getString(2)+" "+resultset.getString(3));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t     </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Post message -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<div  align=\"center\" class=\"message_frame \"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p >");
      out.print(resultset.getString(4));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div align=\"center\" class=\" comment\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div  class=\"likes col-md-2 col-xs-4\" style=\"border:2px solid black;\"><strong style=\"color:red; margin-right: 5px;\">Likes</strong>");
      out.print(resultset.getString(6));
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div  class=\"col-md-7 col-xs-5 comments\" style=\"border:2px solid #346257;\">Comment Here!</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div  style=\"border:2px solid black\" class=\"col-md-offset-9 col-xs-offset-9\"  > <small style=\"color:red;\">");
      out.print(resultset.getString(1));
      out.write("</small></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t    <div   align=\"center\" class=\"comment-base animated zoomIn\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ol class=\"list-group \">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

											
											Connection connection2 = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
											
									        Statement statement2 = connection2.createStatement() ;
											ResultSet resultset2 =  statement2.executeQuery("select * from Comments WHERE ID = '"+resultset.getString(1)+"' ORDER BY ID desc") ;
											while(resultset2.next())
											{
												if(resultset.getString(1).equals(resultset2.getString(1)) )
												{
													
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"list-group-item\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p><strong><i style=\"color:blue\">");
      out.print(resultset2.getString(2)+" "+resultset2.getString(3));
      out.write("</i></strong></p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print(resultset2.getString(4));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");

												}
											 }
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<textarea style=\"margin-bottom:10px\" placeholder=\"Comment here\" rows=\"2\" class=\"form-control\" name=\"");
      out.print(resultset.getString(1));
      out.write("\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"sendComment\" value=\"");
      out.print(resultset.getString(1));
      out.write("\" class=\"btn btn-primary\" style=\"width:150px\">Send</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t\t");

								}
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!--||||||||||||||||||||||||||||||||||||||||||||||||||  Closing the post upload setion ||||||||||||||||||||||||||||||||||||||||||||||||||-->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t       </div>\r\n");
      out.write("\t\t\t\t    <div class=\"feed-section col-md-3 col-md-offset-1 col-xs-3 col-xs-offset-1\" style=\"background-color: whitesmoke;\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"fb-feed\" style=\"margin-bottom:20px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<iframe src=\"https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FNombulelo-senior-secondary-school-236973209727154%2F&tabs=timeline&width=213&height=300&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId\" width=\"213\" height=\"300\" style=\"border:none;overflow:hidden\" scrolling=\"no\" frameborder=\"0\" allowTransparency=\"true\"></iframe>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"twitter-feed\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"twitter-timeline\"  href=\"https://twitter.com/search?q=UCT%20Science\" data-widget-id=\"774076283923816448\"></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("     </div>   \r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
