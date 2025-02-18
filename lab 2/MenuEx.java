/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

import javax.swing.*;
import java.awt.event.*;
public class MenuEx {
    JFrame f;
    JMenu m;
    JMenuBar b;
    JMenuItem i1,i2;
    
    public MenuEx(){
        f =new JFrame("Menu");
        m =new JMenu("File");
        b = new JMenuBar();
        i1 = new JMenuItem("New",KeyEvent.VK_N);
        i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
      
         i2 = new JMenuItem("Open",KeyEvent.VK_O);
        i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.ALT_DOWN_MASK));
        
        
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        
        f.setJMenuBar(b);
        b.add(m);
        m.add(i1);m.add(i2);
        i1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(f,"New Item");
            }
        
    });
         i2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(f,"Open item");
            }
        
    });
        
        
 
    
    }
    public static void main(String[] args){
        new MenuEx();
    }
    
    
}
