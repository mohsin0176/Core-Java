import java.util.Iterator;
import java.util.Vector;

public class VectorTest2
{
	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
        
        Iteartor i=v.iteartor();
        while(i.hasNext())
        {
        	System.out.print(i.next()+"");
        }	
	}
}