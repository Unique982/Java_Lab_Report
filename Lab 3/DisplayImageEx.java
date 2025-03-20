/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
public class DisplayImageEx extends Canvas {
    public static void main(String [] args){
        JFrame f = new JFrame("Example Image Display");
        
        Canvas cv = new DisplayImageEx();
        cv.setSize(400,400);
        f.add(cv);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    public void paint (Graphics g){
        try{
            
            BufferedImage img = ImageIO.read(getClass().getResource("bannerA.jpg"));
            g.drawImage(img,50,20,100,100,this);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Times New Roman",Font.PLAIN,15));
            g.drawString("Name: Unique Neupane", 50, 140);
              g.setFont(new Font("Times New Roman",Font.BOLD,15));
        g.drawString("Address: KTM", 50, 160);
         g.setFont(new Font("Times New Roman",Font.ITALIC,15));
        g.drawString("Phone No: 9800000000", 50,180);
        }
        
        catch(Exception ex){
           ex.printStackTrace();
        }
    }
    
}
