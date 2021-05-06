import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPasswordFieldTest1 implements ActionListener
{
	JPasswordField pf;
	JLabel lbl1,lbl2;
	public JPasswordFieldTest1()
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOPeration(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		lbl1 =new JLabel("Enter Password:");
		pf=new JPasswordField(15);
		lbl2=new JLabel();

		f.add(lbl1);
		f.add(pf);
		f.add(lbl2);

		pf.ActionListener(this);
		f.setSize(200,150);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{
		JPasswordField t=(JPasswordField).aegetSource();
		lbl2.setText(new String(t.getPassword()));

	}

	 public static void main(String[] args) 
	 {
	 	new JPasswordFieldTest1();
		
	}
}