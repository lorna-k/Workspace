<%-- 
    Document   : Forum
    Created on : 14 Sep 2016, 9:50:16 PM
    Author     : Lorna Nqodi
    --%>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="dao.DataAccess" %>
    <%@ page import="dao.ImageAccess" %>
    <%@ page import="servlet.Post" %>
    <%@ page import="java.io.*"%>
    <%@ page import="java.time.LocalDateTime"%>
    <%@ page import="java.util.Calendar"%>
    <%@ page import="java.text.DateFormat"%>
    <%@ page import="java.text.SimpleDateFormat"%>
    <%@ page import="java.util.Date"%>
 


    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
    
    
<%-- Security check: Prohibit access for unauthorised users--%>
<%
        if (request.getSession().getAttribute("currentUserName") == null){
        response.sendRedirect("Login.jsp");
    }
    %>

    <% Class.forName("com.mysql.jdbc.Driver"); %>
    <%//Opening connection to data in database
    Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Forum</title>
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
<script type="text/javascript">
	$(document).ready(function () {
	    var maxheight=0;
	    var showText = "Comment";
	    var hideText = "Hide Comments";
	
	    $('.textContainer_Truncate').each(function () {
	      var text = $(this);
	      if (text.height() > maxheight){
	          text.css({ 'overflow': 'hidden','height': maxheight + 'px' });
	
	          var link = $('<a href="#">'+ showText + '</a>');
	          var linkDiv = $('<div class="editor-buttons"><a><span class="glyphicon glyphicon-comment"></span></a> </div>');
	          linkDiv.append(link);
	          $(this).after(linkDiv);
	
	          link.click(function (event) {
	            event.preventDefault();
	            if (text.height() > maxheight) {
	                $(this).html(showText);
	                text.css('height', maxheight + 'px');
	            } else {
	                $(this).html(hideText);
	                text.css('height', 'auto');
	            }
	          });
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
                <div class="content-wrapper">
                    <div class="content">
                        <form method="post" action="../Post" enctype="multipart/form-data" >
                            <div class="post-box">
                                <div class="editor">
                                    <div class="editor-header">
                                        
                                        <a href="CV.jsp"> <%= request.getSession().getAttribute("currentUserName") %>  <%= request.getSession().getAttribute("currentUserSurname") %></a>  
                                        
                                        </div>
                                    <textarea  class="write-post" cols="76" rows="5" name="caption" placeholder="Write a post"></textarea>
                                    <div class="editor-buttons">
                                        <button  type="submit" class="post-btn" name="post" value="posting" >Post</button>
                           
                                        <label style="margin-left:10px;color: #337ab7" id="file_button" >
											<input type="file" name="photo"  id="uploadID"  >
										</label>
                                        
                                        
                                    </div>
                                </div>              
                            </div>
                           </form> 
                            <div class="feeds">
                                <!-- Opening connection to data in database -->
                            <%
                               
                                
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
                                         
                                %>
                                <div class="posts">
                                    <div class="editor">
                                        <div class="editor-header">
                                        <!-- Display name of user who posted-->
                                        
                                        <form  method="post" action="../View_Profile" style="width:50%;float:left;">
                                        	<button style="background:none!important;border:none;color: #D84D0A " type="submit" name ="<%=resultset.getString(2)%>"> <%=resultset.getString(2)+" "+resultset.getString(3)%></button> 
                                        </form>
                                        <span style="float: right;padding: 1px 6px;line-height: 1;color: #90949c;"><%=thedate%></br><%=outputFormat.format(inputFormat.parse(input))%></span></br>
                                        
                                        <!-- <span>Posted <%=resultset.getString(1)%></span> -->
                                        </div>
                                        
                                        <%if(resultset.getString(8)!=null || resultset.getString(2).equals("Wandile")) 
                                        {
                                        	
                                        	//request.getSession().setAttribute("imageID",null);
                                        	//request.getSession().setAttribute("imageID",resultset.getString(1));
                                            //System.out.println(request.getSession().getAttribute("imageID"));
                                        %>
                                        <div class="post-body message_frame" >
                                             <p><%=resultset.getString(4)%></p>
                                             
                                            

                                            <% 
                                            if(!(resultset.getString(2).equals("Wandile")))
                                            {
                                            	request.getSession().setAttribute("imageID",resultset.getString(1));
                                            %>

                                            
                                            <img style="max-height:400px;width:600px" src="${pageContext.request.contextPath}/Post?id=${resultset.getString(1)}">
                                            <%} %>
                                            
                                            <% 
                                            if(resultset.getString(2).equals("Wandile"))
                                            {%>
                                            
                                            <img src="../j5.png" style="max-height:400px;width:600px"> 
                                             <%} %>
                                            
                                        </div>
                                        <%} %>
                                        
                                        
                                        <%if(resultset.getString(8)==null && !(resultset.getString(2).equals("Wandile"))) 
                                        {
                                        %>
                                        <div class="post-body message_frame">
                                            <p><%=resultset.getString(4)%></p>
                                        </div>
                                        <%} %>
                                        
                                        
                                        
                                        <form method="post" action="../Like_Post">
	                                        <div class="editor-buttons">
	                                            <button  type="submit" style="background:none!important;border:none;color: #337ab7" name ="<%=resultset.getString(1)%>"><span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span></button>
	                                             <span style="color:#90949c;"><%=resultset.getString(6)%> Likes</span>	 
	                                                                                      	                                            
	                                        </div>
                                        </form>
                                        <form method="post" action="${pageContext.request.contextPath}/ProcessRequest">
	                                         <button  type="submit" style="background:none!important;border:none;color: #337ab7;float: right;" name ="report" value="<%=resultset.getString(1)%>">Report</button>
	                                    </form>  
                                        
                                        <div class='textContainer_Truncate '>
                                            
                                            <div class="list-comments">
                                            <% 
                                               
                                                
                                                Statement statement2 = connection.createStatement() ;
                                                ResultSet resultset2 =  statement2.executeQuery("select * from Comments WHERE ID = '"+resultset.getString(1)+"' ORDER BY ID desc") ;
                                                while(resultset2.next())
                                                {
                                                    if(resultset.getString(1).equals(resultset2.getString(1)) )
                                                    {
                                                        %>
    		                                          <div>
    		                                            <strong><%=resultset2.getString(2)+" "+resultset2.getString(3)%>: </strong>
    		                                            <%=resultset2.getString(4)%>
    		                                        </div>
    		                                          <%
                                                    }
                                                 }
                                                %>
                                            </div>


                                        <form method="post" action="../Post" enctype="multipart/form-data">
                                       		 <input class="write-comment"    name="<%=resultset.getString(1)%>" type="text" placeholder="Write a comment">
	                                        <input type="file" name="photo"  id="uploadID" style="display:none"  >
	                                       </form> 
	
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
                <div class="sidebar">
                    <div class="fb-feed" style="margin-bottom:20px;">
                   			<div class="fb-page" data-href="https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961" data-tabs="timeline" data-small-header="false" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="true"><blockquote cite="https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961" class="fb-xfbml-parse-ignore"><a href="https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961">UCT CSC Alumni Network</a></blockquote></div>
                    
                    </div>
                    <div class="twitter-feed">
                            <a class="twitter-timeline"  href="https://twitter.com/search?q=UCT%20Science" data-widget-id="774076283923816448">
                            </a>
                    </div>
                    
                        
                </div>
                
            </div>
        </div>
        
        <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
</body>
</html>
