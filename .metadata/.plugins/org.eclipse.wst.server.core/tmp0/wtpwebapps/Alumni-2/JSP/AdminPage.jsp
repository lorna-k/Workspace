<%-- 
    Document   : AdminPage
    Created on : 13 Sep 2016, 8:18:23 PM
    Author     : Lorna Nqodi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
    </head>
    <body>
        
        Welcome ${Username}</br>
        Tables </br>
        <a href="Feed.jsp">Feed</a></br>
        <a href="PendingUsers.jsp">Pending Users</a></br>
        <a href="RejectedUsers.jsp">Rejected Users</a></br>
        <a href="SystemUsers.jsp">System Users</a></br>
        
        <form action="Logout" method="post">
            Logout <input type="submit" value="Logout"/>
        </form>
        
    </body>
</html>