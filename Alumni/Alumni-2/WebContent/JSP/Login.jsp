<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
	<meta charset="UTF-8">
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- css -->
	<link  rel="stylesheet" href="../css/site_styles.css" />
	<link  rel="stylesheet" href="../css/animate.css" />
	<link  rel="stylesheet" href="../css/nav_style.css" />
	<link rel="stylesheet" href="../css/normalize.css">
	<!-- bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<!-- Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
	<!-- JQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
</head>
<body>
	<div class="nav-container">
		<nav class="clearfix">
			<a href="index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
			<span class="header-title" style="color:white;">UCT Alumni Network</span>
			<a><span class="glyphicon glyphicon-home" aria-hidden="true" style="color:white;"></span></a>
		</nav>
	</div>	
	
	
	<div class="wrapper " style="position:relative; top: 10px;">

		<div class="container">
			<div class="col-md-8" style="margin-left:200px; margin-top:15vh">
				
				
				<%
				
				String error_message= request.getSession().getAttribute("error_message")+"";
			    if(!(error_message.equals("null")))
			    {
			    %>
				<div class="alert alert-danger">
				  <strong>Danger!</strong> <%= error_message %>
				</div>
			    <%
			     }
			    %>
				
				<h1>Login</h1>
				<br/>
				<form action="../Login" method="post" class="form-group" >

					<div class="form-group">
						<label for="email">Username:</label>
						<input  placeholder="Student / Staff Number" type="text" class="form-control" name="id"/>
					</div>

					<div class="form-group">
						<label >Password:</label>
						<input placeholder="Enter Password" class="form-control" name="password" type="password" style="margin-left:0px"/>
					</div>

					<div class="checkbox">
						<label><input type="checkbox"> Remember me</label>
					</div>


					<!-- <a href="#/channels"> --><button type="submit" class="btn btn-primary form-group">Sign in</button><!-- </a> -->

					<p class="message">Not registered? <a href="../JSP/addUser.jsp">Create an account</a></p>
				</form>
			</div>
		</div>
	</div>

</body>
</html>