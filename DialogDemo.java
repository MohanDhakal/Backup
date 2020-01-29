import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogDemo implements ActionListener{
	JFrame f1;
	JLabel l1;
	JButton b1;
	JDialog d1;
	DialogDemo(){
		f1=new JFrame();
		f1.setSize(300,300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new FlowLayout());
		b1=new JButton("Ok");
		f1.add(b1);
		b1.addActionListener(this);
		f1.setVisible(true);
	}
	public static void main(String args[]) {
		new DialogDemo();
	}
	public void actionPerformed(ActionEvent e) {
		d1=new JDialog(f1,"This is title",false);
		d1.setSize(200,200);
		l1=new JLabel("Simple Dialog Box");
		d1.setLayout(new FlowLayout());
		d1.add(l1);
		d1.setVisible(true);
	}
}
