import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class  JPopUpMenuTest
{
	JLabel lbl;
	public JPopUpMenuTest()
	{
		JFrame f=new JFrame("Pop Up Example");
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOpeartion(JFrame.EXIT_ON_CLOSE);

		JPopUpMenu pMenu=new JPopUpMenu("Title");
		lbl=new JLabel();

		JMenuItem mnuCut=new JMenuItem("Cut");
		pMenu.add(mnuCut);

		JMenuItem mnuCopy=new JMenuItem("Copy");
		pMenu.add(mnuCopy);

		JMenuItem mnuPaste=new JMenuItem("Paste");
		mnuPaste.setEnabled(false);
		pMenu.add(mnuPaste);

		pMenu.AddSeparator();

		JMenuItem mnuFind=new JMenuItem("Find");
		pMenu.add(mnuFind);


		JButton btn=new JButton("Right Click Me");
		f.add(btn,BorderLayout.NORTH);

		btn.setComponentPopUpMenu(pMenu);

		mnuCut.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e)
			{
				lbl.seText("Cut Pop Up Menu Item Clicked");
			}

		});

		f.add(lbl,BorderLayout.SOUTH);
		f.setSize(250,150);
		f.setSize(true);
	}

	public static void main(String[] args) 
	{
		new JPopUpMenuTest();
	}
}