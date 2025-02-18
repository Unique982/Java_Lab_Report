/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StdentRegistration  implements ActionListener  {
     JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4;
    JButton b;
    JRadioButton rb1, rb2;
    JTextArea ta;
    JComboBox cb1;
    JCheckBox ck1, ck2, ck3;
    public StdentRegistration(){
         f = new JFrame("StudentRegistration");
        l1 = new JLabel("Name");
        t1 = new JTextField(25);
        l2 = new JLabel("Address");
        t2 = new JTextField(25);
        l3 = new JLabel("Email");
        t3 = new JTextField(25);
        l4 = new JLabel("Password");
        t4 = new JTextField(25);
        
        l5 = new JLabel("Gender");
        rb1= new JRadioButton("Male");
        rb2= new JRadioButton("Female");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
 
        l6 = new JLabel("Hobbies");
        ck1 = new JCheckBox("Playing");
        ck2 = new JCheckBox("Reading");
        ck3 = new JCheckBox("Swimming");

        l7 = new JLabel("Country");
     
        String[] country = {
           "Nepal","Japan","UAS"
        };
        cb1 = new JComboBox(country);

        b = new JButton("Save");
        ta = new JTextArea();
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20, 20, 100, 25);
        t1.setBounds(150, 20, 150, 25);
        
        l2.setBounds(20, 60, 100, 25);
        t2.setBounds(150, 60, 150, 25);
        
        l3.setBounds(20, 100, 100, 25);
        t3.setBounds(150, 100, 150, 25);
        
        l4.setBounds(20, 140, 100, 25);
        t4.setBounds(150, 140, 150, 25);
        l5.setBounds(20, 180, 100, 25);
        rb1.setBounds(150, 180, 70, 25);
        rb2.setBounds(230, 180, 80, 25);
     
        l6.setBounds(20, 200, 100, 25);
        ck1.setBounds(150, 200, 80, 25);
        ck2.setBounds(230, 200, 80, 25);
        ck3.setBounds(320, 200, 100, 25);
                                                                                                                                                                                                                       
        l7.setBounds(20, 250, 100, 25);
        cb1.setBounds(150, 250, 100, 25);
       
        b.setBounds(150, 300, 100, 30);
        ta.setBounds(150,350,300,300);
        b.addActionListener(this);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(l5);
        f.add(rb1);
        f.add(rb2);
        f.add(l6);
        f.add(ta);
        f.add(l7);
        f.add(cb1);
        f.add(ck1);
        f.add(ck2);
        f.add(ck3);
        f.add(cb1);
        f.add(b);
        f.add(ta);
    }
 
 @Override
    public void actionPerformed(ActionEvent e) {
        
  String name = t1.getText();
   String address = t2.getText();
   String email = t3.getText();
           String password = t4.getText();   
            String gender=rb1.isSelected() ? "Male":"Female";
            String subject = ta.getText();
            String country =cb1.getSelectedItem().toString();
            
            StringBuilder hobbies = new StringBuilder();
       if(ck1.isSelected()){
           hobbies.append("Playing "+", ");
       }
       if(ck2.isSelected()){
           hobbies.append("Reading "+", ");
       }
        if(ck3.isSelected()){
           hobbies.append("Swimming "+", ");
       }
//        String country = cb1.getSelectedItem();
           
           ta.setText("Form Details:\n" 
           + "Name: " + name + "\n"
                    + "Address: " + address + "\n"
                    + "Email: " + email+ "\n"
                    + "Password: " + password + "\n"
                    + "Gender: " + gender + "\n"
                    + "Hobbies: " + hobbies + "\n"
                    + "country: " + country + "\n");
                
    }



  public static void main(String[] args){
       new StdentRegistration();
    }
}
