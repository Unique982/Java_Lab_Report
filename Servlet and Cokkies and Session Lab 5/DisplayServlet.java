/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 *
 * @author Acer
 */
public class DisplayServlet extends HttpServlet {

   
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException {
                try {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
        String sql = "SELECT * FROM employee";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        out.println("<table border='1px solid black'>");
         out.println("<caption>Employee Information</caption>");
        out.println("<tr><th>ID</th><th>Eid</th><th>Name</th><th>Address</th><th>Salary</th></tr>");
        while(rs.next()){
            out.println("<tr>");
            out.println("<td>"+rs.getInt(1)+"</td>");
            out.println("<td>"+rs.getString(2)+"</td>");
            out.println("<td>"+rs.getString(3)+"</td>");
            out.println("<td>"+rs.getString(4)+"</td>");
             out.println("<td>"+rs.getString(5)+"</td>");              
            out.println("</tr>");
        }
            out.println("</table>");
            con.close();  
                } catch (Exception ex) {
             ex.printStackTrace();
        
      }
    }

   
}
