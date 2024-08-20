package task_on_collection;
import java.util.*;

public class Question6 {
	public static void main(String...strings)
	{
		 	HashSet<String> set = new HashSet<String>();
	        set.add("1");
	        set.add("13");
	        set.add("27");
	        set.add("87");
	        set.add("19");
	        System.out.println("Hash Set Contains :" + set);
	        String arr[]=new String[set.size()];
	        int i=0;
	        for(String str:set)
	        {
	        	arr[i++]=str;
	        }
	        
	        System.out.println("Array value");
	        for(int j=0;j<arr.length;j++)
	        {
	        	System.out.println(arr[j]);
	        }
	}
}
