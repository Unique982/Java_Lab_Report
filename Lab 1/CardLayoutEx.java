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
public class CardLayoutEx {
    JFrame f;
    JButton b1,b2,b3;
    public CardLayoutEx(){
     f = new JFrame("Card Layout");
         b1 = new JButton("Card-1");
         b2 = new JButton("Card-2");
         b3 = new JButton("Card-3");
         f.setSize(400, 400);
         f.setVisible(true);
         f.setDefaultCloseOperation(3);
         CardLayout card = new CardLayout(20 ,20);
         f.setLayout(card);
         f.add("c1", b1);
         f.add("c2", b2);
         f.add("c3", b3);
         card.show(f.getContentPane(), "c1");

}
    public static void main(String[]args){
        new CardLayoutEx();
    }
}
