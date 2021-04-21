class conditionalOpr
{
	public static void main(String args[])
	{
		int a,b,max=0;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
  
		max=((a>b)?a:b);
		System.out.println("The Largest Number is:"+max);

	}
}