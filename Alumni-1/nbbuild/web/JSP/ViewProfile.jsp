<%-- 
Document   : ViewProfile
Created on : 14 Sep 2016, 3:05:50 PM
Author     : Lorna Nqodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- Security check: Prohibit access for unauthorised users--%>
<%
        if (request.getSession().getAttribute("currentUserName") == null){
        response.sendRedirect("Login.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Profile</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta charset="ISO-8859-1">
	<!-- css -->
	<link rel="stylesheet" href="../css/normalize.css">
	<link rel="stylesheet" href="../css/nav_style.css">
	<link rel="stylesheet" href="../css/site_styles.css">
	<!-- <link rel="stylesheet" type="text/css" href="../css/profile_style.css"> -->
	<link rel="stylesheet" type="text/css" href="../css/viewProfile.css">
	<!-- The fonts-->
	<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
	<link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
	<!-- JQuery -->
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

	<script src="../jQuery/navigation-script.js"></script>
</head>
<body>
	<div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
		<nav class="clearfix">
			<a href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
			<span class="header-title" style="color:white;">UCT Alumni Network</span>
			<ul class="clearfix">
				<li><a href="Forum.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>
				<li><a href="CV.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
				<li><a href="Forum.jsp"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
				<li><a href="Notifications.jsp"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
				<li><a href="people.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>			
				<li><a href="../index"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>	
			</ul>
			<a href="#" id="pull">Menu</a>
		</nav>
	</div>
	<div class="container main-container">
        <div class="row">
        	<div class="col-md-10 col-md-offset-1 col-sm-12 cover-photo" id="content-wrapper">
    			<!-- <img src="http://mybroadband.co.za/news/wp-content/uploads/2016/04/University-of-Cape-Town-UCT.jpg"> -->
    			<div class="profile-header">
					<div class="name-holder">Jane Doe</div>	
					<img class="profile-photo" src="../default-profile.png">
				</div>     		
        	</div>
        </div>
        <div class="row">
        	<div class="col-md-10 col-md-offset-1 col-sm-12" id="profile-nav" data-spy="affix" data-offset-top="300">
        		<a href="#section1">Personal</a>
		      	<a href="#section2">Education</a>
		      	<a href="#section3">Experience</a>
				<a href="#section4">Skills</a>
				<a href="#section5">Interests</a>
        	</div>
        </div>
        <div class="row">
        	<div id="section1" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    
				  <dl class="dl-horizontal">
					  <dt>Username</dt> <dd>nqdlor001</dd>
					  <dt>Name</dt> <dd> Lorna Nqodi</dd>
					  <dt>Email</dt> <dd><address><a href="mailto:#">nqdlor001@myuct.ac.za</a></address></dd>
					  <dt>Occupation</dt> <dd>Student</dd>
					  <dt>Address</dt> 
					  <dd>Twitter, Inc.<br>
					  	1355 Market Street, Suite 900<br>
					  	San Francisco, CA 94103<br>
						  <!-- place city country & postal code fields here -->
						  <abbr title="Phone">Phone:</abbr> (123) 456-7890
						</dd>
					</dl>
			</div>
        </div>
        <div class="row">
        	<div id="section2" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Education</h1>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			</div>
        </div>
        <div class="row">
        	<div id="section3" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Experience</h1>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			</div>
        </div>
        <div class="row">
        	<div id="section4" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Skills</h1>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			</div>
        </div>
        <div class="row">
        	<div id="section5" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Interests</h1>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			    <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
			</div>
        </div>

	</div>


</body>
</html>
