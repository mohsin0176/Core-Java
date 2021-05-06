import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JTextFieldTest1 implements ActiionListener
{
	JTextField tf;
	JLabel lb1,lb2;
	public JTextFieldTest1()
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());

		lb1=new JLabel("Enter Your Name:");
		tf=new JTextField(15);
		lbl2=new JLabel();

		tf.setText("BIIT");
		f.add(lbl1);
		f.add(tf);
		f.add(lbl2);
		tf.addActionListener(this);

		f.setSize(200,150);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae);
	{
		JTextField t=(JTextField)ae.getSource();
		lbl2.setText(t.getText());
	}

	public static void main(String args[])
	{
		new JTextFieldTest1();
	}

}