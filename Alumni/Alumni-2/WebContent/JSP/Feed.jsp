<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!--|||||||||||||||||| I am sure that we do not have to copy and poster the style tages in everypage  ||||||||||||||||||-->

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta charset="ISO-8859-1">
	<!-- css -->
	<link rel="stylesheet" href="css/normalize.css">
	<link rel="stylesheet" href="css/nav_style.css">
	<link rel="stylesheet" href="css/site_styles.css">
	<link rel="stylesheet" type="text/css" href="css/feed_style.css">
	<!-- font -->
	<link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
	<link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
	<!-- JQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<!-- ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| -->

<title>Feeds</title>
</head>
<body>
	<h1 align="center">Feeds</h1>
	<div align="center">
		<p> <h4> welcome <%= request.getSession().getAttribute("currentUser") %>.!</h4></p>
		<p>You Profile:<a href="../profile.html"><%= request.getSession().getAttribute("currentUser") %></a></p>
	</div>
	
	<!-- |||||||||||||||||||||||||||||||||||||||||||||||||| This is the post uplad section ||||||||||||||||||||||||||||||||||||||||||||||||||-->
	
	<hr/>
	
	<div>
		<div id="text_area"  >
			<textarea class="form-control" id="txt_area" placeholder="type your post caption here" rows="3"   ></textarea>
		</div>
		
		<hr/>
		<div  id="upload_buttons" align="center">
			
				<button type="button" class="btn btn-success" id="post" style="width:200px;">Share!</button>
				<label class="btn btn-primary btn-file" style="width:200px;" id="file_button">
					Upload <input type="file"  id="uploadID" style="display: none;">
				</label>
				
				<!-- <input type="file" /> -->
				<span class='label label-info' id="info"></span>
		
		</div>
	</div>
	<hr/>
	
	<!--||||||||||||||||||||||||||||||||||||||||||||||||||  Closing the post upload setion ||||||||||||||||||||||||||||||||||||||||||||||||||-->
	
</body>
</html>