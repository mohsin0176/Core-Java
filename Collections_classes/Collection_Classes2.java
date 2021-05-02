import java.util.Stack;

public class StackTest5
{
    public static void main(String[] args) 
    {

    	Stack<String> s=new Stack<String>();
    	s.push("A");
    	s.push("B");
    	s.push("C");
        System.out.println("Next:"+s.peek());
        s.push("D");
        System.out.println(s.pop());
        s.push("E");
        s.push("F");

        int pos=s.search("E");
        if (pos>=1) 
        {
        	System.out.println("Element Found at Position:"+pos);
        }
        else
        {
        	System.out.println("Element Not Found");
        }
        System.out.println(s);
		
	}
}