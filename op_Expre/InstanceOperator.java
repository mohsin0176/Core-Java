class ABC
{
	ABC()
	{
		System.out.println("Object Created");
	}
}
class XYZ
{
	XYZ()
	{
		System.out.println("Object Created");
	}
}

public class OpInstanceOf
{
	public static void main(String args[])
	{
		ABC a=new ABC();
		if (a instanceof ABC) 
		{
			System.out.println("a is instanceof class ABC");
		}
		else
		{
			System.out.println("a is not instanceof class ABC");
		}

		if (a instanceof XYZ) 
		{
			System.out.println("a is instanceof class XYZ");
		}
		else
		{
			System.out.println("a is not instanceof class XYZ");
		}
	}
}
