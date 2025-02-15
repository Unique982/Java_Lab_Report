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
public class GridBagLayoutEx {
    JFrame f;
    JButton b1,b2,b3;
    
    public GridBagLayoutEx(){
        f = new JFrame("GridBagLayout");
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
         gbc.gridy=0;
         f.add(b1,gbc);
         gbc.gridx=1;
          gbc.gridy=0;
          f.add(b2,gbc);
            gbc.gridx=0;
              gbc.gridy=1;
              gbc.gridwidth=2;
       gbc.insets = new Insets(5, 5, 5, 5);
       gbc.fill=GridBagConstraints.HORIZONTAL;
       f.add(b3,gbc);

        
        
    }
    public static void main(String [] args){
        new GridBagLayoutEx();
    }
    
}
