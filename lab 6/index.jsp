
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% String campus = "Tribhuvan University";
         for(int i = 1; i<=5;i++){
         out.println("<h2>" + campus + "<h2>");
            } %>
    </body>
</html>
