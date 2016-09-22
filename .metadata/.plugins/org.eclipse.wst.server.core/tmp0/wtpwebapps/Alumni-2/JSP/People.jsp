<%-- 
    Document   : People
    Created on : 16 Sep 2016, 3:53:14 PM
    Author     : Lorna Nqodi
--%>

   <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
    <%@ page import="dao.DataAccess" %>
    <%@ page import="servlet.Post" %>
    <%@ page import="java.io.*"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

    <% Class.forName("com.mysql.jdbc.Driver"); %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html lang="en">
    <head>
        <title>People</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta charset="ISO-8859-1">
        <!-- css -->
        <link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/nav_style.css">
        <link rel="stylesheet" href="../css/site_styles.css">
        
       
        <link rel="stylesheet" type="text/css" href="../css/forum.css">
        <!-- The fonts-->
        <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700' rel='stylesheet' type='text/css'>
        <link href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Roboto:100" rel="stylesheet">
        <!-- JQuery -->
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
        <script> 
        $('#nav').affix({});
        </script>
    </head>
    <body>
        <div class="nav-container" style="position:fixed; top:0; left:0; right:0; z-index:1">
            <nav class="clearfix">
                <a style="padding-top:10px" href="../index.html" class="nav-title"><img class="nav-logo" src="../uct-logo.png"></a>
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
        <div class="page">
            <div class="wrapper">
                <div class="content-wrapper">
                    <div class="content">
                    <form action="../search" method="post" class="form-group" style="width: 100%;">
                
                		<select class="marshal_details" id="search-dropdown" name="searcher"> 
							<option value="" class="" disabled="" selected="">-Search people by-</option>
							<option value="ALL">All</option> 
							<option value="First_Name">First Name</option>
							<option value="Last_Name">Last Name</option>
							<option value="City">City</option> 
							<option value="Highest_Degree_year">Recent grad year</option> 
							<option value="Current_Company">Company name</option>
							<option value="Occupation">Occupation</option>	 
							<option value="Major1">Major</option>
													
						</select> 

			
						<input id="search-text" type="text" name="search" placeholder="Search..">
						<button class="icon" id="search-button" name="submit" type="submit"><i class="glyphicon glyphicon-search" style="margin-top: 3px;"></i></button>
						
						</form>
                        <form method="post" action="../search">
                           
                            <div class="feeds">
                                <!-- Opening connection to data in database -->
                            <%
                                Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");
                                
                                Statement statement = connection.createStatement() ;
                                String search_1= request.getSession().getAttribute("searcher")+"";
                                		//
                                String search_2 =request.getSession().getAttribute("search")+"";
                                		//
                               
                                
                                		//request.getSession().getAttribute("search").toString();
                              
                                		//request.getSession().getAttribute("search").toString();
                                //request.getSession().getAttribute("searcher").toString();
                                ResultSet resultset = null;
                                int ind_Fn = 2;
                                resultset =  statement.executeQuery("Select * from CVs Where lower(concat(ID,First_Name,Last_Name,Highest_Degree_Year,Highest_Degree,Major1,Major2,City,Occupation)) like lower('%"+search_2+"%')") ;
                                /*if( search_1.equalsIgnoreCase("ALL") ){
                                	 resultset =  statement.executeQuery("Select * from CVs Where lower(concat(ID,First_Name,Last_Name,Major1,Major2,City)) like lower('%"+search_2+"%')") ;
                                	 //resultset.next();
                                	 //System.out.println(resultset.getString(1));
                                }
                                 else if((search_1.equalsIgnoreCase("First_Name")||search_1.equalsIgnoreCase("Last_Name")||search_1.equalsIgnoreCase("Occupation")||search_1.equalsIgnoreCase("City")) && search_2!="")
                                {
                                	
                                	resultset =  statement.executeQuery("Select * from CVs Where lower(concat(ID,First_Name,Last_Name,Major1,Major2,City)) like lower('%"+search_2+"%')") ;

                                	//resultset.next();
                                } 
                                 else{
                                	resultset = null;
                                } */
                              
                                //else if(search_1!=null && (search_1!=null || search_2!=null)){
                                	// resultset =  statement.executeQuery("SELECT * FROM CVs WHERE "+"City"+" = '"+"Cape Town"+"'") ;
                                //}
                                
                                
                                //"+ request.getSession().getAttribute("searcher").+" ='"+request.getSession().getAttribute("search")+"'
                                	if((search_1.equalsIgnoreCase("ALL")||search_1.equalsIgnoreCase("Highest_Degree_Year")||search_1.equalsIgnoreCase("Highest_Degree")||search_1.equalsIgnoreCase("First_Name")||search_1.equalsIgnoreCase("Last_Name")||search_1.equalsIgnoreCase("Occupation")||search_1.equalsIgnoreCase("City")) && resultset.isBeforeFirst()){	
                                	 while(resultset.next())
                                     {
                                		 
                                     %>
                                     <div class="posts">
                                         <div class="editor">
                                             <div class="editor-header">
                                             <!-- Display name of user who posted-->
                                             <a href=""> <%=resultset.getString(2)+" "+resultset.getString(3)%></a> 
                                             <!-- <span>Posted <%=resultset.getString(1)%></span> -->
                                             </div>
                                             <div class="post-body message_frame" style="color: grey;">
                                                 <p>Occupation: <%=resultset.getString(4)%></p>
                                                 <p>Highest Degree: <%=resultset.getString(12)%></p>
                                                 <p>Current City: <%=resultset.getString(8)%></p>
                                             </div>

                                         </div>
                                     </div>
                                     
                                      <%}
                                	}
                                 else{%>
                                 
                                	 <div class="posts">
                                     <div class="editor">
                                         <div class="editor-header">
                                         <!-- Display name of user who posted-->
                                         
                                         </div>
                                         <div class="post-body message_frame" style="color: grey;">
                                             <p>Search "<%=search_2%>" Not found</p>
                                             <p>Enter a Valid search value</p>
                                            
                                         </div>

                                     </div>
                                 </div>
                                 		 
                                     
                                	 
                                 <%}%>
                                     <!-- Closing connection to database -->
                                  
                                
                                
                                
                            </div>
                        </form>                        
                    </div>
                </div>

    </body>
</html>
