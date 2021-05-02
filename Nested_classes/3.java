class outer
{
	private int a;
	Outer()
	{
		a=10;
	}
	public class Inner
	{
      private int b;
      Inner()
      {
      	b=20;
      }
      void showInner()
      {
      	System.out.println("b="+b);
      }
	}

	void showOuter()
	{
		Inner inr=new Inner();
		System.out.println("a="+a);
		inr.showInner();
		 
	}
}

class NestedCls3
{
	public static void main(String args[])
	{
		Outer otr=new Outer();
		otr.showOuter();
		 
	}
}