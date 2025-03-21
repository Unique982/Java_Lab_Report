/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;
import java.sql.*;
public class ScrollableResultSet {
     public static void main(String [] args) throws Exception{
          Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/account", "root", "");
        String sql = "SELECT * FROM student";
        PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
         ResultSet rs = ps.executeQuery();
        rs.first();
        System.out.println("ID\tName\tEmail");
       System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
          rs.close();
            ps.close();
            con.close();

        }

       
}

