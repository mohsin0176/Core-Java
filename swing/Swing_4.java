import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonTest1 implements ActionListener
{
	public JButtonTest1()
	{
		JFrame frame=new JFrame("JButtonExample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton bn=new JButton("Show Message");
		bn.addActionListener(this);

		frame.add(bn);

		frame.setSize(250,150);
		frame.setVisible(true);
	}

	public void ActionPerformed(ActionEvent ae)
	{
        JOptionPane.showMessageDialogue(null,"About JButton","About Swing BUtton",JOptionPane.INFORMATION_MESSAGE);

	}

	public static void main(String[] args) 
	{
		JButtonTest1 jb=new JButtonTest1();
	}
}