import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxTest1 implements ItemListener
{
	 
	JLabel lbl;

	public JToggleButtonTest1()
	{
		JFrame f=new JFrame("Grouping Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		JPanel p=new JPanel(new GridLayout(4,1));
		JCheckBox cb1=new JCheckBox("Cricket");		
		JCheckBox cb2=new JCheckBox("Football");
		JCheckBox cb3=new JCheckBox("Hockey");

		lbl=new JLabel("Select Games");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(lbl);	

		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);	

		f.add(p);
		f.setSize(300,200);
		f.setVisible(true);		

	}

	public void itemStateChanged(ItemEvent ie)
	{
		 JCheckBox rb=(JCheckBox) ie.getSource();
		 int state=ie.getStateChange();
		 String label=rb.getText();

		 if (state==ItemEvent.SELECTED) 
		 {
		 	lbl.setText(label+"is selected");
		 }
		 else
		 {
		 	lbl.setText(label+"is deselected");
		 }
	}

  public static void main(String[] args) 
  {
		new JCheckBoxTest1();
	}
 
}