import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonTest1 implements ActionListener
{
	 
	JLabel lbl;

	JRadioButtonTest1()
	{
		JFrame f=new JFrame("Grouping Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		JPanel p=new JPanel(new GridLayout(4,1));
		p.setLayout(new FlowLayout(FlowLayout.CENTER));

		ButtonGroup bg=new ButtonGroup();

		JRadioButton rb1=new JRadioButton("Red");		
		JRadioButton rb2=new JRadioButton("Blue");
		JRadioButton rb3=new JRadioButton("Green");

		lbl=new JLabel("Select Color");

		p.add(rb1);
		bg.add(rb1);
		p.add(rb2);
		bg.add(rb2);
		p.add(rb3);
		bg.add(rbr);
		p.add(lbl);	

		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);	

		f.add(p);
		f.setSize(300,100);
		f.setVisible(true);		

	}

	public void actionPerformed(ActionEvent ae)
	{
		  JRadioButton rb=(JRadioButton)ae.getSource();
		  lbl.setText("Selected"+rb.getText());
	}

  public static void main(String[] args) 
  {
		new JRadioButtonTest1();
	}
 
}