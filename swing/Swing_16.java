import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JProgressBarTest extends JFrame
{

public class JProgressBar pbar=new JProgressBar();
JButton btn=new JButton("Step");

Public JProgressBarTest()
{
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	btn.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			int value=pbar.getValue()+2;
			if (value>pbar.getMaximum()) 
			{
				value=pbar.getMaximum();
			}
			pbar.setValue(value);
			btn.setText("Step["+value+"]");
		}

	});

	setLayout(null);
	pbar.setBounds(20,20,210,30);
	add(pbar);
	btn.setBounds(20,60,210,40);
	add(btn);

	setSize(250,150);
	setVisible(true);
	 
}

public static void main(String[] args) 
{

	new JProgressBarTest();
	
}

}