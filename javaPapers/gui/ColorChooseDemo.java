import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorChooseDemo implements ActionListener
{
  JTextArea ta;
  JButton b1;
  
  ColorChooseDemo()
  {
    JFrame frame=new JFrame();
    frame.setLayout(new BorderLayout());
    ta=new JTextArea();
    b1=new JButton("BgColor");
    frame.add(ta,BorderLayout.CENTER);
    frame.add(b1,BorderLayout.SOUTH);
    b1.addActionListener(this);
    frame.setVisible(true);
    frame.setSize(200,200);
  }
  public static void main(String args[])
  {
    new ColorChooseDemo();
  }
  public void actionPerformed(ActionEvent e)
  {
    Color color=JColorChooser.showDialog(null,"Choose color",Color.YELLOW);
    b1.setBackground(color);
    
  }
}
  
