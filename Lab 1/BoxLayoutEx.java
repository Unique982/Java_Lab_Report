
import javax.swing.*;
import java.awt.*;
public class BoxLayoutEx {
    
    JFrame f;
    JButton b1,b2,b3;
    public BoxLayoutEx(){
        f = new JFrame("BoxLayout");
        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
       Container c = f.getContentPane();
       BoxLayout box = new BoxLayout(c, BoxLayout.X_AXIS);
       c.setLayout(box);
       f.add(b1);f.add(b2);f.add(b3);
       
       
            
    }
    public static void main (String[] args){
        new BoxLayoutEx();
    }
    
}
