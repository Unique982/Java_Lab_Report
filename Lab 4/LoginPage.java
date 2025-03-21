/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class LoginPage  implements ActionListener {
   JFrame f ;
   JLabel l1, l2, l3;
   JTextField t1, t2;
   JButton login, cancel, clear;
   public LoginPage(){
        f = new JFrame("Login Page");
        l1 = new JLabel("Login Page");
        l2 = new JLabel("User Id");
        l3 = new JLabel("Password");
        t1 = new JTextField();
        t2=new JTextField();
        login = new JButton("Login");
        cancel = new JButton("Cancel");
        clear = new JButton("clear");
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
         
        l1.setBounds(150, 50,150,20);
        l2.setBounds(50,100,100,20);
        t1.setBounds(150,100,150,30);
        l3.setBounds(50,150,100,20);
        t2.setBounds(150,150,150,30);
       login.setBounds(150,200,100,20);
       cancel.setBounds(50,250,100,20);
       clear.setBounds(250,250,100,20);
       
       f.add(l1);f.add(l2);f.add(l3);
       f.add(t1);f.add(t2);
       f.add(login);f.add(cancel);f.add(clear);
       
       login.addActionListener(this);
       clear.addActionListener(this);
       cancel.addActionListener(this);
   }
   @Override
       public void actionPerformed(ActionEvent e) {
           if(e.getSource()==login){
               try{
             Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/account", "root", "");
        String id = t1.getText();
        String password = t2.getText();
          Statement st = con.createStatement();
          String sql = "SELECT * FROM student WHERE id = '"+ id +"'  AND password= '"+ password +"'"; 
          ResultSet rs = st.executeQuery(sql);
          if(rs.next()){
              JOptionPane.showMessageDialog(f,"Login Successfully");
          }
          else{
              JOptionPane.showMessageDialog(f,"Invalid User Id or Password ");
          }
          con.close();
           }
               catch(Exception ex){
                   ex.printStackTrace();
               } 
           }
           else if(e.getSource()==clear){
               t1.setText("");
               t2.setText("");
               t1.requestFocus();
                       
               
           }
            else if(e.getSource()==cancel){
                f.dispose();
       
           }
       }
  
public static void main(String[] args){
    new LoginPage();
    
}  
}

