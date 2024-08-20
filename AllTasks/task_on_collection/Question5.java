package task_on_collection;
import java.util.*;

public class Question5 {
	public static void main(String...strings)
	{
		//method -1
		LinkedList<Integer> ll=new LinkedList<>();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			 ll.add(i);
		}
		
		
		for(int i=0;i<ll.size();i++)
		{
			int a=ll.get(i);
			al.add(a);
		}
		System.out.println("ArrayList Values are "+al);
		
		
		//method 2
		Iterator<Integer> itr=ll.iterator();
		while(itr.hasNext())
		{
			int b=itr.next();
			al.add(b);
			
		}
		
		//method 3
		ArrayList<Integer> al3=new ArrayList<>(ll);
		System.out.println(al);
	}
}
