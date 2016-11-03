<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Register</title>
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
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css" integrity="sha384-y3tfxAZXuh4HwSYylfB+J125MxIs6mR5FOHamPBG064zB+AFeWH94NdvaCBm8qnd" crossorigin="anonymous">
	<!-- Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
	<!-- JQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<body>
	<nav class="clearfix">
		<div class="nav-title">
				<a href="../index.html"><img class="nav-logo" src="../uct-logo.png"></a>
				<span class="header-title" style="color:white;">UCT Alumni Network</span>
                                <a href="../index.html"><span class="glyphicon glyphicon-home" aria-hidden="true" style="color:white;"></span></a>
			</div>
		<a href="#" id="pull">Sign Up</a>
	</nav>

	<div style="margin-top:20px"> <!-- class="animated zoomIn"> -->
		<h1 align="center">Sign up</h1>
		<div class="col-md-8 col-md-offset-2" id="signUp_form">
				
			<%
			
			String error_message= request.getSession().getAttribute("error_mssg")+"";
		    if(!(error_message.equals("null")))
		    {
		    %>
			<div class="alert alert-danger">
			  <strong>Danger!</strong> <%= error_message %>
			</div>
		    <%
		     }
		    %>
		
		
			<form action="../addUser" method="post" class="form-group">
				<div class="form-group">
					<label for="name">Student Number:</label>
					<input placeholder="Enter your Student or Staff number" class="form-control" type="text" name="ID"/>
				</div>
				<div class="form-group">
					<label for="name">First Name:</label>
					<input placeholder="Enter your name" class="form-control" type="text" name="first_name"/>
				</div>
				<div class="form-group">
					<label for="name">Last Name:</label>
					<input placeholder="Enter your last name" class="form-control" type="text" name="last_name"/>
				</div>
				<div class="form-group">
					<label >Password:</label>
					<input placeholder="Enter a password" class="form-control" name="passwrd" type="password" />
				</div>
                    <div class="form-group">
                        <label for="name" >Account Type:</label>
                        <select name="accountType" type="text">
                        	<option value="placeholder" class disabled selected>Select type</option>
                            <option value="Student">Student</option>
                            <option value="Staff">Staff</option>
                            <option value="Alumni">Alumni</option>
                        </select>
                    </div>
				<div class="form-group">
					<label for="email">Email address:</label>
					<input  placeholder="Enter Email" type="email" class="form-control" name="email"/>
				</div>
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
				<button class="btn btn-primary-outline" name="submit"  type="submit" class="form-group">Sign up</button>
			</form>
		</div>
	</form> 
</div>
</body>
</html>