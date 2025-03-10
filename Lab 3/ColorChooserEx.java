/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

/**
 *
 * @author Acer
 */
// Q.NWrite a java program to illustrate the following Swing Component
// a. JColorChooser b. JFileChooser c. JDesktopPane and InternalFrame d.JTable e.JList


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ColorChooserEx {
    JFrame f;
    JButton b1;
   public ColorChooserEx(){
       f = new JFrame("Example 2");
       b1 = new JButton("Color Choose");
       f.setSize(400,400);
       f.setVisible(true);
       f.setDefaultCloseOperation(3);
       f.setLayout(new FlowLayout());
       f.add(b1);
       b1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               Color color  = JColorChooser.showDialog(f, "Color Choosie", Color.yellow);
               f.getContentPane().setBackground(color);
           }
           
       });   
   }
   public static void main(String[] args){
       new ColorChooserEx();
   }
}
