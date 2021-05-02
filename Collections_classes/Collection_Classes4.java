import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1
{
	 
	public static void main(String[] args) throws Exception
	{
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(2,"M");	
		System.out.println(list);	
	}
}