import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest4
{
	 
	public static void main(String[] args)  
	{
		ArrayList<String> aList=new ArrayList<String>();
		alist.add("1");
		alist.add("2");
		alist.add("3");
		alist.add("4");
		alist.add("5");	
		ListIterator<String> listltr=aList.listIteartor();
		System.out.print("Elements are :");	
		while(listltr.hasNext())
		{
			System.out.print(listltr.next()+"");
		}
	}
}