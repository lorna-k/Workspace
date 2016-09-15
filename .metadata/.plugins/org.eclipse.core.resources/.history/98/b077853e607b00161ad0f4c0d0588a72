

<%-- 
    Document   : AllPost
    Created on : Sep 1, 2016, 10:29:40 PM
    Author     : Skhumbuzo
--%>

<%@ page import="java.sql.*" %>
<%@ page import="dao.DataAccess" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>

<HTML>
    <HEAD>
        <TITLE>Pending Users </TITLE>
    </HEAD>

    <BODY >
        <H1 align="center">System Users</H1>

        <% 
            Connection connection = DriverManager.getConnection("jdbc:mysql://137.158.160.145:3306/ngwphu001", "ngwphu001", "eupheyei");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
            statement.executeQuery("select * from Users") ; 
        %>
        <div align="center">
			<form action="${pageContext.request.contextPath}/ProcessRequest" method="post">
			
		        <TABLE BORDER="1">
		            <TR>
		                <TH>ID</TH>
		                <TH>Name</TH>
		                <TH>Surname</TH>
		                <TH>Email</TH>
		                <TH>Password (hidden)</TH>
		                <TH>Account Type</TH>
                                 <TH>Delete User</TH>
		            <!--<TH>Accept</TH>
		                <TH>Reject</TH>  --> 
		            </TR>
		            <% while(resultset.next())
		            { 
		            	String id=resultset.getString(1);
		            	DataAccess da=new DataAccess();
		            %>
		            <TR>
		                <TD> <%= resultset.getString(1) %></TD>
		                <TD> <%= resultset.getString(2) %></TD>
		                <TD> <%= resultset.getString(3) %></TD>
		                <TD> <%= resultset.getString(4) %></TD>
		                <TD> ****************</TD>
		                <TD> <%= resultset.getString(6) %></TD>
                                <TD><input type="submit" name="delete" value="<%=id%>" style="width:100%" /></TD>
		            <!--<TD><input type="submit" name="accept" value="<%=id%>" style="width:100%" /></TD>
		                <TD><input type="submit" name="reject" value="<%=id%>" style="width:100%" /></TD>-->
		            </TR>
		            <% } %>
		        </TABLE>
		        
	        </form>
	        
	        <ul style="list-style: none;">
	        	<li><strong style="font-size:20px">View Tables</strong></li>
	        	<li><a href="PendingUsers.jsp">Pending Users</a></li>
	        	<li><a href="RejectedUsers.jsp">Rejected Users</a></li>
	        </ul>
	         
	        
        </div>
         
             
             
    </BODY>
</HTML>

