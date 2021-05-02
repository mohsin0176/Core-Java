import java.lang.reflect.*;

class Shape
{
	double x,y;

	void area()
	{
		System.out.println("Area :: Unknown");
	}
}

class Rectangle extends Shape
{
	Rectangle(double l,double b)
	{
		x=l;
		y=b;
	}
	void area()
	{
		double ar=y*y;
		System.out.println("Area of  Rectangle:"+ar);
	}
}
class Triangle extends Shape
{
	Triangle(double b,double h)
	{
		x=b;
		y=h;
	}
	void area()
	{
		double ar=(1/2)*y*y;
		System.out.println("Area of  Triangle:"+ar);
	}
}
class ReflectionTest2
{
	public static void main(String[] args) 
	{
		try
		{
			Class c=Class.forName("Rectangle");
			Method m[]=c.getDeclaredMethods();
			System.out.println("Methods Of Rectangle");
			for (int i=0;i<m.length ;i++ ) 
			{
				System.out.println("Methods Of Signature"+m[i].toString());

			}
			c=Class.forName("Triangle");
			m=c.getDeclaredMethods();
			System.out.println("Methods of Triangle");
			for (int i=0;i<m.length ;i++ ) 
			{
				System.out.println("Methods Of Signature"+m[i].toString());

			}

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}