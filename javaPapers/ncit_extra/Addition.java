import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Addition implements ActionListener
{
  JFrame f1;
  JTextField t1,t2,t3;
  JButton b1;
 
  Addition()
  {
     
     f1=new JFrame();
     f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     f1.setLayout(new FlowLayout());
     t1=new JTextField(10);
     t2=new JTextField(10);
     t3=new JTextField(10);
     b1=new JButton("Add");
     b1.addActionListener(this);
     
     f1.add(t1);
     f1.add(t2);
     f1.add(t3);  
     f1.add(b1);
   
    f1.setSize(300,300);
    f1.setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
 if(e.getSource()==b1)
        {
  int a=Integer.parseInt(t1.getText());
  int b=Integer.parseInt(t2.getText());
  int c=a+b;
                t3.setText(c+"");
 }

  }
  public static void main(String args[])
  {
    new Addition();
  }
}
