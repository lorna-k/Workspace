

<%-- 
    Document   : AllPost
    Created on : Sep 1, 2016, 10:29:40 PM
    Author     : Skhumbuzo
--%>

<%@ page import="java.sql.*" %>
<%@ page import="dao.DataAccess" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<%--Security Check: only permit admin access to this page--%>
<%
    if(request.getSession().getAttribute("currentUserName") != "Admin"){
        response.sendRedirect("Login.jsp");
    }

%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Administrator</title>
	<meta charset="UTF-8">
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- css -->
	<link  rel="stylesheet" href="../css/site_styles.css" />
	<link  rel="stylesheet" href="../css/animate.css" />
	<link  rel="stylesheet" href="../css/nav_style.css" />
	<link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/feed_styles.css">
        <link rel="stylesheet" href="../css/admin_styles.css">
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
        
</head>
 <body>
	   <div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
			<nav class="clearfix">
				<a href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
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
     <div class="left-navbar">
		<a href="../index.html">Home</a>
                <a href="PendingUsers.jsp">Pending Users</a>
                <a href="SystemUsers.jsp">System Users</a>
		<a href="RejectedUsers.jsp">Rejected Users</a>

	</div>
	<div class="right-content">
	
        <H1 align="center" style="margin-top:13vh;font-family:Aria"> Users</H1>

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
	        
<!--	        <ul style="list-style: none;">
	        	<li><strong style="font-size:20px">View Tables</strong></li>
	        	<li><a href="PendingUsers.jsp">Pending Users</a></li>
	        	<li><a href="RejectedUsers.jsp">Rejected Users</a></li>
	        </ul>-->
	         
	        
        </div>
         
             
        </div>     
    </BODY>
</HTML>

