<%-- 
    Document   : Notifications
    Created on : 05 Oct 2016, 
    Author     : Phuluso Ngwenya
    --%>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="dao.DataAccess" %>
    <%@ page import="servlet.Post" %>
    <%@ page import="java.io.*"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@ page import="java.io.*"%>
    <%@ page import="java.time.LocalDateTime"%>
    <%@ page import="java.util.Calendar"%>
    <%@ page import="java.text.DateFormat"%>
    <%@ page import="java.text.SimpleDateFormat"%>
    <%@ page import="java.util.Date"%>
 
    
<%-- Security check: Prohibit access for unauthorised users--%>
<%
        if (request.getSession().getAttribute("currentUserName") == null){
        response.sendRedirect("Login.jsp");
    }
    %>

    <% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Notifications</title>
	<meta charset="UTF-8">
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- css -->
	<link  rel="stylesheet" href="../css/site_styles.css" />
	<link  rel="stylesheet" href="../css/animate.css" />
	<link  rel="stylesheet" href="../css/nav_style.css" />
	<link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/forum.css">
	<!-- bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<!-- Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
	<!-- JQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <!--nav--> 
        <script>
        $(function() {
            var pull        = $('#pull');
            menu        = $('nav ul');
            menuHeight  = menu.height();

            $(pull).on('click', function(e) {
                e.preventDefault();
                menu.slideToggle();
            });

            $(window).resize(function(){
                var w = $(window).width();
                if(w > 320 && menu.is(':hidden')) {
                    menu.removeAttr('style');
                }
            });
        });
        </script>
     
        <!--Face book-->
        <script>
            (function(d, s, id) {
		  var js, fjs = d.getElementsByTagName(s)[0];
		  if (d.getElementById(id)) return;
		  js = d.createElement(s); js.id = id;
		  js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.7&appId=313231902363487";
		  fjs.parentNode.insertBefore(js, fjs);
            }(document, 'script', 'facebook-jssdk'));
	</script>

<script>
function resettoggle() {
var e = document.getElementById('list-comments');
e.style.display = 'none';

}

function toggle_visibility() {
	
var e = document.getElementById('list-comments');
if(e.style.display == 'block'){
	e.style.display = 'none';
 
}
else
e.style.display = 'block';
}



</script>
        
</head>
<body>
		
        <div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
            <nav class="clearfix">
                <a href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
                <span class="header-title" style="color:white;">UCT Alumni Network</span>
                <ul class="clearfix">
                    <li><!-- <a href="Forum.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> --></li>
                                <li><a href="Forum.jsp" onclick="resettoggle('comments_')"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
				<li><a href="CV.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
				
				<li><a href="Notifications.jsp"><span class="glyphicon glyphicon-envelope" id="envelope" aria-hidden="true"></span> Notifications</a></li>
				<li><a href="People.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>	
				<li><a href="https://drive.google.com/open?id=0B5hfZMerj_ABSks3RXI4RTJvOTg"><span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span> Help</a></li>
				<form id="logout_form" method="post" action="../logout">	
					<li><a href="javascript:{}" onclick="document.getElementById('logout_form').submit(); return false;"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li> 
				</form>
				
                </ul>
                <a href="#" id="pull">Menu</a>
            </nav>
        </div>
        <div class="page">
            <div class="wrapper">
            <h1>Notifications</h1>
                <div class="content-wrapper">
                
                    <div class="content">
                    

                            <div class="feeds">
                                <!-- Opening connection to data in database -->
                            <%
                                Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
                                
                                Statement statement = connection.createStatement() ;
                                ResultSet resultset =  statement.executeQuery("select * from Notifications ORDER BY today ASC") ;
                                
                                  
                                while(resultset.next())
                                {
                                	Calendar cal = Calendar.getInstance();
                                	cal.setTime(resultset.getDate(2));
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
                                         
                                         
                                         String input = resultset.getString(2);
                                         DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                         DateFormat outputFormat = new SimpleDateFormat("KK:mm a"); //formatting date to 12 hour PM/AM
                                %>
                                <div class="posts">
                                    <div class="editor" style="border: 1px solid #ccc;border-radius: 4px;background-color: #455868;color: whitesmoke;">
                                        <div class="editor-header">
                                        <!-- Display name of user who posted-->
                                        
                                        <form id="ViewProfile_form" method="post" action="../View_Profile">
                                        	<label style="background:none!important;border:none;color: whitesmoke;margin-left:5px"> <%=resultset.getString(1)%></label> 
                                        </form>
                                        
                                        <!-- <span>Posted <%=resultset.getString(1)%></span> -->
                                        </div>
                                        <div class="post-body message_frame">
                                            <p><%=resultset.getString(3)%></p>
                                        </div>
                                         <div class="post-body date_today">
                                            <span style="float: right;padding: 1px 6px;line-height: 1;color: #90949c;"><%=thedate%></br><%=outputFormat.format(inputFormat.parse(input))%></span>
                                        </div>
                                        
                                        
                                        
                                        
                                        
                                        
                                    </div>
                                </div>
                                <!-- Closing connection to database -->
                                   <%
                                    }
                                    %>
                            </div>
                       <!--  </form>  -->                       
                    </div>
                </div>
                
            </div>
        </div>
        <!-- script for twitter feed -->
        
        
 </body>
</html>
 
