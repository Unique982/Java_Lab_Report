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
public class BorderLayoutEx{
     JFrame f;
    JButton b1,b2,b3,b4,b5;
    public BorderLayoutEx(){
        f = new JFrame("Border Layout");
        b1 = new JButton("b1");
        b2 = new JButton("b2");
          b3 = new JButton("b3");
           b4 = new JButton("b4");
           b5 = new JButton("b5");
           
          f.setSize(400,400);
          f.setVisible(true);
          f.setDefaultCloseOperation(3);
          f.setLayout(new BorderLayout());
          
          f.add(b1,BorderLayout.EAST); f.add(b3,BorderLayout.WEST);
           f.add(b2,BorderLayout.NORTH); f.add(b4,BorderLayout.CENTER);
            f.add(b5,BorderLayout.SOUTH);
        
    }
    public static void main (String[]args){
        new BorderLayoutEx();
    }
}
