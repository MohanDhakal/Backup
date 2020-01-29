import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ToolBarDemo implements ActionListener
{
  JButton b1;
  JDesktopPane desktop;
  ToolBarDemo()
  {
    JFrame frame =new JFrame();
    frame.setLayout(new BorderLayout());
    
   
    JMenuBar mbar=new JMenuBar();
    frame.setJMenuBar(mbar);  
    JMenu adminmenu=new JMenu("Admin");
    mbar.add(adminmenu);
    JMenuItem mi1=new JMenuItem("Login");
    JMenuItem mi2=new JMenuItem("Logout");
    adminmenu.add(mi1);
    adminmenu.add(mi2);
  
   
    JToolBar tbar=new JToolBar();
   ImageIcon img=new ImageIcon("android.png");
   b1=new JButton("one");
   b1.setIcon(img);
   b1.addActionListener(this);
   
   JButton b2=new JButton("two");
   tbar.add(b1);
   tbar.add(b2);
   frame.add(tbar,BorderLayout.NORTH);
   
   
  desktop=new JDesktopPane();
   //JScrollPane jsp=new JScrollPane(t1);
   frame.add(desktop,BorderLayout.CENTER);
   
   frame.setVisible(true);
    frame.setSize(300,300);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==b1)
    {
      LoginDemo ob=new LoginDemo();
      desktop.add(ob);
    }
  }
  public static void main(String args[])
  {
    new ToolBarDemo();
  }
}