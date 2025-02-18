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
public class ScrollPane {
    JFrame f;
   JSlider s;
   JLabel l;
   JScrollPane sp;
    
   public ScrollPane(){
       f = new JFrame("Example 2s");
         l = new JLabel("Age");
       s = new JSlider();
       sp = new JScrollPane();
       f.setSize(400,400);
       f.setVisible(true);
       f.setDefaultCloseOperation(3);
    
       
       sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
               sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       f.add(l);f.add(s);
       f.add(sp);
       sp.add(s);

   }
    public static void main(String[] args) {
       new ScrollPane();
        
    }

    
}
