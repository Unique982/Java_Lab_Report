import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example4  {

    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;

    public  Example4() {
        f = new JFrame("  largest & smallest");
        l1 = new JLabel("Num1:");
        l2 = new JLabel("Num2:");
        l3 = new JLabel("Num3:");
        l4 = new JLabel("Result:");
        l5 = new JLabel("Enter Here:");
        t1 = new JTextField(25);
        t2 = new JTextField(25);
        t3 = new JTextField(25);
        t4 = new JTextField(25);
        t5 = new JTextField(25);


        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20, 50, 100, 20);
        t1.setBounds(150, 50, 100, 20);
        l2.setBounds(20, 100, 100, 20);
        t2.setBounds(150, 100, 100, 20);
        l3.setBounds(20, 150, 100, 20);
        t3.setBounds(150, 150, 100, 20);
       l4.setBounds(20, 200, 100, 20);
       t4.setBounds(150, 200, 100, 20);
       l5.setBounds(20, 250, 100, 20);

       t5.setBounds(150, 250, 100, 20);


        f.add(l1);f.add(l2);f.add(l3);   f.add(l4);   f.add(l5);
 
        f.add(t1);f.add(t2);  f.add(t3);f.add(t4);f.add(t5);
   
        t5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int num3 = Integer.parseInt(t3.getText());
                int smallest, largest;
                if (num1 <= num2 && num1 <= num3) {
                    smallest = num1;
                } else if (num2 <= num1 && num2 <= num3) {
                    smallest = num2;
                } else {
                    smallest = num3;
                }

                if (num1 >= num2 && num1 >= num3) {
                    largest = num1;
                } else if (num2 >= num1 && num2 >= num3) {
                    largest = num2;
                } else {
                    largest = num3;
                }
                t4.setText("smallest"+ smallest + ", Largest: " + largest);
            }
        });
    }

    public static void main(String[]args){

        new  Example4();
    }


}