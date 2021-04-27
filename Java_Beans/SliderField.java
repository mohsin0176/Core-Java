package sunw.demo.SliderField;

import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

public class SliderField extends JPAnel implements Serializable
{
	private JSlider sdr;
	private JTextField tf;
	private Box b;
	private int val;
	private PropertyChangeSupport pcs;


   public SliderField()
   {

   	pcs =new PropertyChangeSupport(this);
   	sdr=new JSlider(SwingConstants.HORIZONTAL,1,100,1);
   	tf=new JTextField(String.valueOf(sdr.getValue()),5);
   	b=new Box(BoxLayout.X_AXIS);
    b.add(sdr);
    b.add(BoxcreateHorizontalStrut(5));
    b.add(tf);
    setLayout(new BorderLayout());
    add(b);
    sdr.addChangeListener(new ChangeListener()
    	{
    		public void stateChanged(ChangeEvent e)
    		{
    			setCurrentValue(sdr.getValue());
    		}
    	});  
    tf.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			setCurrentValue(Integer.parseInt(tf.getText()));
    		}
    	}); 
    }	 

    public void addPropertyChangeListener(PropertyChangeListener pcl)
    {
    	pcs.addPropertyChangeListener(pcl);
    }
    public void removePropertyChangeListener(PropertyChangeListener pcl)
    {
    	pcs.removePropertyChangeListener(pcl);
    }
    public void setMinimumValue(int min)
    {
    	sdr.setMinimum(min);
    	if (sdr.getValue()<sdr.getMinimum()) 
    	{
    		sdr.setValue(sdr.getMinimum());
    		tf.setText(String.valueOf(sdr.getValue()));
    		
    	}
    }
    public int getMaximumValue()
    {
    	return sdr.getMaximum();
    }
    public void setCurrentValue(int v)
    {
    	int oldvalue=val;
    	val=v;
    	sdr.setValue(val);
    	tf.setText(String.valueOf(val));
    	pcs.firePropertyChange("Current Value",new Integer(oldvalue),new Integer(val));

    }

    public int getCurrentValue()
	{
    return sdr.getValue();
	}
	public void setFieldWidth(int col)
	{
	tf.setColumns(col);
	b.validate();
	}
    public void getFieldWidth()
	{
	return tf.getColumns(); 
	}
	public Dimension getMinimumSize()
	{
	return b.getMinimumSize();
	}
	public Dimension getPreferredSize()
	{
	return b.getPreferredSize();
	}



  }	


