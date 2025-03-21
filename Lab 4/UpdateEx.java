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
public class UpdateEx {
    public static void main(String [] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/account", "root", "");
        Statement st = con.createStatement();
        String sql = "UPDATE student SET name ='Testing' WHERE id = 1";

        int row = st.executeUpdate(sql);
        if(row>0)
            System.out.println(row+"Row Update Successfully");
        else
            System.out.println(" Update Error");
        con.close();
        
    }    
}
