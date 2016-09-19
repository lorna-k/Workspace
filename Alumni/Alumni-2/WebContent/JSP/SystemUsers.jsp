

<%-- 
    Document   : AllPost
    Created on : Sep 1, 2016, 10:29:40 PM
    Author     : Skhumbuzo
--%>

<%@ page import="java.sql.*" %>
<%@ page import="dao.DataAccess" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--|||||||||||||||||| I am sure that we do not have to copy and poster the style tages in every page  ||||||||||||||||||-->

	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta charset="ISO-8859-1">
	
	<!-- css -->
	<link rel="stylesheet" href="../css/normalize.css">
	<link rel="stylesheet" href="../css/nav_style.css">
	<link rel="stylesheet" href="../css/site_styles.css">
	<link rel="stylesheet" type="text/css" href="../css/feed_style.css">
	
	<!-- font -->
	<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
	<link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
	<!-- JQuery -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	
	
	<script>
	$(function() {
		var pull 		= $('#pull');
		menu 		= $('nav ul');
		menuHeight	= menu.height();

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
	<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+"://platform.twitter.com/widgets.js";fjs.parentNode.insertBefore(js,fjs);}}(document,"script","twitter-wjs");</script>
	
	
   <title>Feeds</title>

</head>
 <body>
	   <div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
			<nav class="clearfix">
				<a style="padding-top:10px" href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
				<span class="header-title" style="color:white;">UCT Alumni Network</span>
				<ul class="clearfix">
					<li><a href="../index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>
					<li><a href="Forum.jsp"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
					<li><a href=""><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
					<li><a href="People.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>			
					<li><a href="../index.html"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>	
				</ul>
				<a href="#" id="pull">Menu</a>
			</nav>
		</div>
	
        <H1 align="center" style="margin-top:15vh;font-family:Aria"> Users</H1>

        <% 
            Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
            statement.executeQuery("select * from Users") ; 
        %>
        <div align="center">
			<form action="${pageContext.request.contextPath}/ProcessRequest" method="post">
			
		        <TABLE class=" table table-bordered" style="width:77%">
		            <TR>
		                <TH>ID</TH>
		                <TH>Name</TH>
		                <TH>Surname</TH>
		                <TH>Email</TH>
		                <TH>Password (hidden)</TH>
		                <TH>Account Type</TH>
                                 <TH>Delete User</TH>
		            <!--<TH>Accept</TH>
		                <TH>Reject</TH>  --> 
		            </TR>
		            <% while(resultset.next())
		            { 
		            	String id=resultset.getString(1);
		            	DataAccess da=new DataAccess();
		            %>
		            <TR>
		                <TD> <%= resultset.getString(1) %></TD>
		                <TD> <%= resultset.getString(2) %></TD>
		                <TD> <%= resultset.getString(3) %></TD>
		                <TD> <%= resultset.getString(4) %></TD>
		                <TD align="center"> ****************</TD>
		                <TD> <%= resultset.getString(6) %></TD>
                                <TD><input type="submit" name="delete" value="<%=id%>" style="width:100%" /></TD>
		            <!--<TD><input type="submit" name="accept" value="<%=id%>" style="width:100%" /></TD>
		                <TD><input type="submit" name="reject" value="<%=id%>" style="width:100%" /></TD>-->
		            </TR>
		            <% } %>
		        </TABLE>
		        
	        </form>
	        
	        <ul style="list-style: none;">
	        	<li><strong style="font-size:20px">View Tables</strong></li>
	        	<li><a href="PendingUsers.jsp">Pending Users</a></li>
	        	<li><a href="RejectedUsers.jsp">Rejected Users</a></li>
	        </ul>
	         
	        
        </div>
         
             
             
    </BODY>
</HTML>

