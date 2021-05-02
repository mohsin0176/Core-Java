class Outer
{
	class Inner
	{
		private int x=10;
		public int getX()
		{
			return x;
		}
	}
	public Inner createInner()
	{
		return new Inner();
	}

	public void show()
	{
		Inner inr=createInner();
		System.out.println("x:"+inr.getX());
	}
}

class NestedCls9
{
	public static void main(String[] args) 
	{
		Outer otr=new Outer();
		otr.show();
		
	}
}