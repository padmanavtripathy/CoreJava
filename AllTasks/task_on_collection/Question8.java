package task_on_collection;
import java.util.*;

public class Question8 {
	public static void main(String...strings)
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		String str[]= {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		for(int i=0;i<str.length;i++)
		{
			tm.put(arr[i],str[i]);
		}
		System.out.println(tm.entrySet());
	}
}
