/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

// Q.NWrite a java program to illustrate the following Swing Component
// a. JColorChooser b. JFileChooser c. JDesktopPane and InternalFrame d.JTable e.JList



import javax.swing.*;
import java.awt.*;
public class Example2C {
    JFrame f;
    JDesktopPane dp;
    JInternalFrame p1,p2;
    
    public Example2C(){
        f = new JFrame("JDesktopPane and Internal");
        dp = new JDesktopPane();
        f.add(dp);
        p1 = new JInternalFrame("Internal Frame",true,true,true,true);
        p2= new JInternalFrame("Internal Frame",true,true,true,true);
        p1.setSize(200,200);
        p2.setSize(200,200);
        p1.setVisible(true);
        p2.setVisible(true);
        p1.add(new JLabel("Internal Frame 1"));
        p2.add(new JLabel("Internal Frame 2"));
        dp.add(p1);dp.add(p2);
         f.setSize(800,800);
         f.setVisible(true);
         f.setDefaultCloseOperation(3);  
    } 
public static void main(String[]args){
    new Example2C();
}    
}

