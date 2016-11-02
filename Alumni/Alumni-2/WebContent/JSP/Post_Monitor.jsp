<%-- 
    Document   : Post Monitor
    Created on : 16 Sep 2016, 3:53:14 PM
    Author     : Phuluso Ngwenya
--%>

   <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="dao.DataAccess" %>
    <%@ page import="servlet.Post" %>
    <%@ page import="java.io.*"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ page import="java.time.LocalDateTime"%>
    <%@ page import="java.util.Calendar"%>
    <%@ page import="java.text.DateFormat"%>
    <%@ page import="java.text.SimpleDateFormat"%>
    <%@ page import="java.util.Date"%>

    <% Class.forName("com.mysql.jdbc.Driver"); %>
    
    <%-- Security check: Prohibit access for unauthorised users--%>
    <%
        if (request.getSession().getAttribute("currentUserName") == null){
        response.sendRedirect("Login.jsp");
    }
    %>
    
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Post Monitor</title>
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
        <script> 
        $('#nav').affix({});
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
	
        
</head>
    <body style="line-height:1;">
        <div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
            <nav class="clearfix">
                <a href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
                <span class="header-title" style="color:white;">UCT Alumni Network</span>
                
                <ul class="clearfix">
                    <li><!-- <a href="Forum.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a> --></li>
                                <li><a href="Forum.jsp" onclick="resettoggle('comments_')"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
				<li><a href="CV.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
				
				<li><a href="Notifications.jsp"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
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
            <div class="wrapper" style="padding: 0px 100px;">
                <div class="content-wrapper">
                    <div class="content" style= "margin-left: auto; margin-right: auto;    overflow: hidden !important;">
                    <form action="../searchPost" method="post" class="form-group" style="width: 100%;margin-left: 100px;">
                
                		<select class="marshal_details" id="search-dropdown" name="searcher" style="background: #ccc;visibility:hidden;"> 
							
							<option value="ALL" selected="selected">All</option> 
							<option value="First_Name">First Name</option>
							<option value="Last_Name">Last Name</option>
							<option value="City">City</option> 
							<option value="Highest_Degree_year">Highest degree</option> 
							<option value="Current_Company">Company name</option>
							<option value="Occupation">Occupation</option>	 
							<option value="Major1">Major</option>
													
						</select> 

			
						<input id="search-text" type="text" name="search" placeholder="Search.." style="background: #ccc;">
						<button class="icon" id="search-button"    name="submit" type="submit"><i class="glyphicon glyphicon-search" style="margin-top: 3px;background: #ccc;"></i></button>
						
						</form>
                    
                           
                            <div class="feeds" style="padding: 0px 100px;">
                              
                            <%
                                //values from the form search fields
                                String search_1= request.getSession().getAttribute("searcher")+"";
                                		//
                                String search_2 =request.getSession().getAttribute("search")+"";
                            
                                	if((search_1.equalsIgnoreCase("ALL")||search_1.equalsIgnoreCase("Highest_Degree_Year")||search_1.equalsIgnoreCase("Highest_Degree")||search_1.equalsIgnoreCase("First_Name")||search_1.equalsIgnoreCase("Current_Company")||search_1.equalsIgnoreCase("Last_Name")||search_1.equalsIgnoreCase("Major1")||search_1.equalsIgnoreCase("Occupation")||search_1.equalsIgnoreCase("City"))){	
                                             //Opening connection to data in database
                                            Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

                                            Statement statement = connection.createStatement() ;
                                            ResultSet resultset = null;
                                            resultset =  statement.executeQuery("Select * from Posts Where lower(concat(PostId,Name,Surname,Caption,likes,Location))  like lower('%"+search_2+"%') ") ;
                                            ResultSetMetaData metaData = resultset.getMetaData();
                                            if(resultset.isBeforeFirst()){
                                                
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
                                		 
                                     %>
                                     <div class="posts">
                                         <div class="editor">
                                             <div class="editor-header">
                                             <!-- Display name of user who posted-->
                                             
                                             <form id="ViewProfile_form" method="post" action="../View_Profile">
	                                        	<button style="background:none!important;border:none;color: #D84D0A!important;margin-top: 1.5%; " type="submit" name ="<%=resultset.getString(2)%>"> <%=resultset.getString(2)+" "+resultset.getString(3)%></button> 
	                                        </form>
                                             
                                             
                                             <%=resultset.getString(1)%>
                                             </div>
                                             
												
											 
                                             
                                             <div class="post-body message_frame" style="color: grey;">
                                             	
                                             		<p><%=resultset.getString(4)%></p>
                                                 	
                                             </div>

                                         </div>
                                     </div>
                                     
                                      <%}}
                                      else{%>
                                 
                                	 <div class="posts">
                                     <div class="editor">
                                         <div class="editor-header">
                                         <!-- Display not found message to screen-->
                                         
                                         </div>
                                         <div class="post-body message_frame" style="color: grey;">
                                             <p>Search "<%=search_2%>" Not found</p>
                                             <p>Enter a Valid search value</p>
                                            
                                         </div>

                                     </div>
                                 </div>
                                 		 
                                     
                                	 
                                 <%}
                                }
                                if(search_2.equalsIgnoreCase("null"))
                                {
                                    //Opening connection to data in database
                                    Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
                                
                                     Statement statement = connection.createStatement() ;
                                     ResultSet resultset1 = null;
                                     resultset1 =  statement.executeQuery("Select * from Posts Where lower(concat(PostId,Name,Surname,Caption,likes,Location))  like lower('%"+search_2+"%')") ; //gets everything from CV database
                                     if(resultset1.isBeforeFirst()){
                                      while(resultset1.next()){%>
                                        <div class="posts">
                                         <div class="editor">
                                             <div class="editor-header">
                                             <!-- Display name of user who posted-->
                                             <!-- populating form with fields from the result set -->
                                             <form id="ViewProfile_form" method="post" action="../View_Profile">
	                                        	<button style="background:none!important;border:none;color: #D84D0A " type="submit" name ="<%=resultset1.getString(2)%>"> <%=resultset1.getString(2)+" "+resultset1.getString(3)%></button> 
	                                        </form>
                                             
                                             
                                             <%=resultset1.getString(1)%>
                                             </div>
                                             <div class="post-body message_frame" style="color: grey;">
                                                 <p><%=resultset1.getString(4)%></p>
                                                 
                                             </div>

                                         </div>
                                     </div>
                                <%}}}

                                 %>
                                     <!-- Closing connection to database -->
  
                                
                            </div>
                        <!-- </form>   -->                      
                    </div>
                </div>
</div>
                </div>
    </body>
</html>
