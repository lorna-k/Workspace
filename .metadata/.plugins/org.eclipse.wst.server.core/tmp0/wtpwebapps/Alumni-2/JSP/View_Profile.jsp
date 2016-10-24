<%-- 
    Document   : CV
    Created on : 16 Sep 2016, 3:27:56 PM
    Author     : Lorna Nqodi
    --%>

    <%@page import="db.DBUtils"%>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@ page language="java"%>
    <%@ page import = "java.io.*" %>
    <%@ page import="dao.ImageAccess" %>
    <%@ page import = "dao.*" %>
    <%@ page import="java.sql.*" %>

    <%-- <jsp:useBean id="photo" class="dao.Images" scope="session" /> --%>
    <!DOCTYPE html>
    <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Profile</title>
      <!-- css -->
      <link rel="stylesheet" href="../css/normalize.css">
      <link rel="stylesheet" href="../css/nav_style.css">
      <link rel="stylesheet" href="../css/site_styles.css">
      <link rel="stylesheet" type="text/css" href="../css/cv.css">
      <!-- The fonts-->
      <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
      <link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
      <!-- JQuery -->
      <script src="../jQuery/navigation-script.js"></script>
      <!-- bootstrap -->
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
				
				<li><a href="Notifications.jsp"><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
				<li><a href="People.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>	
				<li><a href="https://drive.google.com/open?id=0B5hfZMerj_ABSks3RXI4RTJvOTg"><span class="glyphicon glyphicon-question-sign" aria-hidden="true"></span> Help</a></li>
				<form id="logout_form" method="post" action="../logout">	
					<li><a href="javascript:{}" onclick="document.getElementById('logout_form').submit(); return false;"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li> 
				</form>
				
                </ul>
          <a href="#" id="pull">Menu</a>
        </nav>
      </div>
      <div class="site-wrapper">
        <div class="site-center">
          <% 
          Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

          Statement statement = connection.createStatement() ;
          
          String u_name = request.getSession().getAttribute("view_name")+"";
          
          ResultSet resultset = statement.executeQuery("SELECT * from CVs WHERE First_Name = '"+u_name+"'") ;  
          resultset.next(); 
          
          byte[] imgData = ImageAccess.displayPhoto(resultset.getString(1));
         
          
          if(imgData==null)
          {
        	  request.getSession().setAttribute("image_status","0");
        	  System.out.println("no image");
        	  
          }
          if(imgData!=null)
          {
        	  request.getSession().setAttribute("image_status","1");
        	  System.out.println("found image");
          }
          
          String imageStatus=request.getSession().getAttribute("image_status")+"";
          %>
          

<div class="fixed-wrapper">
  <div class="fixed-content" style="border-left: 1px solid gray;">
    
    
    <%if(imageStatus.equals("0")){%>
    <div class="profile-photo">
      <img class="cv-photo" src="../default-profile.png">
    </div>
    <%} %>
    
    <%if(imageStatus.equals("1")){%>
     <div class="profile-photo">
      <img class="cv-photo"  src="${pageContext.request.contextPath}/ImageUpload">
    </div>
    <%} %>
    <label class="name-label"><%=resultset.getString(2)%>  <%=resultset.getString(3)%> </label>
    <address>
      <a name="email" href="mailto:<%=resultset.getString(11)%>"><%=resultset.getString(11)%> </a>
    </address>

    <div class="personal-details">
      <label ><%=resultset.getString(4)%></label><br>           <!--occupation-->
    </div>
     
    <div>
      <address>
        <strong><%=resultset.getString(5)%></strong><br> <!-- company/institution -->
        <%=resultset.getString(6)%> <br> <!-- adressline1 -->
        <%=resultset.getString(7)%> <br> <!-- addressLine2 -->
        <%=resultset.getString(8)%> <br>
        <%=resultset.getString(9)%> <br>
        <abbr title="Phone"></abbr> <%=resultset.getString(10)%> 
      </address>
    </div>
                 
    
  </div>
</div>
<div class="content-offset">
  <div class="content-frame"> 
    <div id="header" class="row">
      <div class="header-padding">
        
        
        <div class="header-content"> <h1>Curriculum Vitae</h1>   
        </div>
      </div>
    </div>

    <div id="content" class="row expand">

      <div class="inner-padding">
        

        <div id="section1" class="container-fluid">
          <h3 class="cv-section">Education</h3>
          <!-- degree major 1 major 2 -->
          <p><strong><%=resultset.getString(12) %> <%=resultset.getString(14)%> <%=resultset.getString(15)%></strong> <br>
            <%=resultset.getString(13)%><br>
            <span class="year"><%=resultset.getString(16)%> </span><br> <!--  year --> 
            <p><strong><%=resultset.getString(17)%></strong> <br> <span class="year"><%=resultset.getString(18)%></span> </p>       <!-- high School year -->

          </div>
          <div id="section2" class="container-fluid">
            <h3 class="cv-section">Experience</h3>                     
            <p><strong><%=resultset.getString(19)%></strong> <br>  <!-- job1 -->
              <%=resultset.getString(20)%>  <br> <!-- company1 -->
              <span class="year"><%=resultset.getString(21)%></span>
            </p>               
            
            <p><strong><%=resultset.getString(22)%></strong> <br> <!-- job2 -->
              <%=resultset.getString(23)%>  <br> <!-- company2 -->
              <span class="year"><%=resultset.getString(24)%></span> 
            </p>                               
            
          </div>
          <div id="section3" class="container-fluid">
            <h3 class="cv-section">Skills</h3>
            <span class="skills-btn"><%=resultset.getString(25)%></span>      <!-- skill1 -->
            <span class="skills-btn"><%=resultset.getString(26)%></span>       <!-- skill2 -->
            <span class="skills-btn"><%=resultset.getString(27)%></span>      <!-- skill3 -->
            <span class="skills-btn"><%=resultset.getString(28)%></span>     <!-- skill4 -->
            <span class="skills-btn"><%=resultset.getString(29)%></span>     <!-- skill5 -->
          </div> 
          <div id="section4" class="container-fluid">
            <h3 class="cv-section">References</h3>
            <p><%=resultset.getString(30)%>
              <address>
                <a name="email" href="mailto:#"><%=resultset.getString(31)%></a>
              </address>
              <p><%=resultset.getString(32)%>
                <address>
                  <a name="email" href="mailto:#"><%=resultset.getString(33)%></a>
                </address>
              </div> 
              
            </div>                
          </div>
        </div>
      </div>
      
    </div>
  </div>

</body>
</html>
