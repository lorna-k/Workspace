<%-- 
    Document   : UpdateCV
    Created on : 19 Sep 2016, 9:37:34 PM
    Author     : Lorna Nqodi
--%>
    <%@page import="db.DBUtils"%>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@ page language="java"%>
    <%@ page import = "java.io.*" %>
    <%@ page import = "dao.*" %>
    <%@ page import="java.sql.*" %>

    <%-- <jsp:useBean id="photo" class="dao.Images" scope="session" /> --%>
    <!DOCTYPE html>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update CV</title>
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
    </head>
    <body>
        <div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
            <nav class="clearfix">
                <a href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
                <span class="header-title" style="color:white;">UCT Alumni Network</span>
                <ul class="clearfix">
                    <li><a href="../index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>
                    <li><a href="CV.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Profile</a></li>
                    <li><a href="Forum.jsp"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> Forum</a></li>
                    <li><a href=""><span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Notifications</a></li>
                    <li><a href="People.jsp"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> People</a></li>            
                    <li><a href="../index.html"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Logout</a></li> 
                </ul>
                <a href="#" id="pull">Menu</a>
            </nav>
        </div>
        <div class="site-wrapper">
          <div class="site-center">
            <div class="fixed-wrapper">
              <div class="fixed-content">
                <div class="profile-photo">
                    <img class="cv-photo" src="../default-profile.png">
                </div>
                <label class="name-label">Lorna Nqodi</label>

                <div class="personal-details">
                    <label name="occupation">Student</label><br>
                </div>
                <div>
                    <address>
                      <strong name="company">University of Cape Town</strong><br> <!-- company/institution -->
                      1355 Market Street, Suite 900<br> <!-- adressline1 -->
                      CA 94103<br>                      <!-- addressLine2 -->
                      <abbr title="Phone">P:</abbr> (123) 456-7890
                  </address>
              </div>
              <address>
                  <a name="email" href="mailto:#">nqdlor001@myuct.ac.za</a>
              </address>
                <a  href="UpdateProfile.jsp" class="btn btn-default navbar-btn">Update Profile</a>
          </div>
      </div>
      <div class="content-offset">
          <div class="content-frame"> 
            <div id="header" class="row">
              <div class="header-padding">
                <div class="header-content"> <h1>Curriculum Vitae</h1></div>
            </div>
        </div>

        <div id="content" class="row expand">
            <form method="post" action="../UpdateCV">
          <div class="inner-padding">

            <div id="section1" class="container-fluid">
              <h3 class="cv-section">Education</h3>
              Highest Degree<br>
              <input name="highestDegree" type="text" class="input-box"><br>
              Major<br>
              <input type="text" name="major1" class="input-box"><br>
              2nd Major (optional)<br>
              <input name="major2" type="text" class="input-box"><br>
              Institution<br>
              <input name="inst1" type="text" class="input-box"><br>
              Year of Graduation<br>
              <input name="gradYear" class="input-box"><br>
              High School Attended<br>
              <input name="school" type="text" class="input-box"><br>
              Matric Year<br>
              <input type="text" name="schoolYear" class="input-box"><br>
                                                    
          </div>
          <div id="section2" class="container-fluid">
              <h3 class="cv-section">Work Experience</h3>
              Job Title<br>
              <input type="text" name="job1" class="input-box"><br>
              Company Name or Institution<br>
              <input type="text" name="job1Company" class="input-box"><br>
              Year <br>
              <input type="text" name="job1Year" class="input-box"><br>
              Job Title<br>
              <input type="text" name="job2" class="input-box"><br>
              Company Name or Institution<br>
              <input name="job2Company" type="text" class="input-box"><br>
              Year <br>
              <input name="job2Year" type="text" class="input-box"><br>
                                 
          </div>
        <div id="section3" class="container-fluid">
         <h3 class="cv-section">Skills</h3>
         Enter a list of skills you have obtained e.g.(C++, Java, Python)
         <ol>
             <li><input type="text" name="skill1" class="input-box"> </li>
             <li><input type="text" name="skill2" class="input-box"></li>
             <li><input type="text" name="skill3" class="input-box"></li>
             <li><input type="text" name="skill4" class="input-box"></li>
             <li><input type="text" name="skill5" class="input-box"> </li>
         </ol>        
     </div> 
     <div id="section4" class="container-fluid">
        <h3 class="cv-section">References</h3>
        Reference Name<br>
        <input type="text" name="refName1" class="input-box"><br>
        Email<br>
        <input type="email" name="refEmail1" class="input-box"><br>
        Reference Name<br>
        <input type="text" name="refName2" class="input-box"><br>
        Email<br>
        <input type="email" name="refEmail2" class="input-box"><br>
     </div> 
     <button style="border: 2px solid #D84D0A; font-size:20px; border-radius:3px; margin-top:5px;" type="submit">Update CV</button>

</div>
</form>
</div>
</div>
</div>
</div>
</div>