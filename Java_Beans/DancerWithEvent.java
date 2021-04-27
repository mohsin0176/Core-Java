package sunw.demo.Dancer;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class Dancer extends JPanel implements ActionListener,Serializable
{
	private final static String IMAGE_NAME="dancer";
	protected ImageIcon img[];
	private final int TOTAL_IMAGES=9;
	private int n=0;
	private final int ANIMATION_DELAY=50;
	private Timer tmr;
	public Dancer()
	{
		img=new ImageIcon[TOTAL_IMAGES];
		URL url;
		for (int i=0;i<img.length ;i++ ) 
		{

			url=getClass().getResource("images/"+IMAGE_NAME+i+".gif");
			img[i]=new ImageIcon(url);
		}
		startAnimation();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if (img[n].getImageLoadStatus()==MediaTarcker.COMPLETE) 
		{
			g.setColor(getBackground());
			g.drawRect(0,0,getSize().width,getSize().height);
			img[n].paintIcon(this,g,0,0);
			n=(n+1)%TOTAL_IMAGES;
			
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	public void startAnimation()
	{
		if (tmr==null) 
		{
			n=0;
			tmr=new Timer(ANIMATION_DELAY,this);
			tmr.start();
			
		}
		else
		{
			if (!tmr.isRunning()) 
			{
				tmr.restart();
			}
		}

	}

	public void stopAnimation()
	{
		tmr.stop();
	}

	public Dimension getMinimumSize()
	{
		return getPreferredSize();
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(160,120);
	}

	public static void main(String args[])
	{
		Dancer an=new Dancer();
		JFrame w=new JFrame("Dancer Test");
		w.setDefaultCloseOPeration(JFrame.EXIT_ON_CLOSE);
		w.getContentPane().add(an,BorderLayout.Center);
		w.setSize(an.getPreferredSize().width,an.getPreferredSize().height);
		w.setVisible(true);
		an.startAnimation();
	}
}
