import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class JMenuBarTest
{
	JLabel lbl;
	public JMenuBarTest()
	{
		JFrame f=new JFrame("Menu Example");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbl=new JLabel();
		JMenuBar mBar=new JMenuBar();

		JMenu fMenu=new JMenu("File");
		fMenu.setMnemonic(KeyEvent.VK_F);
		mBar.add(fMenu);


		JMenuItem mnuNew=new JMenuItem("New");
		mnuNew.setMnemonic(KeyEvent.VK_N);
		fMenu.add(mnuNew);

		mnuNew.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				lbl.setText("New Menu Item Clicked");
			}

		});

		f.setJMenuBar(mBar);
		f.add(lbl);
		f.setSize(250,150);
		f.setVisible(true);

	}


	public static void main(String[] args) 
	{

		new JMenuBarTest();
	}
}