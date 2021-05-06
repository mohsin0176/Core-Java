import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxTest1 implements ItemListener
{
	 JComboBox<String>cb;
	JLabel lbl;

	public JComboBoxTest1()
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(new FlowLayout(FlowLayout.CENTER));

		 cb=new JComboBox<String>();
		 lbl=new JLabel("Select an Item");
		 cb.addItem("AAA");
		 cb.addItem("BBB");
		 cb.addItem("CCC");		 
		 cb.addItem("DDD");
		 	

		 f.add(cb);
		 f.add(lbl);
		 cb.addItemListener(this);
		 f.setSize(300,200);
		 f.setVisible(true);		

	}

	public void  itemStateChanged(ItemEvent ie)
	{
		  Object item=cb.getSelectedItem();
		  lbl.setText("Selected"+item);
	}

  public static void main(String[] args) 
  {
		new JComboBoxTest1();
	}
 
}