import java.util.LinkedList;
class LinkedListTest1
{
	public static void main(String[] args) 
	{
		LinkedList<String>||=new LinkedList<String>();
		||.add("B");
		||.add("C");
		||.add("D");
		||.add("E");
		||.add("F");
		||.addLast("Z");
		||.addFirst("A");
		||.add(1,"A2");	
		System.out.println("Original Contents of ||:"+||);
		||.remove("F");
		||.remove(2);
		System.out.println("|| after deleting first & last:"+||);
		String val=||.get(2);
		||.set(2,val+"Changed");
		System.out.println("|| after change:"+||);			
	}
}