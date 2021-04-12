public class IfExample 
{
	public static void main(String[] args)
	{
		int marks=40;
		if (marks<=40 && marks>=30) 
		{
			System.out.println("Possible");
		} 
		else if (marks<=50 && marks>=40) 
		{
			System.out.println("Age is Medical");
		}
		else if (marks<=60 && marks>=50) 
		{
			System.out.println("Age is Treatment");
		}
		else if (marks<=70 && marks>=60) 
		{
			System.out.println("Age is Observed");
		}
		else
		{
			System.out.println("Age is Okay");
		}
		
	}
}