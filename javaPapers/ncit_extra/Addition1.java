import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Addition1 extends Applet implements ActionListener
{
   Label l1,l2,l3;
   TextField t1,t2,t3;
   Button b1;
   
   public void init()
   {
 t1=new TextField(10);
 
        t2=new TextField(10);
        t3=new TextField(10);
        t3.setEditable(false);
        l1=new Label("Number1");
        l2=new Label("Number2");
        l3=new Label("Result"); 
     
 b1=new Button("sum");
        b1.addActionListener(this);
    add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);     
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
}