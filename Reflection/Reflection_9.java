import java.lang.reflect.*;

class Shape
{
	void draw()
	{
		System.out.println("Drawing Shape.");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}

class ReflectionTest3
{
	public static void main(String[] args) 
	{
		try
		{
			Class c=Class.forName("Rectangle");
			Class sc=c.getSuperclass();
			System.out.println("The name of SuperClass:"+sc.getName());
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}