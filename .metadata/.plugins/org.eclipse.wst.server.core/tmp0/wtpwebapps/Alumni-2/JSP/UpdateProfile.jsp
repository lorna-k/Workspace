<%-- 
    Document   : UpdateProfile
    Created on : 19 Sep 2016, 4:09:57 PM
    Author     : Lorna Nqodi
    --%>
    <%@page import="db.DBUtils"%>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@ page language="java"%>
    <%@ page import = "java.io.*" %>
    <%@ page import = "dao.*" %>
    <%@ page import="java.sql.*" %>

    <!DOCTYPE html>
    <html>
    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Update Profile</title>
      <!-- css -->
      <link rel="stylesheet" href="../css/normalize.css">
      <link rel="stylesheet" href="../css/nav_style.css">
      <link rel="stylesheet" href="../css/site_styles.css">
      <link rel="stylesheet" type="text/css" href="../css/updateProfile.css">
      <!-- The fonts-->
      <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
      <link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
      <!-- JQuery -->
      <script src="../jQuery/navigation-script.js"></script>
      <!-- bootstrap -->
      <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
      <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <!--upload link-->
      <script>
          $(function(){
            $("#upload_link").on('click', function(e){
                e.preventDefault();
                $("#upload:hidden").trigger('click');
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
            <li><a href="Forum.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span> Home</a></li>
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
            <div class="fixed-content" style="border-left: 1px solid gray;">
              <% 
              Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

              Statement statement = connection.createStatement() ;
              
              String uid = request.getSession().getAttribute("currentUserID")+"";
              
              ResultSet resultset = statement.executeQuery("SELECT * from CVs WHERE ID = '"+uid+"'") ; 
              if(resultset.next()){
              String fname = resultset.getString(2);
              String lname = resultset.getString(3);
              String occupation = resultset.getString(4);
              String currentCompany = resultset.getString(5);
              String address1 = resultset.getString(6);
              String address2 = resultset.getString(7);
              String city = resultset.getString(8);
              String postalCode = resultset.getString(9);
              String phone = resultset.getString(10);
              String email = resultset.getString(11); 
              %>
              
                <form method="post" action="../ImageUpload" enctype="multipart/form-data">
                    <input id="upload" type="file" name="photo"/>
                    <input  type="button" id="upload_link" value="Change photo">
                    <input type="submit" value="Save">
                </form>
                <div class="profile-photo">
                    <img class="cv-photo" src="${pageContext.request.contextPath}/ImageUpload">
                </div>
              <form  action="../UpdateProfile" method="post" class="update-form">
                First Name<br>
                <input name="fname" value="<%=fname%>" class="input-box"><br>
                Last  Name<br>
                <input name="lname" value="<%=lname%>" class="input-box"><br>

                Occupation<br>
                <input name="occupation" value="<%=occupation%>" class="input-box"><br>

                <h5 style="text-decoration:underline;">Work Details</h5>
                Company or Institution<br>
                <input name="currentCompany" value="<%=currentCompany%>" class="input-box"><br> <!-- company/institution -->
                Address Line 1<br>
                <input name="address1" value="<%=address1%>" class="input-box"><br> <!-- adressline1 -->
                Address Line 2<br>
                <input name="address2" value="<%=address2%>" class="input-box"><br>                      <!-- addressLine2 -->
                City<br>
                <input name="city" value="<%=city%>" class="input-box"><br>
                Postal Code<br>
                <input name="phone" value="<%=postalCode%>" class="input-box"><br>
                Phone<br>
                <input name="postalCode" value="<%=phone%>" class="input-box"><br>
                Email<br>
                <input type="email" value="<%=email%>" name="email" class="input-box"><br>

                <button style="border: 2px solid #D84D0A; font-size:10px; border-radius:3px; margin-top:5px;" type="submit">Save changes</button>
              </form>
              
            </div>
          </div>
          <div class="content-offset" style="border-left: 1px solid gray; border-right: 1px solid gray;">
            <div class="content-frame"> 
              <div id="header" class="row">
                <div class="header-padding">
                  <div class="header-content"> <h1>Curriculum Vitae</h1></div>
                </div>
              </div>

              <div id="content" class="row expand">
                <div class="inner-padding">  
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
                        <span class="skills-btn"><%=resultset.getString(25)%></span>           <!-- skill1 -->
                        <span class="skills-btn"><%=resultset.getString(26)%></span>           <!-- skill2 -->
                        <span class="skills-btn"><%=resultset.getString(27)%></span>            <!-- skill3 -->
                        <span class="skills-btn"><%=resultset.getString(28)%></span>         <!-- skill4 -->
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
                        <% } %>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </body>
          </html>
