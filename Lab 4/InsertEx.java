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
public class InsertEx {
    public static void main(String [] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/account", "root", "");
        Statement st = con.createStatement();
        String sql = "insert into student(name,email,sem,password) values('Sita','sita@gmail.com','6sem','1111')";
        int row = st.executeUpdate(sql);
        if(row>0)
            System.out.println(row+"Row Insert Successfully");
        else
            System.out.println("Error");
        con.close();
                   
    }
   
    
}
