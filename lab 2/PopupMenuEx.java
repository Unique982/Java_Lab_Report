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
import java.awt.event.*;
public class PopupMenuEx {
      JFrame f;
   
    JPopupMenu pm;
    JMenuItem i1,i2,i3;
    
    
    
    public PopupMenuEx()
    {       
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        pm = new JPopupMenu();
        pm.add(i1);
        pm.add(i2);
        pm.add(i3);
        
          f = new JFrame("Program 4");
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(3);
        
        f.setLayout(new FlowLayout());
     
        
        f.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(SwingUtilities.isRightMouseButton(e))
                {
                    pm.show(f, e.getX(), e.getY());
                }
            }
        }
        );
    }
   
    public static void main(String [] args)
    {
        new PopupMenuEx();
    }
    
}
