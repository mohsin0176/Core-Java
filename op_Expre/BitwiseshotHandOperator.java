class BitWiseAssign
{
	public static void main(String args[])
	{
	    int a=13;
		System.out.println("a=:"+a);
		a&=4;
		System.out.println("a&:"+a);
		a|=3;
		System.out.println("a|:"+a);
		a^=8;
		System.out.println("a^:"+a);
		a<<=3;
		System.out.println("a<<:"+a);
		a>>=2;
		System.out.println("a>>:"+a);
		a>>>=3;
		System.out.println("a>>>:"+a);

	}
}