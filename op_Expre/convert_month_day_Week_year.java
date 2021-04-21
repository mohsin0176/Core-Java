class ArithOpr
{
	public static void main(String arg[])
	{
		
		int days,years,months,weeks;
		days=Integer.parseInt(args[0]); 

		years=days/365;
		days=days%365;
		months=days/30;
		days=days%30;
		weeks=days/7;
		days=days%7;
		System.out.println("Years",+years);
		System.out.println("Months",+months );
		System.out.println("Weeks",+weeks );
		System.out.println("Days",+days );
	}
}