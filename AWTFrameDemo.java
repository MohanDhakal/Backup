import java.awt.*;
import java.awt.event.*;
public class AWTFrameDemo extends WindowAdapter {
	Frame f1;
	AWTFrameDemo(){
		f1=new Frame();
		f1.setSize(300, 300);
		f1.setVisible(true);
		f1.addWindowListener(this);
		
	}
	public static void main(String args[]) {
		new AWTFrameDemo();
	}
	public void windowClosing(WindowEvent e) {
		f1.dispose();
	}
	
}
