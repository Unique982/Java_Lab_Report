<%-- 
    Document   : SimpleInerest
    Created on : Apr 16, 2025, 1:16:23 PM
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
        <form action ="" method="POST">
            <label>Enter Principle </label>
            <input type="text" name="p">
            <br> <br>
              <label>Enter Rate </label>
            <input type="text" name="r">
            <br> <br>
              <label>Enter Time </label>
            <input type="text" name="t">
            <br> <br>
            <input type="submit" name="submit" value="SI">
        </form>
       <%
        if(request.getParameter("submit")!=null){
           Double p = Double.parseDouble(request.getParameter("p"));
           Double r = Double.parseDouble(request.getParameter("r"));
           Double t = Double.parseDouble(request.getParameter("t"));
           Double si = (p*t*r)/100;
           out.println("<h1> The Simple Interest is = " +si+ "</h1>");
           }   
       %>
    </body>
</html>
