<%-- 
Document   : Edit Profile
Created on : 14 Sep 2016, 3:05:50 PM
Author     : Lorna Nqodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
	<link rel="stylesheet" type="text/css" href="../css/editProfile.css">
	<!-- The fonts-->
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
				<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>
				<li><a href="profile.html"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
				<li><a href=""><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
				<li><a href=""><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
				<li><a href=""><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>			
				<li><a href=""><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>	
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
			<a href="#section5">References</a>
        	</div>
        </div>
        <div class="row">
        	<div id="section1" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h3>Personal Details</h3>
				  <form class="form-horizontal">
					  <div class="form-group">
					    <label for="id" class="col-sm-2 control-label">Username</label>
					    <div class="col-sm-10">
					      <p class="form-control-static" name="id">nqdlor001</p>
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="fname" class="col-sm-2 control-label">First Name</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="First_Name">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="lname" class="col-sm-2 control-label">Last Name</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="Last_Name">
					    </div>
					  </div>				  
					  
					  <div class="form-group">
					    <label for="Occupation" class="col-sm-2 control-label">Occupation</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="Occupation">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="Occupation" class="col-sm-2 control-label">Company</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="Occupation" placeholder="Company / Institution">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="Adress" class="col-sm-2 control-label">Address</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="Address_Line1">
					    </div>
					  </div>
					  <div class="form-group">
					  	<label for="Adress" class="col-sm-2 control-label"></label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="Address_Line2">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="City" class="col-sm-2 control-label">City</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="City">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="Country" class="col-sm-2 control-label">Country</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="Country">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="Postal_Code" class="col-sm-2 control-label">Postal Code</label>
					    <div class="col-sm-10">
					      <input type="number" class="form-control input-box" name="Postal_Code">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="Phone" class="col-sm-2 control-label">Phone</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" name="Phone">
					    </div>
					  </div>
					  <div class="form-group">
					    <label for="Email" class="col-sm-2 control-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control input-box" id="email">
					    </div>
					  </div>

					</form>
			</div>
        </div>
        <div class="row">
        	<div id="section2" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Education</h1>
			    <form class="form-horizontal">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Degree</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="inputEmail3" >
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Major</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="Major">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Year</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="Year">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="email">
				    </div>
				  </div>
				  
				</form>
			</div>
        </div>
        <div class="row">
        	<div id="section3" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Experience</h1>
			    <form class="form-horizontal">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Current Job</label>
				    <div class="col-sm-10">
				      <input type="email" class="form-control input-box" id="CurrJob">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Other job</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="OtherJob">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Year</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="Year">
				    </div>
				  </div>
				</form>
			</div>
        </div>
        <div class="row">
        	<div id="section4" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Skills</h1>
			    <form class="form-horizontal">
				  <div class="form-group">
				    <label class="sr-only" for="inputHelpBlock">Input with help text</label>
		        <div class="col-sm-10">
					<input type="text" id="inputHelpBlock" class="form-control input-box" aria-describedby="helpBlock">
								
					<span id="helpBlock" class="help-block">Enter programming language</span>
				</div>				
				    </div>
				  <div class="form-group">
				    <label class="sr-only" for="inputHelpBlock">Input with help text</label>
						<div class="col-sm-10">
							<input type="text" id="inputHelpBlock" class="form-control input-box" aria-describedby="helpBlock">
										
							<span id="helpBlock" class="help-block">Enter programming language</span>
						</div>
				  </div>
				  <div class="form-group">
				    <label class="sr-only" for="inputHelpBlock">Input with help text</label>
					    <div class="col-sm-10">
						<input type="text" id="inputHelpBlock" class="form-control input-box" aria-describedby="helpBlock">
									
						<span id="helpBlock" class="help-block">Enter programming language</span>
					</div>
				  </div>
				  <div class="form-group">
				    <label class="sr-only" for="inputHelpBlock">Skill or Programming Language</label>
					    <div class="col-sm-10">
						<input type="text" id="inputHelpBlock" class="form-control input-box" aria-describedby="helpBlock">
									
						<span id="helpBlock" class="help-block">Skill or Programming Language(optional)</span>
					</div>
				  </div>
				  <div class="form-group">
				    <label class="sr-only" for="inputHelpBlock">Skill or Programming Language(optional)</label>
					    <div class="col-sm-10">
						<input type="text" id="inputHelpBlock" class="form-control input-box" aria-describedby="helpBlock">
									
						<span id="helpBlock" class="help-block">Skill or Programming Language(optional)</span>
					</div>
				  </div>

				</form>
			</div>
        </div>
        <div class="row">
        	<div id="section3" class="col-md-10 col-md-offset-1 col-sm-12 container-fluid">
			    <h1>Referees</h1>
			    <form class="form-horizontal">
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
				    <div class="col-sm-10">
				      <input type="email" class="form-control input-box" id="CurrJob">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="OtherJob">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Name</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="Year">
				    </div>
				  </div>
				  <div class="form-group">
				    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
				    <div class="col-sm-10">
				      <input type="text" class="form-control input-box" id="OtherJob">
				    </div>
				  </div>
				</form>
			</div>
        </div>
	</div>
</body>
</html>

