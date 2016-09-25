<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="dao.DataAccess" %>
<%@ page import="servlet.Post" %>
<%@ page import="java.io.*"%>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				<li><a href="../profile.html"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
				<li><a href="Feed.jsp"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
				<li><a href=""><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
				<li><a href=""><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>			
				<li><a href="../index.html"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li>	
			</ul>
			<a href="#" id="pull">Menu</a>
		</nav>
	</div>
	 
	<div class="content" style="position:relative; top:75px">
		<div class="container ">
			<div class="row">
				<div class="posts-section col-md-7 col-md-offset-1 col-xs-6 col-xs-offset-1"> 
				
				
				<!-- ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| -->
					
					
			
					<div align="center">
						 <h4 style="font-family:Aria"> welcome <%= request.getSession().getAttribute("currentUserName") %> .!</h4>
					</div>
					
					<!-- |||||||||||||||||||||||||||||||||||||||||||||||||| This is the post uplad section ||||||||||||||||||||||||||||||||||||||||||||||||||-->
					
					<hr/>
					
					<div>
						<form method="post" action="../Post" >
							
								<textarea class="form-control" id="txt_area" name="caption" placeholder="type your post caption here" rows="3"   ></textarea>
							
							
							<hr/>
						
							<div  id="upload_buttons" align="center">
								
									<button type="submit" class="btn btn-primary" name="post" value="posting" style="width:200px;">Post!</button>
									<!-- <label class="btn btn-primary btn-file" style="width:200px;" id="file_button">
										Upload <input type="file" name="photo" id="uploadID" onchange="changed()" style="display: none;">
									</label>
							         -->
							
							</div>
							
							<div>
									
								<%
								    
								Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
								
						        Statement statement = connection.createStatement() ;
								ResultSet resultset =  statement.executeQuery("select * from Posts ORDER BY PostId desc") ;
								
								  
								while(resultset.next())
								{
								%>
								
								 <!-- Name heading label of the post owner -->
								 <div   id="pic_name" >
								     <div align="center"  class=" name" >
								     	<%=resultset.getString(2)+" "+resultset.getString(3)%>
								     </div>
								 </div>
								 
								 
								<!-- Post message -->
								<div  align="center" class="message_frame "  >
									<p ><%=resultset.getString(4)%></p>
								</div>
								<div align="center" class=" comment" >
									<div  class="likes col-md-2 col-xs-4" style="border:2px solid black;"><strong style="color:red; margin-right: 5px;">Likes</strong><%=resultset.getString(6)%></div>
									<div  class="col-md-7 col-xs-5 comments" style="border:2px solid #346257;">Comment Here!</div>
									<div  style="border:2px solid black" class="col-md-offset-9 col-xs-offset-9"  > <small style="color:red;"><%=resultset.getString(1)%></small></div>
								</div>
								
								
							    <div   align="center" class="comment-base animated zoomIn" >
									
									
									<ol class="list-group ">
											
											<%
											
											Connection connection2 = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
											
									        Statement statement2 = connection2.createStatement() ;
											ResultSet resultset2 =  statement2.executeQuery("select * from Comments WHERE ID = '"+resultset.getString(1)+"' ORDER BY ID desc") ;
											while(resultset2.next())
											{
												if(resultset.getString(1).equals(resultset2.getString(1)) )
												{
													%>
													<li class="list-group-item" >
														<div align="center">
															<p><strong><i style="color:blue"><%=resultset2.getString(2)+" "+resultset2.getString(3)%></i></strong></p>
															<p><%=resultset2.getString(4)%></p>
															
														</div>
													</li>
													<%
												}
											 }
											%>
											
									</ol>
										<textarea style="margin-bottom:10px" placeholder="Comment here" rows="2" class="form-control" name="<%=resultset.getString(1)%>"></textarea>
										<button type="submit" name="sendComment" value="<%=resultset.getString(1)%>" class="btn btn-primary" style="width:150px">Send</button>
								</div> 
				
								 
								<%
								}
								%>
							
							</div>
							
						</form>
					</div>
					<hr/>
				
					<!--||||||||||||||||||||||||||||||||||||||||||||||||||  Closing the post upload setion ||||||||||||||||||||||||||||||||||||||||||||||||||-->
			
			       </div>
				    <div class="feed-section col-md-3 col-md-offset-1 col-xs-3 col-xs-offset-1" style="background-color: whitesmoke;">
						<div class="fb-feed" style="margin-bottom:20px;">
							<iframe src="https://www.facebook.com/plugins/page.php?href=https%3A%2F%2Fwww.facebook.com%2FNombulelo-senior-secondary-school-236973209727154%2F&tabs=timeline&width=213&height=300&small_header=false&adapt_container_width=true&hide_cover=false&show_facepile=true&appId" width="213" height="300" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true"></iframe>
						</div>
						<div class="twitter-feed">
							<a class="twitter-timeline"  href="https://twitter.com/search?q=UCT%20Science" data-widget-id="774076283923816448"></a>
						</div>
					</div>
				
			</div>
		</div>
     </div>   
	
	
	
</body>
</html>