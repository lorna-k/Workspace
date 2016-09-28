<%-- 
    Document   : Forum
    Created on : 14 Sep 2016, 9:50:16 PM
    Author     : Lorna Nqodi
    --%>

    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="dao.DataAccess" %>
    <%@ page import="servlet.Post" %>
    <%@ page import="java.io.*"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<%-- Security check: Prohibit access for unauthorised users--%>
<%
        if (request.getSession().getAttribute("currentUserName") == null){
        response.sendRedirect("Login.jsp");
    }
    %>

    <% Class.forName("com.mysql.jdbc.Driver"); %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html lang="en">
    <head>
        <title>Forum</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta charset="ISO-8859-1">
        <!-- css -->
        <link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/nav_style.css">
        <link rel="stylesheet" href="../css/site_styles.css">
        <link rel="stylesheet" type="text/css" href="../css/forum.css">
        <!-- The fonts-->
        <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
        <!-- JQuery -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
        
        
<!--        <div id="fb-root"></div>-->
		<script>(function(d, s, id) {
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
                <a style="padding-top:10px" href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
                <span class="header-title" style="color:white;">UCT Alumni Network</span>
                <ul class="clearfix">
                    <li><a href="../index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>
				<li><a href="CV.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
				<li><a href="Forum.jsp"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
				<li><a href=""><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
				<li><a href="People.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>	
				
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
                        <form method="post" action="../Post">
                            <div class="post-box">
                                <div class="editor">
                                    <div class="editor-header">
                                        
                                        <a href="CV.jsp"> <%= request.getSession().getAttribute("currentUserName") %>  <%= request.getSession().getAttribute("currentUserSurname") %></a>
                                        
                                        </div>
                                    <input class="write-post" name="caption" placeholder="Write a post"></input>
                                    <div class="editor-buttons">
                                        <button href=""  type="submit" class="post-btn" name="post" value="posting" >Post</button>
                                        <a href=""><span class="glyphicon glyphicon-camera" aria-hidden="true"></span> Upload</a>
                                    </div>
                                </div>              
                            </div>
                           </form> 
                            <div class="feeds">
                                <!-- Opening connection to data in database -->
                            <%
                                Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
                                
                                Statement statement = connection.createStatement() ;
                                ResultSet resultset =  statement.executeQuery("select * from Posts ORDER BY PostId desc") ;
                                
                                  
                                while(resultset.next())
                                {
                                %>
                                <div class="posts">
                                    <div class="editor">
                                        <div class="editor-header">
                                        <!-- Display name of user who posted-->
                                        
                                        <form id="ViewProfile_form" method="post" action="../View_Profile">
                                        	<button style="background:none!important;border:none;color: #D84D0A " type="submit" name ="<%=resultset.getString(2)%>"> <%=resultset.getString(2)+" "+resultset.getString(3)%></button> 
                                        </form>
                                        
                                        <!-- <span>Posted <%=resultset.getString(1)%></span> -->
                                        </div>
                                        <div class="post-body message_frame">
                                            <p><%=resultset.getString(4)%></p>
                                        </div>
                                        <div class="editor-buttons">
                                             <span style="color:#ccc;"><%=resultset.getString(6)%> Likes</span>
                                            <a href=""><span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span></a>
                                            <a href=""><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Comment </a>
                                        </div>
                                        <div class="list-comments">
                                        <% 
                                            Connection connection2 = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
                                            
                                            Statement statement2 = connection2.createStatement() ;
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
                                        
                                        
                                        <form method="post" action="../Post">
                                       		 <input class="write-comment"    name="<%=resultset.getString(1)%>" type="text" placeholder="Write a comment">
                                        </form> 
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
                            <!-- <iframe src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FNombulelo-senior-secondary-school-236973209727154%2F&tabs=timeline&width=238&height=300&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId" width="240" height="300" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true"></iframe> -->
                   			<div class="fb-page" data-href="https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961" data-tabs="timeline" data-small-header="false" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="true"><blockquote cite="https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961" class="fb-xfbml-parse-ignore"><a href="https://www.facebook.com/UCT-CSC-Alumni-Network-336386133362961">UCT CSC Alumni Network</a></blockquote></div>
                    
                    </div>
                    <div class="twitter-feed">
                            <a class="twitter-timeline"  href="https://twitter.com/search?q=UCT%20Science" data-widget-id="774076283923816448">
                            </a>
                    </div>
                    
                        
                </div>
            </div>
        </div>
        <!-- script for twitter feed -->
        <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
</body>
</html>
