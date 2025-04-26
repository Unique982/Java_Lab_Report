<%-- 
    Document   : Example6
    Created on : Apr 17, 2025, 8:34:22 AM
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
        <h1>Multiplication and Division</h1>
        <form action="" method="POST">
            <label>Enter First Name</label>
            <input type="text" name="fnum">
            <label> Enter Second Number</label>
            <input type="text" name="snum">   
            <input type="submit" name="submit" value="submit">
        </form>
        
        <% if(request.getParameter("submit")!=null){ 
         Double fnum= Double.parseDouble(request.getParameter("fnum"));
         Double snum = Double.parseDouble(request.getParameter("snum"));
            
            }%>
        
    </body>
</html>
