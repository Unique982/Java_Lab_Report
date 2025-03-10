/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3;
// Q.N Write a java program to compute Simple Interest. The input and output required are taken from/to prebuilt dialogbox.
import javax.swing.*;
import java.awt.*;
public class SimpleInrestDialogBox{
    JFrame f;
    
    public SimpleInrestDialogBox(){
        f = new JFrame("Simple Inserst");
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
    
        String pr = JOptionPane.showInputDialog("Enter The Principle");
        String rate = JOptionPane.showInputDialog("Enter The Rate");
        String time = JOptionPane.showInputDialog("Enter The Time");
        
            
            float p = Float.parseFloat(pr);
            float r  = Float.parseFloat(rate);
            float t  = Float.parseFloat(time);
            
           float si = p*r*t/100;
            JOptionPane.showMessageDialog(f,"simple Insert=:"+si);
           
        } 
    public static void main(String []args){
        
new SimpleInrestDialogBox();
}    
}
        
  
    

