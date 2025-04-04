
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
public class InsertServlet extends HttpServlet { 
   @Override
   public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

            try {
                res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        int eid = Integer.parseInt(req.getParameter("eid"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        int salary = Integer.parseInt(req.getParameter("salary"));
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/company", "root", "");
                String sql = "INSERT INTO employee(eid,name,address,salary) VALUES(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1,eid);ps.setString(2,name); ps.setString(3,address); ps.setInt(4,salary);
                int row = ps.executeUpdate();
                if(row>0)
                    out.println("<p>Insert Successfully");
                else
                    out.println("<p>Error Isnert</p>");
                
            } catch (Exception ex) {
            }
         
        }
        
        
    }




