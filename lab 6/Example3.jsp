<%-- 
    Document   : Example3
    Created on : Apr 17, 2025, 7:18:58 AM
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
      <h1>Employee Insert From</h1>
        <fieldset>
            <form action="" method="POST">
             
                <legend>Enter EId:</legend>
                <input type="number" name="eid">
                <br><br>
                  <legend>Enter Name:</legend>
                <input type="text" name="name">
                <br><br>
                  <legend>Enter Address:</legend>
                <input type="text" name="address">
                <br><br>
                  <legend>Enter Salary:</legend>
                <input type="text" name="salary">
                <br><br>
                <input type="submit" name="add" value="Add">
            </form>
        </fieldset>
      <%@page import="java.sql.*" %>
<%
 try{if(request.getParameter("add")!=null){
       Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
      int eid = Integer.parseInt(request.getParameter("eid"));
       String name = request.getParameter("name");
       String address = request.getParameter("address");
       int salary = Integer.parseInt(request.getParameter("salary"));
       
              
              String sql = "INSERT INTO employee(eid,name,address,salary) VALUES(?,?,?,?)";
              PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1,eid);ps.setString(2,name);ps.setString(3,address);ps.setInt(4,salary);
               int row = ps.executeUpdate();
               if(row>0){
               out.println("<h2>Insert Successfully</h2>");
          } else{
               out.println("<h2>Insert Error</h2>");
          }
          ps.close();
          con.close();
          }
          }catch(Exception ex){
       ex.printStackTrace();
    }
    
%>
<hr>
  <h3>Employee Information </h3>
<%
 try{if(request.getParameter("add")!=null){
       Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
              String sql = "SELECT * FROM employee";
              PreparedStatement ps = con.prepareStatement(sql); 
              ResultSet rs= ps.executeQuery();
%>
          
            <table border="1">
                <tr>
                    <th>S.N</th>
                    <th>Eid</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>Salary</th>
                    <% while(rs.next()){
                    out.println("<tr><td>"+rs.getInt(1) + "</td>");
                    out.println("<td>"+rs.getString(2) + "</td>");
                    out.println("<td>"+rs.getString(3) + "</td>");
                    out.println("<td>"+rs.getString(4) + "</td>");
                    out.println("<td>"+rs.getString(5) + "</td>");
                    
                    out.println("</tr>"); 
                        }
                        out.println("</table>");        
                       con.close();
                   }
}
                   catch(Exception ex){
                  ex.printStackTrace();
}


%>
               
                   
    </body>
</html>
