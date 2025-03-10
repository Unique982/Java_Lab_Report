/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

// Q.N Write a java program to illustrate the following Swing Component
// a. JColorChooser b. JFileChooser c. JDesktopPane and InternalFrame d.JTable e.JList

import javax.swing.*;
import java.awt.*;
public class TableEx {
    JFrame f;
    JTable t;
    JScrollPane sp;
    public TableEx(){
        f = new JFrame("Table Example");
        String[] colname= {"id","Name","Address","Phone"};
        String [][] data= {{"1","Ram","KTM","9800000000"},{"2","Sita","KTM","9700000000"},
        {"3","Gita","KTM","9600000000"},{"4","Hari","KTM","9990000000"}};
        t = new JTable(data,colname);
        sp = new JScrollPane(t);
        f.add(sp);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        
    }
    public static void main(String[]args){
        new TableEx();
    }
    
}
