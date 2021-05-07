import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import javax.swing.tree.*;

public class SwingJTree extends JApplet
{
	JTree tree;
	JLabel jlab;
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
		DefaultMutable TreeNode a =new DefaultMutableTreeNode("A");
		DefaultMutable TreeNode a1 =new DefaultMutableTreeNode("A1");
		a.add(a1);

		DefaultMutable TreeNode a11 =new DefaultMutableTreeNode("A11");
        a1.add(a11);
		DefaultMutable TreeNode a12 =new DefaultMutableTreeNode("A12");
        a1.add(a12);
        DefaultMutable TreeNode a13 =new DefaultMutableTreeNode("A13");
        a1.add(a13);

        DefaultMutable TreeNode b1 =new DefaultMutableTreeNode("B1");
		a.add(b1);

		DefaultMutable TreeNode b11 =new DefaultMutableTreeNode("B11");
        b1.add(b11);
		DefaultMutable TreeNode b12 =new DefaultMutableTreeNode("B12");
        b1.add(b12);
        DefaultMutable TreeNode b13 =new DefaultMutableTreeNode("B13");
        b1.add(b13);

        tree =new JLabel();
        JScrollPane jsp=new JScrollPane(tree);
        add(jsp);

        jlab=new JLabel();
        add(jlab,BorderLayout.SOUTH);
        tree.addTreeSelectionListener(new TreeSelectionListener(){
        
        public void valueChanged(TreeSelectionEvent tse)
        {
        	jlab.setText("Selection is:"+tse.getPath());
        }

        });


	}
}