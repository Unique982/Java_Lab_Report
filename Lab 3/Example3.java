/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

// Q.N Write a java program to draw following 2D Shapes using fillshape() and drawshape() function 
// a. Line b.Rectangle c. Circle d.Eillipse e.Polygon(Hexagonal)


import javax.swing.*;
import java.awt.*;

public class Example3 extends Canvas{
    public static void main(String[]args){
        JFrame f= new JFrame("Example Line");
        Canvas cv = new Example3();
        cv.setSize(400,400);
        f.add(cv);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    public void paint(Graphics g){
        g.drawLine(20,50,100,50);

        
        //b
        g.drawRect(150, 30, 100, 60);
        g.setColor(Color.BLUE);
        g.fillRect(270, 30, 100, 60);
        
        //c 
        g.setColor(Color.BLACK);
        g.drawOval(50, 100, 80, 80);
        g.setColor(Color.RED);
        g.fillOval(150, 100, 80, 80);
        
        
        // d
//         g.setColor(Color.BLACK);
//        g.drawOval(260, 100, 120, 60);
        g.setColor(Color.GREEN);
        g.fillOval(400, 100, 120, 60);
        
        // e 
        int[] xPoints = {100, 150, 180, 150, 100, 70};
        int[] yPoints = {220, 200, 220, 260, 260, 220};
        g.setColor(Color.BLACK);
        g.drawPolygon(xPoints, yPoints, 6);
        g.setColor(Color.ORANGE);
        g.fillPolygon(xPoints, yPoints, 6);
        
    }
    
    
}
