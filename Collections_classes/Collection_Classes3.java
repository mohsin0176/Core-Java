import java.util.Enumeration;
import java.util.Vector;

public class VectorTest5
{
	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<String>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("E");
        
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
        	System.out.print(e.nextElements()+"");
        }	
	}
}