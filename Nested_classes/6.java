class Outer
{
	int outer_x=100;
	void test()
	{
		for (int i=0;i<5 ;i++ ) 
		{
			class Inner
			{
				void display()
				{
					System.out.println("outer_x:"+outer_x);
				}
			}
			
			Inner inr=new inner();
			inr.display();
		}
	}
}

class nestedCls20
{
	public static void main(String[] args) 
	{
	 Outer otr=new Outer();
	 otr.test();	
	}
}