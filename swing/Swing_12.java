import javax.swing.JButton;
import javax.swing.JFrame;

public class JToolTipTest1
{
	public static void main(String[] args) 
	{

		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b=JButton("Click Here");

		frame.add(b,"center");

		b.setToolTipText("This is ToolTip");
		frame.setSize(300,200);
		frame.setVisible(true);
		
	}
}