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

class ReflectionTest4
{
	public static void main(String[] args) 
	{
		try
		{
			Class c=Class.forName("Rectangle");
			Class sc=c.getSuperclass();
			System.out.println("The name of SuperClass:"+sc.getName());
			Method sm[]=sc.getDeclaredMethods();
			System.out.println("The SuperClass Has");
			for (int i=0;i<sm.length ;i++ ) 
			{
				System.out.println("Methods Of Signature"+sm[i].toString());
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}