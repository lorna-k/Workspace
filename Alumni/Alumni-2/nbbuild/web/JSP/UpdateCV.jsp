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
    <% 
            Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

            Statement statement = connection.createStatement() ;
            
            String uid = request.getSession().getAttribute("currentUserID")+"";
            
            ResultSet resultset = statement.executeQuery("SELECT * from CVs WHERE ID = '"+uid+"'") ; 
            resultset.next();
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
                
                String highestDegree = resultset.getString(12);
                String inst1 = resultset.getString(13);
                String major1 = resultset.getString(14);
                String major2 = resultset.getString(15);
                String gradYear = resultset.getString(16);
                String school = resultset.getString(17);
                String schoolYear = resultset.getString(18);
                String job1 = resultset.getString(19);
                String job1Company = resultset.getString(20);
                String job1Year = resultset.getString(21);
                String job2 = resultset.getString(22);
                String job2Company = resultset.getString(23);
                String job2Year = resultset.getString(24);
                String skill1 = resultset.getString(25);
                String skill2 = resultset.getString(26);
                String skill3 = resultset.getString(27);
                String skill4 = resultset.getString(28);
                String skill5 = resultset.getString(29);
                String refName1 = resultset.getString(30);
                String refEmail1 = resultset.getString(31);
                String refName2 = resultset.getString(32);
                String refEmail2 = resultset.getString(33);
            
        %>
                        <div class="profile-photo">
                            <img class="cv-photo" src="../default-profile.png">
                        </div>
                        <label class="name-label"><%=fname%>  <%=lname%></label>
                        <address>
                          <a href="mailto:<%=email%>"><%=email%></a>
                      </address>

                        <div class="personal-details">
                            <label ><%=occupation%></label><br>
                        </div>
                        <div>
                            <address>
                              <strong><%=currentCompany%></strong><br> <!-- company/institution -->
                              <%=address1%><br> <!-- adressline1 -->
                              <%=address2%><br>                      <!-- addressLine2 -->
                             <%=city%><br>
                              <%=postalCode%><br>
                              <abbr title="Phone">P:</abbr> <%=phone%>
                          </address>
                      </div>
                      
<!--                  <a  href="UpdateProfile.jsp" class="btn btn-default navbar-btn">Update Profile</a>-->

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
              <input name="highestDegree" value="<%=highestDegree%>" type="text" class="input-box"><br>
              Major<br>
              <input type="text" value="<%=major1%>" name="major1" class="input-box"><br>
              2nd Major (optional)<br>
              <input name="major2" value="<%=major1%>" type="text" class="input-box"><br>
              Institution<br>
              <input name="inst1" value="<%=inst1%>" type="text" class="input-box"><br>
              Year of Graduation<br>
              <input name="gradYear" value="<%=gradYear%>" class="input-box"><br>
              High School Attended<br>
              <input name="school" value="<%=school%>" type="text" class="input-box"><br>
              Matric Year<br>
              <input type="text" name="schoolYear" value="<%=schoolYear%>" class="input-box"><br>
                                                    
          </div>
          <div id="section2" class="container-fluid">
              <h3 class="cv-section">Work Experience</h3>
              Job Title<br>
              <input type="text" name="job1" value="<%=job1%>" class="input-box"><br>
              Company Name or Institution<br>
              <input type="text" name="job1Company" value="<%=job1Company%>" class="input-box"><br>
              Year <br>
              <input type="text" name="job1Year" value="<%=job1Year%>" class="input-box"><br>
              Job Title<br>
              <input type="text" name="job2" value="<%=job2%>" class="input-box"><br>
              Company Name or Institution<br>
              <input name="job2Company" value="<%=job2Company%>" type="text" class="input-box"><br>
              Year <br>
              <input name="job2Year" value="<%=job2Year%>" type="text" class="input-box"><br>
                                 
          </div>
        <div id="section3" class="container-fluid">
         <h3 class="cv-section">Skills</h3>
         Enter a list of skills you have obtained e.g.(C++, Java, Python)
         <ol>
             <li><input type="text" name="skill1" value="<%=skill1%>" class="input-box"> </li>
             <li><input type="text" name="skill2" value="<%=skill2%>" class="input-box"></li>
             <li><input type="text" name="skill3" value="<%=skill3%>" class="input-box"></li>
             <li><input type="text" name="skill4" value="<%=skill4%>" class="input-box"></li>
             <li><input type="text" name="skill5" value="<%=skill5%>" class="input-box"> </li>
         </ol>        
     </div> 
     <div id="section4" class="container-fluid">
        <h3 class="cv-section">References</h3>
        Reference Name<br>
        <input type="text" name="refName1" value="<%=refName1%>" class="input-box"><br>
        Email<br>
        <input type="email" name="refEmail1" value="<%=refEmail1%>" class="input-box"><br>
        Reference Name<br>
        <input type="text" name="refName2" value="<%=refName2%>" class="input-box"><br>
        Email<br>
        <input type="email" name="refEmail2" value="<%=refEmail2%>" class="input-box"><br>
        <button style="border: 2px solid #D84D0A; font-size:15px; border-radius:3px; margin-top:5px;" type="submit">Save changes</button>
     </div> 
     

</div>
</form>
</div>
</div>
</div>
</div>
</div>