/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;
// Q.N Write a java program to illustrate the following Swing Component
// a. JColorChooser b. JFileChooser c. JDesktopPane and InternalFrame d.JTable e.JList
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class ListEx {
    JFrame f;
    JList l;
    JLabel l1;
    public ListEx(){
        f = new JFrame("List Example");
        l1 = new JLabel("Select Programming");
        String [] data = {"Java","HTML","CSS","PHP","React","Node js","Laravel","Bootstrap","Mobile Programming"};
        l = new JList<>(data);
        l.setVisibleRowCount(3);
        l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        f.setSize(400,400);

        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        
        f.add(l1);f.add(new JScrollPane(l));

        f.setVisible(true);
        
    }
    public static void main(String [] args){
        new ListEx();
        
    }
    
}
