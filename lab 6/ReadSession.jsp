<%-- 
    Document   : ReadSession
    Created on : Apr 17, 2025, 6:57:45 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Read Session</h1>
        <% String username = (String) session.getAttribute("username"); 
    out.println("<h2>Session Value="+ username +"</h2>");
        
        
        %>
    </body>
</html>
