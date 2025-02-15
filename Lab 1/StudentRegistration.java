/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration  implements ActionListener {

    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField t1, t2, t3, t4;
    JButton b;
    JRadioButton rb1, rb2;
    JTextArea ta, ta1;
    JComboBox cb1, cb2, cb3, cb4;
    JCheckBox ck1, ck2, ck3;

    public StudentRegistration() {
        f = new JFrame("StudentRegistration");
        l1 = new JLabel("Name");
        t1 = new JTextField(25);
        l2 = new JLabel("Email");
        t2 = new JTextField(25);
        l3 = new JLabel("Phone");
        t3 = new JTextField(25);
        l4 = new JLabel("Address");
        t4 = new JTextField(25);
        
        l5 = new JLabel("Gender");
        rb1= new JRadioButton("Male");
        rb2= new JRadioButton("Female");
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
 
        l6 = new JLabel("Subject");
        ta = new JTextArea();
        
        l7 = new JLabel("program");
        String[] str = {"java", "php", "laravel", "css"};
        cb1 = new JComboBox(str);
        
        l8 = new JLabel("Hobbies");
        ck1 = new JCheckBox("Playing");
        ck2 = new JCheckBox("Reading");
        ck3 = new JCheckBox("Swimming");

        l9 = new JLabel("Dob");
        String[] days = new String[31];
        for (int i = 1; i < 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        cb2 = new JComboBox(days);
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        cb3 = new JComboBox(months);

        String[] years = new String[80];
        for (int i = 0; i < 80; i++) {
            years[i] = String.valueOf(2000 + i);
        }
        cb4 = new JComboBox(years);

        b = new JButton("Save");
        ta1 = new JTextArea();
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
      
        l6.setBounds(20, 220, 100, 25);
        ta.setBounds(150, 220, 150, 50);
        
        l7.setBounds(20, 280, 100, 25);
        cb1.setBounds(150, 280, 150, 25);
        
        l8.setBounds(20, 320, 100, 25);
        ck1.setBounds(150, 320, 80, 25);
        ck2.setBounds(230, 320, 80, 25);
        ck3.setBounds(320, 320, 100, 25);
                                                                                                                                                                                                                       
        l9.setBounds(20, 360, 100, 25);
        cb2.setBounds(150, 360, 50, 25);
        cb3.setBounds(210, 360, 100, 25);
        cb4.setBounds(320, 360, 80, 25);
        b.setBounds(150, 400, 100, 30);
        ta1.setBounds(150,450,300,300);
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
        f.add(l8);
        f.add(ck1);
        f.add(ck2);
        f.add(ck3);
        f.add(l9);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(b);
        f.add(ta1);

    }

    @Override
       public void actionPerformed(ActionEvent e) {
           String name = t1.getText();
           String email = t2.getText();
           String phone = t3.getText();
           String address = t4.getText();
            String gender=rb1.isSelected() ? "Male":"Female";
            String subject = ta.getText();
            String program =cb1.getSelectedItem().toString();
            
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
        String dob = cb2.getSelectedItem() + "" + cb3.getSelectedItem() + "" +cb4.getSelectedItem();
           
           ta1.setText("Form Details:\n" 
           + "Name: " + name + "\n"
                    + "Email: " + email + "\n"
                    + "Phone: " + phone + "\n"
                    + "Address: " + address + "\n"
                    + "Gender: " + gender + "\n"
                    + "Subject: " + subject + "\n"
                    + "Program: " + program + "\n"
                    + "Hobbies: " + hobbies + "\n"
                    + "DOB: " + dob + "\n");
        
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}

   
 
