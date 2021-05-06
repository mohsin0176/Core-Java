import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class JListTest1 implements ItemListener
{
	  JList jlist;
	  JLabel lbl;

	public JListTest1()
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(new BorderLayout());

		 String labels[]={"AAA","BBB","CCC","DDD","EEE","FFF","GGG","HHH"};
		 jlist=new Jlist(labels);
		 lbl=new JLabel("Select Items");
		 JScrollPane sp=new JScrollPane(jlist);
		 	
         f.add(sp,BorderLayout.CENTER);
         f.add(lbl,BorderLayout.NORTH);
         jlist.addListSelectionListener(this);
         
		 
		 f.setSize(300,200);
		 f.setVisible(true);		

	}

	public void  valueChanged(ListSelectionEvent lse)
	{
		   JList list=(JList) lse.getSource();
		   int idx[]=list.getSelectedIndices();
		   Object values[]=list.getSelectedValues();
		   int n=idx.length;
		   String s="";
		   for (int i=0;i<n ;i++ ) 
		   {
		   	 if (i==0) 
		   	 {
		   	 	s+="Selections";
		   	 }
		   	 s+=idx[i]+":"+values[i]+"";
		   }
		   lbl.setText(s);
	}

  public static void main(String[] args) 
  {
		new JListTest1();
  }
 
}