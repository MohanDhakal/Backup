import javax.swing.*;
import java.awt.*;
public class GridDemo {
	JFrame f1;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	GridDemo(){
		f1=new JFrame();
		f1.setSize(400, 200);
		f1.setLayout(new GridLayout(3,2,10,10));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Name");
		l2=new JLabel("Age");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("ok");
		b2=new JButton("Cancel");
		f1.add(l1);f1.add(t1);
		f1.add(l2);f1.add(t2);
		f1.add(b1);f1.add(b2);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new GridDemo();
	}
}
