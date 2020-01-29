import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuDemo implements ActionListener{
	JFrame f1;
	JMenuBar mb;
	JMenu menu1;
	JMenuItem mi1,mi2;
	MenuDemo(){
		f1=new JFrame();
		f1.setSize(300,300);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mb=new JMenuBar();
		menu1=new JMenu("File");
		menu1.setMnemonic('f');
		mi1=new JMenuItem("New");
		mi2=new JMenuItem("Exit");
		mi2.addActionListener(this);
		mi1.addActionListener(this);
		menu1.add(mi1);
		menu1.addSeparator();
		menu1.add(mi2);
		mi1.setAccelerator
		(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
		mb.add(menu1);
		f1.setJMenuBar(mb);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new MenuDemo();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mi2) {
			f1.dispose();
		}
		else {
			new GUI();
		}
	}
	
}
