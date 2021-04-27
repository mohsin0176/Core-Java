package sunw.demo.ColorChanger;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ColorChanger extends Cancas
{
	private boolean isfillcolor;
	Random rnd;
	int r,g,b,c;
	public ColorChanger()
	{
		rnd =new Random();
		addMouseListener( new MouseAdapter()
			{
				public void mousePressed(MouseEvent me)
				{
					Change();
				}
			});
		r=g=b=0;
		c=0;
		setSize(100,100);
	}
	public void Change()
	{
		c++;
		repaint();
	}
	public boolean getfillcolor()
	{
		return isfillcolor;
	}
	public void setfillcolor(boolean flag)
	{
		isfillcolor=flag;
		repaint();
	}

	public void paint(Graphics gr)
	{
		Dimension d=getSize();
		int h=d.height;
		int w=d.width;
		r=rnd.nextInt(255);
		g=rnd.nextInt(255);
		b=rnd.nextInt(255);

		if (isfillcolor) 
		{
			gr.setColor(new Color(r,g,b));
			
		}

		else

		{
			gr.setColor(new Color(255,255,255));
			gr.fillRect(0,0,w,h);
			gr.setColor(new Color(0,0,0));
			gr.drawString("Counter:"+c,20,20);			
			gr.drawString("Red:"+r,20,40);
			gr.drawString("Blue:"+b,20,80);
			gr.drawString("Green:"+g,20,60);			

		}
	}
}
