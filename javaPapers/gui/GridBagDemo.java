import java.awt.*;
import javax.swing.*;

class GridBagDemo
{
  public static void main(String args[])
  {
    JFrame frame=new JFrame();
    GridBagLayout g1=new GridBagLayout();
    frame.setLayout(g1);
    
    GridBagConstraints gbc=new GridBagConstraints();
    
    JButton b1=new JButton("button1");
    gbc.gridx=0;
    gbc.gridy=0;
    g1.setConstraints(b1,gbc);
    frame.add(b1);
        
    JButton b2=new JButton("button2");
    gbc.gridx=1;
    gbc.gridy=0;
    g1.setConstraints(b2,gbc);
    frame.add(b2);
    
    JButton b3=new JButton("button3");
    gbc.gridx=2;
    gbc.gridy=0;
    g1.setConstraints(b3,gbc);
    frame.add(b3);
    
    JButton b4=new JButton("button4");
    gbc.gridx=3;
    gbc.gridy=0;
    g1.setConstraints(b4,gbc);
    frame.add(b4);
    
    JButton b5=new JButton("button5");
    gbc.gridx=0;
    gbc.gridy=1;
  //  gbc.fill=GridBagConstraints.HORIZONTAL;
    g1.setConstraints(b5,gbc);
    frame.add(b5);
    
    JButton b6=new JButton("button6");
    gbc.fill=GridBagConstraints.HORIZONTAL;
    gbc.gridx=1;
    gbc.gridy=1;
    gbc.gridwidth=3;
    g1.setConstraints(b6,gbc);
    frame.add(b6);
    
    JButton b7=new JButton("button7");
    gbc.gridx=0;
    gbc.gridy=2;
    gbc.gridwidth=2;
    gbc.gridheight=2;
    gbc.fill=GridBagConstraints.BOTH;
    g1.setConstraints(b7,gbc);
    frame.add(b7);
    
    //gbc.ipady=0;
    JButton b8=new JButton("button8");
    gbc.gridx=2;
    gbc.gridy=2;
    gbc.gridwidth=2;
    gbc.gridheight=1;
    gbc.fill=GridBagConstraints.HORIZONTAL;
    g1.setConstraints(b8,gbc);
    frame.add(b8);
    
    JButton b9=new JButton("button9");
    gbc.gridx=2;
    gbc.gridy=3;
    gbc.gridwidth=2;
    gbc.fill=GridBagConstraints.HORIZONTAL;
    g1.setConstraints(b9,gbc);
    frame.add(b9);
    
    frame.setVisible(true);
    frame.setSize(350,200);
  }
}