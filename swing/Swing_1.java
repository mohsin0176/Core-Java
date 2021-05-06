import java.awt.event.*;
import javax.swing.*;

public class ActionEventTest implements ActionListener
{
	ActionEventTest()
	{
		JFrame f=new JFrame("BIIT");
		JButton b=new JButton("Nessage");
		f.add(b);
		b.addActionListener(this);
		f.setSize(200,100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		JOptionPane.showConfirmDialog(null,"Let's Learn Event Handling..","Just a test",JOptionPane.PLAIN_MESSAGE);

	}
	public static void main(String args[])
	{
		new ActionEventTest();
	}
}