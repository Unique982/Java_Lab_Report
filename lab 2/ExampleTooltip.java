/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author Acer
 */
import javax.swing.*;
import java.awt.*;

public class ExampleTooltip {
    JFrame f;
    JLabel l;
    JTextField t;
    
    public  ExampleTooltip(){
        f = new JFrame("Tooltip Example");
        l = new JLabel("Example of Tooltip");
        t = new JTextField(25);
         t.setToolTipText("Enter Your Name");
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        
        f.add(l);
        f.add(t);
        
        
}
    public static void main(String[]args){
         new  ExampleTooltip();
    }
} 

