import javax.swing.*;
import java.awt.*;

class GridDemo
{
   JFrame f1;
   JLabel l1,l2;
   JTextField t1,t2;
   JButton b1,b2;
 
   GridDemo()
   {
 f1=new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(3,2,5,5));
    
 l1=new JLabel("Id");
 l2=new JLabel("Name");
 t1=new JTextField(10);
        t2=new JTextField(10);
 b1=new JButton("Ok");
 b2=new JButton("Cancel");
 f1.add(l1);
 f1.add(t1);
 f1.add(l2);
 f1.add(t2); 
 f1.add(b1);
 f1.add(b2);
 
 f1.setSize(300,300);
 f1.setVisible(true);
     }
     public static void main(String args[])
     {
 new GridDemo(); 
     }
}