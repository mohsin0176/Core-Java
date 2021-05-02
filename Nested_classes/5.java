class outer
{
	private int a;
	Outer()
	{
		a=10;
	}
	public static class Inner
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
		System.out.println("a="+a);
	}
}

class NestedCls4
{
	public static void main(String args[])
	{
		Outer otr=new Outer();
		Outer.Inner inr=new Outer.Inner();
		otr.showOuter();
		inr.showInner();
	}
}