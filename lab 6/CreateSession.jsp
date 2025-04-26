<%-- 
    Document   : Example1
    Created on : Apr 16, 2025, 1:07:36 PM
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
        <h1>Create Session</h1>
        <% 
        session.setAttribute("username","RRC");
        out.println("<a href='ReadSession.jsp'>Click Here</a>");
        %>
    </body>
</html>
