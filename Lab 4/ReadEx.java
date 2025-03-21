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
public class ReadEx {
    public static void main(String [] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/account", "root", "");
        Statement st = con.createStatement();
        String sql = "SELECT * FROM student";
      ResultSet rs = st.executeQuery(sql);
        System.out.println("id\tname\ttemail\tsem");
        while(rs.next()){
            System.out.println(rs.getInt(1)+ "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
        }
            
        con.close();
                   
    }
   
    
}
