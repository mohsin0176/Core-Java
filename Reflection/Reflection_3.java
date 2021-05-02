import java.lang.reflect.*;

class Rectangle
{
	private double l,b;
	protected char c;
	public int i;
	float f;
    
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

 
class ReflectionField
{
	public static void main(String[] args) 
	{
		try
		{
			Class c=Class.forName("Rectangle");
			Field f[]=c.getDeclaredFields();
			System.out.println("Fields Of Rectangle");
			for (int i=0;i<f.length ;i++ ) 
			{
				System.out.println("Fields Of Signature"+f[i].toString());

			}
			

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}