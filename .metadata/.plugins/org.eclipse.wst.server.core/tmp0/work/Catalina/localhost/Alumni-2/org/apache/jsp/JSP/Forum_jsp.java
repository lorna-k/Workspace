/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.70
 * Generated at: 2016-11-10 16:35:51 UTC
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
import dao.ImageAccess;
import servlet.Post;
import java.io.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Forum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("    ");
//Opening connection to data in database
    Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Forum</title>\r\n");
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
      out.write("    <script>\r\n");
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
      out.write("        \r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function () {\r\n");
      out.write("\t    var maxheight=0;\r\n");
      out.write("\t    var showText = \"Comment\";\r\n");
      out.write("\t    var hideText = \"Hide Comments\";\r\n");
      out.write("\t\r\n");
      out.write("\t    $('.textContainer_Truncate').each(function () {\r\n");
      out.write("\t      var text = $(this);\r\n");
      out.write("\t      if (text.height() > maxheight){\r\n");
      out.write("\t          text.css({ 'overflow': 'hidden','height': maxheight + 'px' });\r\n");
      out.write("\t\r\n");
      out.write("\t          var link = $('<a href=\"#\">'+ showText + '</a>');\r\n");
      out.write("\t          var linkDiv = $('<div class=\"editor-buttons\"><a><span class=\"glyphicon glyphicon-comment\"></span></a> </div>');\r\n");
      out.write("\t          linkDiv.append(link);\r\n");
      out.write("\t          $(this).after(linkDiv);\r\n");
      out.write("\t\r\n");
      out.write("\t          link.click(function (event) {\r\n");
      out.write("\t            event.preventDefault();\r\n");
      out.write("\t            if (text.height() > maxheight) {\r\n");
      out.write("\t                $(this).html(showText);\r\n");
      out.write("\t                text.css('height', maxheight + 'px');\r\n");
      out.write("\t            } else {\r\n");
      out.write("\t                $(this).html(hideText);\r\n");
      out.write("\t                text.css('height', 'auto');\r\n");
      out.write("\t            }\r\n");
      out.write("\t          });\r\n");
      out.write("\t      }       \r\n");
      out.write("\t    });\r\n");
      out.write("\t });\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("     \r\n");
      out.write("<!--Face book-->\r\n");
      out.write("<script>\r\n");
      out.write("            (function(d, s, id) {\r\n");
      out.write("\t\t  var js, fjs = d.getElementsByTagName(s)[0];\r\n");
      out.write("\t\t  if (d.getElementById(id)) return;\r\n");
      out.write("\t\t  js = d.createElement(s); js.id = id;\r\n");
      out.write("\t\t  js.src = \"//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.7&appId=313231902363487\";\r\n");
      out.write("\t\t  fjs.parentNode.insertBefore(js, fjs);\r\n");
      out.write("            }(document, 'script', 'facebook-jssdk'));\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\t\t\t<li><a href=\"Notifications.jsp\"><span class=\"glyphicon glyphicon-envelope\" id=\"envelope\" aria-hidden=\"true\"></span> Notifications</a></li>\r\n");
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
      out.write("                <div class=\"content-wrapper\">\r\n");
      out.write("                    <div class=\"content\">\r\n");
      out.write("                        <form method=\"post\" action=\"../Post\" enctype=\"multipart/form-data\" >\r\n");
      out.write("                            <div class=\"post-box\">\r\n");
      out.write("                                <div class=\"editor\">\r\n");
      out.write("                                    <div class=\"editor-header\">\r\n");
      out.write("                                        \r\n");
      out.write("                                        <a href=\"CV.jsp\"> ");
      out.print( request.getSession().getAttribute("currentUserName") );
      out.write(' ');
      out.write(' ');
      out.print( request.getSession().getAttribute("currentUserSurname") );
      out.write("</a>  \r\n");
      out.write("                                        \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    <textarea  class=\"write-post\" cols=\"76\" rows=\"5\" name=\"caption\" placeholder=\"Write a post\"></textarea>\r\n");
      out.write("                                    <div class=\"editor-buttons\">\r\n");
      out.write("                                        <button  type=\"submit\" class=\"post-btn\" name=\"post\" value=\"posting\" >Post</button>\r\n");
      out.write("                           \r\n");
      out.write("                                        <label style=\"margin-left:10px;color: #337ab7\" id=\"file_button\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"file\" name=\"photo\"  id=\"uploadID\"  >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>              \r\n");
      out.write("                            </div>\r\n");
      out.write("                           </form> \r\n");
      out.write("                            <div class=\"feeds\">\r\n");
      out.write("                                <!-- Opening connection to data in database -->\r\n");
      out.write("                            ");

                               
                                
                                Statement statement = connection.createStatement() ;
                                ResultSet resultset =  statement.executeQuery("select * from Posts ORDER BY PostId desc") ;
                                
                                  
                                while(resultset.next())
                                {
                                	Calendar cal = Calendar.getInstance();
                                	cal.setTime(resultset.getDate(1));
                                	int month = cal.get(Calendar.MONTH)+1;
                                	int day =cal.get(Calendar.DATE);
                                    String thismonth= "";
                                         switch (month) {
                                             case 1:
                                                 thismonth="Jan";
                                                 break;
                                             case 2:
                                                 thismonth="Feb";
                                                 break;
                                             case 3:
                                                 thismonth="Mar";
                                                 break;
                                             case 4:
                                                 thismonth="Apr";
                                                 break;
                                             case 5:
                                                 thismonth="May";
                                                 break;
                                             case 6:
                                                 thismonth="Jun";
                                                 break;
                                             case 7:
                                                 thismonth="Jul";
                                                 break;
                                             case 8:
                                                 thismonth="Aug";
                                                 break;
                                             case 9:
                                                 thismonth="Sept";
                                                 break;
                                             case 10:
                                                 thismonth="Oct";
                                                 break;
                                             case 11:
                                                 thismonth="Nov";
                                                 break;
                                             case 12:
                                                 thismonth="Dec";
                                                 break;
                                             default:
                                                 break;
                                         }
                                         
                                         String thedate = day +" "+ thismonth; //manufacturing time stamp
                                         
                                         
                                         String input = resultset.getString(1);
                                         DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                         DateFormat outputFormat = new SimpleDateFormat("KK:mm a"); //formatting date to 12 hour PM/AM
                                         
                                
      out.write("\r\n");
      out.write("                                <div class=\"posts\">\r\n");
      out.write("                                    <div class=\"editor\">\r\n");
      out.write("                                        <div class=\"editor-header\">\r\n");
      out.write("                                        <!-- Display name of user who posted-->\r\n");
      out.write("                                        \r\n");
      out.write("                                        <form  method=\"post\" action=\"../View_Profile\" style=\"width:50%;float:left;\">\r\n");
      out.write("                                        \t<button style=\"background:none!important;border:none;color: #D84D0A \" type=\"submit\" name =\"");
      out.print(resultset.getString(2));
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(resultset.getString(2)+" "+resultset.getString(3));
      out.write("</button> \r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <span style=\"float: right;padding: 1px 6px;line-height: 1;color: #90949c;\">");
      out.print(thedate);
      out.write("</br>");
      out.print(outputFormat.format(inputFormat.parse(input)));
      out.write("</span></br>\r\n");
      out.write("                                        \r\n");
      out.write("                                        <!-- <span>Posted ");
      out.print(resultset.getString(1));
      out.write("</span> -->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        ");
if(resultset.getString(8)!=null || resultset.getString(2).equals("Wandile")) 
                                        {
                                        	
                                        	request.getSession().setAttribute("imageID",null);
                                        	request.getSession().setAttribute("imageID",resultset.getString(1));
                                        	System.out.println(request.getSession().getAttribute("imageID"));
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"post-body message_frame\" >\r\n");
      out.write("                                             <p>");
      out.print(resultset.getString(4));
      out.write("</p>\r\n");
      out.write("                                             \r\n");
      out.write("                                            \r\n");
      out.write("\r\n");
      out.write("                                            ");
 
                                            if(!(resultset.getString(2).equals("Wandile")))
                                            {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            <img style=\"max-height:400px;width:600px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Post?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${resultset.getString(1)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                            ");
} 
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            ");
 
                                            if(resultset.getString(2).equals("Wandile"))
                                            {
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            <img src=\"../j5.png\" style=\"max-height:400px;width:600px\"> \r\n");
      out.write("                                             ");
} 
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");
} 
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        ");
if(resultset.getString(8)==null && !(resultset.getString(2).equals("Wandile"))) 
                                        {
                                        
      out.write("\r\n");
      out.write("                                        <div class=\"post-body message_frame\">\r\n");
      out.write("                                            <p>");
      out.print(resultset.getString(4));
      out.write("</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        ");
} 
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        <form method=\"post\" action=\"../Like_Post\">\r\n");
      out.write("\t                                        <div class=\"editor-buttons\">\r\n");
      out.write("\t                                            <button  type=\"submit\" style=\"background:none!important;border:none;color: #337ab7\" name =\"");
      out.print(resultset.getString(1));
      out.write("\"><span class=\"glyphicon glyphicon-thumbs-up\" aria-hidden=\"true\"></span></button>\r\n");
      out.write("\t                                             <span style=\"color:#90949c;\">");
      out.print(resultset.getString(6));
      out.write(" Likes</span>\t \r\n");
      out.write("\t                                                                                      \t                                            \r\n");
      out.write("\t                                        </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ProcessRequest\">\r\n");
      out.write("\t                                         <button  type=\"submit\" style=\"background:none!important;border:none;color: #337ab7;float: right;\" name =\"report\" value=\"");
      out.print(resultset.getString(1));
      out.write("\">Report</button>\r\n");
      out.write("\t                                    </form>  \r\n");
      out.write("                                        \r\n");
      out.write("                                        <div class='textContainer_Truncate '>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <div class=\"list-comments\">\r\n");
      out.write("                                            ");
 
                                               
                                                
                                                Statement statement2 = connection.createStatement() ;
                                                ResultSet resultset2 =  statement2.executeQuery("select * from Comments WHERE ID = '"+resultset.getString(1)+"' ORDER BY ID desc") ;
                                                while(resultset2.next())
                                                {
                                                    if(resultset.getString(1).equals(resultset2.getString(1)) )
                                                    {
                                                        
      out.write("\r\n");
      out.write("    \t\t                                          <div>\r\n");
      out.write("    \t\t                                            <strong>");
      out.print(resultset2.getString(2)+" "+resultset2.getString(3));
      out.write(": </strong>\r\n");
      out.write("    \t\t                                            ");
      out.print(resultset2.getString(4));
      out.write("\r\n");
      out.write("    \t\t                                        </div>\r\n");
      out.write("    \t\t                                          ");

                                                    }
                                                 }
                                                
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <form method=\"post\" action=\"../Post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                       \t\t <input class=\"write-comment\"    name=\"");
      out.print(resultset.getString(1));
      out.write("\" type=\"text\" placeholder=\"Write a comment\">\r\n");
      out.write("\t                                        <input type=\"file\" name=\"photo\"  id=\"uploadID\" style=\"display:none\"  >\r\n");
      out.write("\t                                       </form> \r\n");
      out.write("\t\r\n");
      out.write("\t                                    </div>\r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                                        \r\n");
      out.write("                           \r\n");
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
      out.write("                <div class=\"sidebar\">\r\n");
      out.write("                    <div class=\"fb-feed\" style=\"margin-bottom:20px;\">\r\n");
      out.write("                   \t\t\t<div class=\"fb-page\" data-href=\"https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961\" data-tabs=\"timeline\" data-small-header=\"false\" data-adapt-container-width=\"true\" data-hide-cover=\"false\" data-show-facepile=\"true\"><blockquote cite=\"https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961\" class=\"fb-xfbml-parse-ignore\"><a href=\"https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961\">UCT CSC Alumni Network</a></blockquote></div>\r\n");
      out.write("                    \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"twitter-feed\">\r\n");
      out.write("                            <a class=\"twitter-timeline\"  href=\"https://twitter.com/search?q=UCT%20Science\" data-widget-id=\"774076283923816448\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                        \r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+\"://platform.twitter.com/widgets.js\";fjs.parentNode.insertBefore(js,fjs);}}(document,\"script\",\"twitter-wjs\");</script>\r\n");
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
