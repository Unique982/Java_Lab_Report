/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

/**
 *
 * @author Acer
 */
import java.sql.*;
public class ScrollableUpdating {
     public static void main(String [] args) throws Exception{
          Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/account", "root", "");
        String sql = "SELECT * FROM student";
        PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
         ResultSet rs = ps.executeQuery();
        rs.absolute(1);
       rs.updateString("email", "updatingemail@gmail.com");
       rs.updateRow();
         rs.close();
            ps.close();
            con.close();
        }

       
}