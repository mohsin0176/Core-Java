import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonTest implements ActionListener
{
	JToggleButton tb;
	JLabel lbl;

	public JToggleButtonTest()
	{
		JFrame f=new JFrame("Selecting Toggle");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tb=new JToggleButton("Toggle Button");
		lbl=new JLabel("State of Toggle Button");

		td.addActionListener(this);

		f.add(tb,BorderLayout.NORTH);
		f.add(lbl,BorderLayout.SOUTH);

		f.setSize(300,125);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
		AbstractButton b=(AbstractButton).ae.getSource();
		if(b.getModel().isSelected())
		{
			lbl.setText("ToggleButton is ON");
		}
		else
		{
			lbl.setText("ToggleButton is OFF");
		}
	}

  public static void main(String[] args) 
  {
		new JToggleButtonTest();
	}
 
}