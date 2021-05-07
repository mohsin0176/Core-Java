import javax.swing.*;
public class SwingJTabbedPane extends JApplet
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
			{
				public void run()
				{
					makeGUI();
				}

			});
		}
		catch(Exception exc)
		{
			System.out.println("Exception:"+exc);
		}
	}

	private void makeGUI()
	{
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Cities",new CitiesPanel());
		jtp.addTab("Colours",new ColorsPanel());
		jtp.addTab("Flavours",new FlavorsPanel());
		add(jtp);
	}
}

class CitiesPanel extends JPanel
{
	public CitiesPanel()
	{
		JButton b1=new JButton("bihali");
		add(b1);
		JButton b2=new JButton("Durg");
		add(b2);
		JButton 31=new JButton("Raipur");
		add(b3);
		JButton b4=new JButton("Rajapur");
		add(b4);
	}
}

class ColorsPanel extends JPanel
{
	public ColorsPanel()
	{
		JCheckBox cb1=new JCheckBox("Red");
		add(cb1);
		JCheckBox cb2=new JCheckBox("Blue");
		add(cb2);
		JCheckBox cb3=new JCheckBox("Green");
		add(cb3);
		 
	}
}

class FlavorsPanel extends JPanel
{
	public FlavorsPanel()
	{
		JComboBox<String> jcb=new JComboBox<String>();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("StrawBerry");	
		add(jcb);	
	}
}