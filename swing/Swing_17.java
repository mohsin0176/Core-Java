import java.awt.*;
import javax.swing.*;

public class SwingJTable extends JApplet
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
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
	}

	private void makeGUI()
	{
		String[] colHeads={"Name","Age","Address"};
		Object[][] data={{"Komal","21","Housing Board"},
						  {"Anshewa","20","Sector-06"},
						  {"Ankit","25","Pragati Nagar"},
						  {"Sristy","26","Matri Nagar"},
						  {"Vibha","45","Ashish Nagar"},
						  {"Geetangali","42","Risali"}		

						};

		JTable table=new JTable(data,colHeads);
		JScrollPane jsp=new JScrollPane(table);
		add(jsp);



	}
}