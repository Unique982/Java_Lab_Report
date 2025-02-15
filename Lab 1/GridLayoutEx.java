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
public class GridLayoutEx {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
   
    public GridLayoutEx(){
        f = new JFrame("Grid Layout");
        b1 = new JButton("1");
         b2 = new JButton("2");
          b3 = new JButton("3");
           b4 = new JButton("4");
           b5 = new JButton("5"); 
           b6 = new JButton("6"); 
           b7 = new JButton("7");
            b8 = new JButton("8");
            
            f.setSize(400,400);
            f.setVisible(true);
            f.setDefaultCloseOperation(3);
            f.setLayout(new GridLayout(4,2,10,10));
            f.add(b1);  f.add(b2);
              f.add(b3);  f.add(b4);
                f.add(b5);  f.add(b6);
                  f.add(b7);  f.add(b8);
           
           
           
           
    }
    public static void main(String [] args){
        new GridLayoutEx();
    }
    
    
}
