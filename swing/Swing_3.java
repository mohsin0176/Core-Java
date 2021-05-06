import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelTest1 extends JFrame
{
	public JLabelTest1()
	{
		setTitle("BIIT");
		setSize(250,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lbl1=new JLabel("Username:",JLabel.RIGHT);
		JLabel lbl2=new JLabel("Password:",JLabel.RIGHT);
		JLabel lbl2=new JLabel("Confirm Password:",JLabel.RIGHT);

		lbl1.setVerticalAlignment(JLabel.TOP);
		lbl1.setToolTipText("Enter Username");
		getContentPane().add(lbl1);
		getContentPane().add(lbl2);
		getContentPane().add(lbl3);		
	}

	public static void main(String[] args)
	{
	new JLabelTest1().setVisible(true);	
	}
}