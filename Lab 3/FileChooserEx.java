/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

// Q.NWrite a java program to illustrate the following Swing Component
// a. JColorChooser b. JFileChooser c. JDesktopPane and InternalFrame d.JTable e.JList


import javax.swing.*;
import java.awt.event.*;
public class FileChooserEx {
    JFrame f;
    JFileChooser fc;
    JMenu m;
    JMenuBar b1;
    JMenuItem i1;
    public FileChooserEx(){
        f = new JFrame("file Chooser Ex");
        fc = new JFileChooser();
        m = new JMenu("file");
        b1 = new JMenuBar();
        i1 = new JMenuItem("open");
       
        m.add(i1);
        
      
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
          b1.add(m);
          f.setJMenuBar(b1);
          i1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           int file = fc.showOpenDialog(f);
           if(file == JFileChooser.APPROVE_OPTION){
               JOptionPane.showMessageDialog(f,"Selected file"+ fc.getSelectedFile().getAbsolutePath());
           }
            }
              
          });
          
        
    }
   public static void main (String[] args){
       new FileChooserEx();
       
   }
    
}
