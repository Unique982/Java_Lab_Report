/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2;


import javax.swing.*;
import java.awt.*;
public class Example2 {
    JFrame f;
   JSlider s;
   JLabel l;

    
   public Example2(){
       f = new JFrame("Example 2s");
         l = new JLabel("Age");
       s = new JSlider(10,100,10);
        
       f.setSize(400,400);
       f.setVisible(true);
       f.setDefaultCloseOperation(3);
       f.setLayout(new FlowLayout());
       f.add(l);f.add(s);
       

   }
    public static void main(String[] args) {
       new Example2();
        
    }

    
}
