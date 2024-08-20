package task_on_collection;
import java.util.*;


public class Question7 {
	public static void main(String...strings)
	{
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			 al.add(i);
		}
		for(int i=0;i<al.size()/2;i++)
		{
			int a=al.get(i);
			int b=al.get(al.size()-i);
			al.add(i,b);
			al.add(al.size()-i,a);
		}
		System.out.println(al);
		
	}
}