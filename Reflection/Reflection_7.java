import java.lang.reflect.*;

class Rectangle
{
	public double l,b;
    
    Rectangle(double x,double y)
    {
    	l=x;
    	b=y;
    }
	void area()
	{
		double ar=l*b;
		System.out.println("Area of rectangle:"+ar);
	}
}

 
class ReflectionField2
{
	public static void main(String[] args) 
	{
		try
		{
			Class c=Class.forName("Rectangle");
			Field[] f=c.getFields();
			System.out.println("Fields Of Rectangle");
			for (int i=0;i<f.length ;i++ ) 
			{
				System.out.println("Fields Of Signature"+f[i].getName().toString());

			}
			

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}