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

public class FlowLayout1{
    JFrame f;
    JButton b1,b2,b3,b4;
    public FlowLayout1(){
        f = new JFrame("Flow Layout");
        b1 = new JButton("b1");
         b2 = new JButton("b2");
          b3 = new JButton("b3");
           b4 = new JButton("b4");
           
           f.setSize(400,400);
           f.setVisible(true);
           f.setDefaultCloseOperation(3);
           f.setLayout(new FlowLayout());
           
           f.add(b1);f.add(b2);f.add(b3);f.add(b4);
           
    }
    public static void main(String [] args){
        new FlowLayout1();
        
    }
    
    
}
