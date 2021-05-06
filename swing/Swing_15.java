import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class  JSliderTest
{
	JLabel lbl;
	JSliderTest()
	{
		JFrame frame=new JFrame("Tick Slider");
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOpeartion(JFrame.EXIT_ON_CLOSE);

		JSLider slider=new JSLider();
		lbl=new JLabel();
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(25);		
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);

		frame.add(slider.BorderLayout.NORTH);
		frame.add(lbl.BorderLayout.SOUTH);
		frame.setSize(300,200);
		frame.setVisible(true);	

		slider.addChangeListener(new ChangeListener(){

			public void stateChanged(ChangeEvent evt)
			{
				JSLider slider=(JSLider)evt.getSource();
				int value=slider.getValue();
				lbl.setText("Value of Slider:"+value);
			}

		});

	}

	public static void main(String[] args) 
	{
		new JSLiderTest();
	}
}