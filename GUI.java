import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI implements ActionListener{
	JFrame f1;
	JButton  b1;
	JTextField t1;

	GUI(){
		f1=new JFrame();
		f1.setSize(300,300);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		t1=new JTextField(10);
		f1.add(t1);
		
		b1=new JButton("ok");
		f1.add(b1);
		b1.addActionListener(this);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new GUI();
	}
	public void actionPerformed(ActionEvent e) {
		t1.setText("Hello");
	}
}
