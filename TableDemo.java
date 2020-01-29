import javax.swing.*;
import java.awt.*;
import java.beans.FeatureDescriptor;
public class TableDemo {
	JFrame f1;
	JTable t1;
	JScrollPane jp;
	TableDemo(){
		f1=new JFrame();
		f1.setLayout(new BorderLayout());
		f1.setSize(400,400);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Object[][]data= {{1,"Ram","Manager",24500},
				         {2,"Hari","Director",22500},
				         {1,"Ram","Manager",24500},
				         {2,"Hari","Director",22500},
				         {1,"Ram","Manager",24500},
				         {2,"Hari","Director",22500},
			            };
		String []cols= {"ID","NAME","POST","SALARY"};
		t1=new JTable(data,cols);
		jp=new JScrollPane(t1);
		f1.add(jp);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		new TableDemo();
	}
}
